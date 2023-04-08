package com.ecommerce.ecommerce;

import com.ecommerce.ecommerce.models.Category;
import com.ecommerce.ecommerce.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EController {
    @Autowired
    EService serv=new EService();
    @PostMapping("/addUser")
    public String makeUser(@RequestBody User user){
        serv.addUser(user);
        return "Registered successfully";
    }
    @PostMapping("/{userId}/{category}")
    public String makeOrder(@PathVariable("userId")Integer userId, @PathVariable("category") Category category){
        serv.makeOrder(userId,category);
        return "Order Done";
    }
}
