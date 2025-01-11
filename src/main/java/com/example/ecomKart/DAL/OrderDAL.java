package com.example.ecomKart.DAL;

import com.example.ecomKart.Entity.Order;

public interface OrderDAL {
    Order getById(int id);

    void save(Order order);

    void delete(int id);
}
