package com.sujan.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@PropertySources({
        @PropertySource("classpath:my-custom.properties"),
        @PropertySource("classpath:my-custom-2.properties")
})
public class MyService2 {
    private final HelloWorld helloWorld;

    public String getMyCustomProp() {
        return myCustomProp;
    }

    @Value("${my.user.name}")
    private String myCustomProp;
    @Value("${admin.user.name}")
    private String adminName;

    public String getAdminName() {
        return adminName;
    }

    public MyService2(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    public String getAbout(){
        return "My Service 2 : About myself : "+ helloWorld.sayHello();
    }


}
