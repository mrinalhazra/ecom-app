package com.example.ecomKart.service;

import com.example.ecomKart.DAL.ItemReviewDAL;
import com.example.ecomKart.Entity.ItemReviews;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemReviewService {

    @Autowired
    ItemReviewDAL itemReviewDAL;

    @Transactional
    public void save(ItemReviews itemReviews) {
        itemReviewDAL.saveItem(itemReviews);
    }
}
