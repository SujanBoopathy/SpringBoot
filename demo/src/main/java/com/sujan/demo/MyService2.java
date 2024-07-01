package com.sujan.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MyService2 {
    private final HelloWorld helloWorld;

    public String getMyCustomProp() {
        return myCustomProp;
    }

    @Value("${my.custom.property}")
    private String myCustomProp;




    public MyService2(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    public String getAbout(){
        return "My Service 2 : About myself : "+ helloWorld.sayHello();
    }


}
