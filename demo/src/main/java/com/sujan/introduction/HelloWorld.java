package com.sujan.introduction;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    private String name;

    public HelloWorld(String name){
        this.name = name;
    }
    public String sayHello(){
        System.out.println("hello world!, ===> i am "+name);
        return "hello world!, ===> i am "+name;
    }
}
