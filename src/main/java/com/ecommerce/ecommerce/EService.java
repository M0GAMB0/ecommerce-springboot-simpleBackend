package com.ecommerce.ecommerce;

import com.ecommerce.ecommerce.models.Category;
import com.ecommerce.ecommerce.models.Product;
import com.ecommerce.ecommerce.models.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

@Service
public class EService {
    ERepository eRepo=new ERepository();
    public void makeOrder(Integer userId, Category category){
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


}
