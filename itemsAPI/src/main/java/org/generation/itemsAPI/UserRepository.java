package org.generation.itemsAPI;

import org.generation.ItemsAPI.repository.entity.Item;
import org.generation.itemsAPI.repository.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<user, Integer>{


}
