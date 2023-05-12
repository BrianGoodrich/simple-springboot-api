package com.example.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootdemo.repository.entity.Item;
import com.example.springbootdemo.service.ItemService;


@CrossOrigin("*")
@RestController
public class ItemController {

    private final ItemService itemService;

    public ItemController(@Autowired ItemService itemService){
        this.itemService = itemService;
    }

    @GetMapping("/item")
    public Iterable<Item> getAll(){
        return itemService.all();
    }

    @GetMapping("/item/{id}")
    public Item getItem(@PathVariable int id){

        return itemService.findById(id);
    }

    @PostMapping("/item/post")
    public void newItem(@RequestBody Item item){
        itemService.save(item);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteItem(@PathVariable int id){
        itemService.delete(id);
    }

}

