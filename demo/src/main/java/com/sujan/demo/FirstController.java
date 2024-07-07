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

    @PostMapping("/post")
    public String post(
            @RequestBody String message
    ){
        return "Data received an message is "+message;
    }
}
