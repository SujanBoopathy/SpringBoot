package com.sujan.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {
    @Bean("bean1")
	public HelloWorld helloWorld(){
		return new HelloWorld("Sujan Boopathy");
	}

	@Bean
	public HelloWorld helloWorld2(){
		return new HelloWorld("Saubali");
	}
	@Bean
	@Primary
	public HelloWorld helloWorld3(){
		return new HelloWorld("Sara");
	}
}
