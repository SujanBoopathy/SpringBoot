package com.sujan.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private final HelloWorld helloWorld;
    @Autowired
    public MyService(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    public String getAbout(){
        return "My Service : About myself : "+ helloWorld.sayHello();
    }
}
