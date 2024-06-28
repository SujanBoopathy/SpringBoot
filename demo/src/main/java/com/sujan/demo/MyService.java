package com.sujan.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private final HelloWorld helloWorld;

    public MyService(@Qualifier("bean2") HelloWorld helloBean) {
        this.helloWorld = helloBean;
    }

    public String getAbout(){
        return "My Service : About myself : "+ helloWorld.sayHello();
    }
}
