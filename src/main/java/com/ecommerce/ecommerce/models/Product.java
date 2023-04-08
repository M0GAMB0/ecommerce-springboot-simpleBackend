package com.ecommerce.ecommerce.models;

import java.util.UUID;

public class Product {
    private String productId;
    private String name;
    private Category category;
    private int price;

    public Product( String name, Category category, int price) {
        this.productId = UUID.randomUUID().toString();
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

//    public void setProductId(int productId) {
//        this.productId = productId;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
