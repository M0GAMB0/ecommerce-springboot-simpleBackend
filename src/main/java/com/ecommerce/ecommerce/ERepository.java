package com.ecommerce.ecommerce;

import com.ecommerce.ecommerce.models.Product;
import com.ecommerce.ecommerce.models.User;

import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ERepository {
    HashMap<Integer, User> users=new HashMap<>();
    HashMap<Integer,Product> products=new HashMap<Integer, Product>();
    HashMap<Integer, List<Product>> shoppingCart;

    public ERepository() {

    }
    public void addUser(User user){
        users.put(user.getUserId(),user);
    }
    public void addProduct(Product product){
        products.put(product.getProductId(),product);
    }





}
