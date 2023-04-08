package com.ecommerce.ecommerce;

import com.ecommerce.ecommerce.models.Category;
import com.ecommerce.ecommerce.models.Product;
import com.ecommerce.ecommerce.models.User;

import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ERepository {
    HashMap<Integer, User> users=new HashMap<>();
    HashMap<String,Product> products=new HashMap<>();
    HashMap<Integer, List<Product>> shoppingCart;

    public ERepository() {

    }
    public void addUser(User user){
        users.put(user.getUserId(),user);
    }
    public void addProduct(Product product){
        products.put(product.getProductId(),product);
    }
    public void addProduct(String name, Category category, int price){
        Product p=new Product(name,category,price);
        products.put(p.getProductId(),p);
    }





}
