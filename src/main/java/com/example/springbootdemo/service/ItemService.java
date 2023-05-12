package com.example.springbootdemo.service;

import com.example.springbootdemo.repository.entity.Item;

public interface ItemService {
    void save(Item item);

    void delete(int itemId);

    Iterable<Item> all();

    Item findById(int itemId);
}
