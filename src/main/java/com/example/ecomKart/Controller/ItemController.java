package com.example.ecomKart.Controller;

import com.example.ecomKart.Entity.Item;
import com.example.ecomKart.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping("/id/{id}")
    public Item getItemById(@PathVariable int id){
        return itemService.getItemById(id);
    }

    @PostMapping("/save")
    public void saveItem(@RequestBody Item item){
        itemService.saveItem(item);
    }

    @DeleteMapping("/delete/id/{id}")
    public void deleteItem(@PathVariable int id){
        itemService.deleteItem(id);
    }

    @PutMapping("/update")
    public void updateItem(@RequestBody Item updatedItem){
        itemService.update(updatedItem);
    }

}
