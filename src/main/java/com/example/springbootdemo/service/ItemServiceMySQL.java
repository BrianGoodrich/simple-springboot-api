package com.example.springbootdemo.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootdemo.repository.ItemRepository;
import com.example.springbootdemo.repository.entity.Item;

@Service
public class ItemServiceMySQL implements ItemService {
    
    private final ItemRepository itemRepository;

            public ItemServiceMySQL(@Autowired ItemRepository itemRepository){
                this.itemRepository = itemRepository;
            }

            public void save(Item item){
                 itemRepository.save(item);
            }

            public void delete(int itemId){
                itemRepository.deleteById(itemId);
            }
  
            public Iterable<Item> all() {
                return itemRepository.findAll();
            }

            public Item findById(int itemId) {
                Optional<Item> item = itemRepository.findById(itemId);
                return item.orElse(null);
            }
}
