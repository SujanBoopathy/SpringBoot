package com.sujan.introduction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Collections;

@SpringBootApplication
@ComponentScan(basePackages = "com.sujan.introduction")
public class DemoApplication2 {

//	public static void main(String[] args) {
//		var app = new SpringApplication(DemoApplication2.class);
//		app.setDefaultProperties(Collections.singletonMap("spring.profiles.active","dev"));
////		ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
//
//		var applicationContext = app.run(args);
////		HelloWorld helloWorld = applicationContext.getBean("helloWorldBean",HelloWorld.class);
////		helloWorld.sayHello();
//
////		MyService myService = applicationContext.getBean(MyService.class);
////		System.out.println(myService.getAbout());
////		System.out.println("Java version :" + myService.getJavaVersion());
////		System.out.println("Os :" + myService.getOsName());
////		System.out.println("Custom Prop :" + myService.readCustomProp());
//
//
//		MyService2 myService2 = applicationContext.getBean(MyService2.class);
//		System.out.println("Custom prop from service 2 :" + myService2.getMyCustomProp());
//		System.out.println("Custom prop from service 2 :" + myService2.getAdminName());
//		System.out.println("Custom prop from dev :"+myService2.getMyCustomProperty());
//
//	}

}
