package com.sujan.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
	public HelloWorld helloWorld(){
		return new HelloWorld("Sujan Boopathy");
	}
}
