package com.example.ecomKart.service;

import com.example.ecomKart.DAL.ItemDAL;
import com.example.ecomKart.DAL.OrderDAL;
import com.example.ecomKart.Entity.Item;
import com.example.ecomKart.Entity.Order;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderDAL orderDAL;

    @Autowired
    ItemDAL itemDAL;

    @Transactional
    public Order getOrderById(int id) {
       return orderDAL.getById(id);
    }

    @Transactional
    public void saveOrder(Order order) {
        Order saveOrder = new Order();
        //setting the attibutes in the new order
        saveOrder.setOrderType(order.getOrderType());

        //as we will be sending only the item id from the request. so need to fetch all its info before saving the order
        List<Item> itemList = new ArrayList<>();
        for(Item item : order.getItems()){
            //fetching the whole item info from the db/dal
            Item currentItem = itemDAL.getItemById(item.getId());
            itemList.add(currentItem);
        }
        saveOrder.setItems(itemList);
        orderDAL.save(saveOrder);
    }

    @Transactional
    public void deleteOrder(int id) {
        orderDAL.delete(id);
    }
}
