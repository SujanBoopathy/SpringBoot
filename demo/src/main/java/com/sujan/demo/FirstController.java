package com.sujan.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {
    @GetMapping("/home")
    public String sayHello(){
        return "Hello from my first controller";
    }

    @GetMapping("/home2")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String sayHello2(){
        return "Hello 2 from my first controller";
    }

    @GetMapping("/home/{user-name}")
    public String sayHello3(
            @PathVariable("user-name") String userName
    ){
        return "Hello "+ userName;
    }
    @GetMapping("/home3")
    public String sayHello4(
            @RequestParam("user-name") String userName,
            @RequestParam("user-role") String role
    ){
        return "Hello "+userName+" , role : "+role;
    }

    @PostMapping("/post")
    public String post(
            @RequestBody String message
    ){
        return "Data received an message is "+message;
    }

    @PostMapping("/order")
    public String order(
            @RequestBody Order order
    ){
        return "Order transaction  :"+order.toString();
    }

    @PostMapping("/order-record")
    public String orderRecord(
            @RequestBody OrderRecord order
    ){
        return "Order transaction  :"+order.toString();
    }
}
