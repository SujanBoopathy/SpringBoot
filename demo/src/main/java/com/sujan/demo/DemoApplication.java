package com.sujan.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);

//		HelloWorld helloWorld = applicationContext.getBean("helloWorldBean",HelloWorld.class);
//		helloWorld.sayHello();

		MyService myService = applicationContext.getBean(MyService.class);
		System.out.println(myService.getAbout());
	}

}
