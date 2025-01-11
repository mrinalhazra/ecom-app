package com.example.ecomKart.Controller;

import com.example.ecomKart.DAL.ItemDAL;
import com.example.ecomKart.Entity.Item;
import com.example.ecomKart.Entity.Order;
import com.example.ecomKart.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderService orderService;



    @GetMapping("/id/{id}")
    public Order getOrderById(@PathVariable int id){
        return orderService.getOrderById(id);
    }

    @PostMapping("/save")
    public void saveOrder(@RequestBody Order order){
        orderService.saveOrder(order);

    }

    @DeleteMapping("/id/{id}")
    public void deleteOrder(@PathVariable int id){
        orderService.deleteOrder(id);
    }

}
