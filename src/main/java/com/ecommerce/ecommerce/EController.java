package com.ecommerce.ecommerce;

import com.ecommerce.ecommerce.models.Category;
import com.ecommerce.ecommerce.models.PaymentMode;
import com.ecommerce.ecommerce.models.Product;
import com.ecommerce.ecommerce.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
public class EController {
    @Autowired
    EService serv=new EService();

    //To add User
    @PostMapping("/addUser")
    public String makeUser(@RequestBody User user){
        try{
            serv.addUser(user);
        }
        catch(Exception e){
            return e.getMessage();
        }
        return "Registered Successfully";

    }

    //To add products
    @PostMapping("/addProducts")
    public String addProduct(@RequestParam("name")String name,@RequestParam("category")String category,@RequestParam("price")int price){
        try{
            serv.addProduct(name,category,price);
        }
        catch(Exception e){
            System.out.println("Idhar aaya");
            return e.getMessage();
        }
        return "Product Registered Successfully";
    }

    //Create an Order for all products with name starting with A
    @PostMapping("/makeOrder/{userId}/{paymentMode}")
    public String makeOrder(@PathVariable("userId")Integer userId, @PathVariable("paymentMode")PaymentMode paymentMode ){
        serv.makeOrder(userId,paymentMode);
        return "Order Done";
    }

    // To get all users
    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        List<User> users = new LinkedList<>(serv.getAllUsers());
        return users;
    }

    //To get all products
    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts(){
        List<Product> users = new LinkedList<>(serv.getAllProducts());
        return users;
    }
}
