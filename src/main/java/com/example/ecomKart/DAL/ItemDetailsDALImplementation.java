package com.example.ecomKart.DAL;

import com.example.ecomKart.Entity.ItemDetails;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ItemDetailsDALImplementation implements ItemDetailsDAL{

    @Autowired
    EntityManager entityManager;

    @Override
    public void delete(int id) {
        Session session = entityManager.unwrap(Session.class);
        ItemDetails itemDetails = session.get(ItemDetails.class, id);
        session.delete(itemDetails);
    }
}
