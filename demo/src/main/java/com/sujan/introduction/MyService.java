package com.sujan.introduction;

import com.sujan.introduction.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private final HelloWorld helloWorld;
    private Environment environment;


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
    @Autowired
    public void setEnvironment(Environment env){
        this.environment = env;
    }

    public String getJavaVersion(){
        return environment.getProperty("java.version");
    }
    public String getAbout(){
        return "My Service : About myself : "+ helloWorld.sayHello();
    }

    public String getOsName() {
        return environment.getProperty("os.name");
    }

    public String readCustomProp() {
        return environment.getProperty("my.custom.property");
    }
}
