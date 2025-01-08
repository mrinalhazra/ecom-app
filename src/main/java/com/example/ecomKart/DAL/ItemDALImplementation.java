package com.example.ecomKart.DAL;

import com.example.ecomKart.Entity.Item;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ItemDALImplementation implements ItemDAL {

    @Autowired
    EntityManager entityManager;

    @Override
    public Item getItemById(int id) {
        Session session = entityManager.unwrap(Session.class);
        Item item = session.get(Item.class, id);
        return item;
    }

    @Override
    public void saveItem(Item item) {
        Session session = entityManager.unwrap(Session.class);
        session.save(item);
//        session.update(session);
    }

    @Override
    public void deleteItem(int id) {
        Session session = entityManager.unwrap(Session.class);
        Item itemToDel = getItemById(id);
        session.delete(itemToDel);
    }

    @Override
    public void updateItem(Item updatedItem) {
        Session session = entityManager.unwrap(Session.class);
        //get the current item
        Item currentItem = session.get(Item.class, updatedItem.getId());
        //update the current item
        currentItem.setDescription(updatedItem.getDescription());
        currentItem.setName(updatedItem.getName());
        //update the item
        session.update(currentItem);

    }

}
