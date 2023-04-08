package com.ecommerce.ecommerce.models;

import java.util.List;

public class Order {
    private final int UserId;
    List<Integer> productList;
    PaymentMode paymentMode;

    public Order(int userId, List<Integer> productList, PaymentMode paymentMode) {
        UserId = userId;
        this.productList = productList;
        this.paymentMode = paymentMode;
    }

    public int getUserId() {
        return UserId;
    }


    public List<Integer> getProductList() {
        return productList;
    }

    public void setProductList(List<Integer> productList) {
        this.productList = productList;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }
}
