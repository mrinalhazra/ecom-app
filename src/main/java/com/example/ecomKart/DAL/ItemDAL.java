package com.example.ecomKart.DAL;

import com.example.ecomKart.Entity.Item;

public interface ItemDAL {

    Item getItemById(int id);

    void saveItem(Item item);

    void deleteItem(int id);

    void updateItem(Item updatedItem);
}
