package controller;

public class ItemController {
    @RestController
    @RequestMapping("/item")
    public class ItemController{

        final ItemRepository itemRepository;


        public ItemController(@Autowired ItemRepository itemRepository )
        {
            this.itemRepository = itemRepository;
        }

        @GetMapping
        public Iterable<Item> getItems(){
            return itemRepository.findAll();
        }
        @PostMapping
        public Item save( @RequestBody ItemDto itemDto )
        {
            return itemService.save( new Item( itemDto ) );
        }
        @GetMapping("/{id}")
        public Item findItemById( @PathVariable Integer id ){
            return itemService.findById( id );
        }
        @PutMapping( "/{id}" )
        public Item update( @RequestBody ItemDto itemDto, @PathVariable Integer id )
        {
            Item item = itemService.findById( id );
            item.setName( itemDto.getName() );
            item.setDescription( itemDto.getDescription() );
            item.setImageUrl( itemDto.getImageUrl() );
            return itemService.save( item );
        }

        @DeleteMapping( "/{id}" )
        public void delete( @PathVariable Integer id )
        {
            itemService.delete( id );
        }
    }
}
