package Service;

@Service
public class ItemServiceMySQL implements ItemService
{
    private final ItemRepository itemRepository;

    public ItemServiceMySQL(@Autowired ItemRepository itemRepository )
    {
        this.itemRepository = itemRepository;
    }

    @Override
    public Item save( Item item )
    {
        //TODO implement this method
        return null;
    }

    @Override
    public void delete( int itemId )
    {
        //TODO implement this method
    }

    @Override
    public List<Item> all()
    {
        //TODO implement this method
        return null;
    }

    @Override
    public Item findById( int itemId )
    {
        //TODO implement this method
        return null;
    }
}
