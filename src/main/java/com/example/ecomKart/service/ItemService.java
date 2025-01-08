package com.example.ecomKart.service;

import com.example.ecomKart.DAL.ItemDAL;
import com.example.ecomKart.Entity.Item;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    ItemDAL itemDAL;

    @Transactional
    public void saveItem(Item item) {
        itemDAL.saveItem(item);
    }

    @Transactional
    public Item getItemById(int id) {
        return itemDAL.getItemById(id);
    }

    @Transactional
    public void deleteItem(int id) {
        itemDAL.deleteItem(id);
    }

    @Transactional
    public void update(Item updatedItem) {
        itemDAL.updateItem(updatedItem);
    }
}
