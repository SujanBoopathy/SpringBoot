package com.sujan.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private final HelloWorld helloWorld;

// Field injection -
//    @Autowired
//    private HelloWorld helloWorld

//    Method injection -
//    @Autowired
//    public void injectDependencies(
//            HelloWorld helloWorld
//    ){
//        this.helloWorld = helloWorld;
//    }

    public MyService(HelloWorld helloBean) {
        this.helloWorld = helloBean;
    }


    public String getAbout(){
        return "My Service : About myself : "+ helloWorld.sayHello();
    }
}
