package com.example.ecomKart.DAL;

import com.example.ecomKart.Entity.Item;
import com.example.ecomKart.Entity.Order;
import jakarta.persistence.EntityManager;
import org.aspectj.weaver.ast.Or;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDALImpl implements OrderDAL{

    @Autowired
    EntityManager entityManager;

    @Override
    public Order getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        Order order = session.get(Order.class, id);
        return order;
    }

    @Override
    public void save(Order order) {
        Session session = entityManager.unwrap(Session.class);
        session.save(order);
    }

    @Override
    public void delete(int id) {
        Session session = entityManager.unwrap(Session.class);
        Order order = session.get(Order.class, id);
        session.delete(order);
    }
}
