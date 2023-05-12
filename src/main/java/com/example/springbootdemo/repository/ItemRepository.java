package com.example.springbootdemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springbootdemo.repository.entity.Item;

public interface ItemRepository extends CrudRepository<Item, Integer>{
    
}
