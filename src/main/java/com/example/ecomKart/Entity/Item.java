package com.example.ecomKart.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "item")
public class Item {
    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;

    @Column(name = "item_name")
    private String name;

    @Column(name = "item_description")
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    private ItemDetails itemDetails;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<ItemReviews> itemReviews;


    public ItemDetails getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(ItemDetails itemDetails) {
        this.itemDetails = itemDetails;
    }

    public List<ItemReviews> getItemReviews() {
        return itemReviews;
    }

    public void setItemReviews(List<ItemReviews> itemReviews) {
        this.itemReviews = itemReviews;
    }
}
