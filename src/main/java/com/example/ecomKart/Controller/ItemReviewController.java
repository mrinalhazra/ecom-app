package com.example.ecomKart.Controller;

import com.example.ecomKart.Entity.ItemReviews;
import com.example.ecomKart.service.ItemReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/review")
public class ItemReviewController {

    @Autowired
    ItemReviewService itemReviewService;

    @PostMapping("/save")
    public void saveReview(@RequestBody ItemReviews itemReviews){
        itemReviewService.save(itemReviews);
    }
}
