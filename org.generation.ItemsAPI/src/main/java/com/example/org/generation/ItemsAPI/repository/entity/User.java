package com.example.org.generation.ItemsAPI.repository.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Item {
    package org.generation.ItemsAPI.repository.entity;

       import javax.persistence.Entity;
       import javax.persistence.GeneratedValue;
       import javax.persistence.GenerationType;
       import javax.persistence.Id;

    @Entity
    public class User
    {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private Integer userId;

        private String firstName;
        private String lastName;
        private Integer age;
        private String email;
        private String password;
        private String place;
        private String phone;
        private String gender;
        private String work;

        public User(){

        }
        public User(String firstName, String lastName, Integer age, String email, String password, String place, String phone, String gender, String work) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.email = email;
            this.password = password;
            this.place = place;
            this.phone = phone;
            this.gender = gender;
            this.work = work;
        }


           2. Create your repository interface to access the `Item` entity data under the repository package:

    For example:

            ```java
    package org.generation.ItemsAPI.repository;

    import org.generation.ItemsAPI.repository.entity.Item;
    import org.springframework.data.jpa.repository.JpaRepository;

    // This will be AUTO IMPLEMENTED by Spring into a Bean called itemRepository
    // CRUD refers Create, Read, Update, Delete
    public interface ItemRepository extends JpaRepository<Item, Integer>
    {
    }
   ```

           3. Create a REST Controller to test your code inside a new package `controller` called ItemController:

            ```java
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
    }
}
