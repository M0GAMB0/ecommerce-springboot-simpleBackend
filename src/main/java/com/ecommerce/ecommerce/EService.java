package com.ecommerce.ecommerce;

import com.ecommerce.ecommerce.models.Category;
import com.ecommerce.ecommerce.models.PaymentMode;
import com.ecommerce.ecommerce.models.Product;
import com.ecommerce.ecommerce.models.User;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class EService {
    ERepository eRepo=new ERepository();
    public void makeOrder(Integer userId, PaymentMode paymentMode){
        List<Product> orders=new LinkedList<>();
        for(Product p:eRepo.products.values()) {
            if (p.getName().charAt(0) == 'A' || p.getName().charAt(0) == 'a') {
                orders.add(p);
            }
        }
        eRepo.shoppingCart.put(userId,orders);
    }
    public void addUser(User user){
        eRepo.addUser(user);
    }
    public List<User> getAllUsers(){
        List<User> users = new LinkedList<>();
        for(User u:eRepo.users.values()){
            users.add(u);
        }
        return users;
    }
    public void addProduct(String name, String category, int price){
        eRepo.addProduct(name,Category.valueOf(category),price);
    }
    public List<Product> getAllProducts(){
        List<Product> products = new LinkedList<>();
        for(Product u:eRepo.products.values()){
            products.add(u);
        }
        return products;
    }



}
