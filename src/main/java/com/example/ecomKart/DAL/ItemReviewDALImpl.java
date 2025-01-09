package com.example.ecomKart.DAL;

import com.example.ecomKart.Entity.ItemReviews;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.parser.Entity;

@Repository
public class ItemReviewDALImpl implements ItemReviewDAL{

    @Autowired
    EntityManager entityManager;

    @Override
    public void saveItem(ItemReviews itemReviews) {
        Session session = entityManager.unwrap(Session.class);
        session.save(itemReviews);
    }
}
