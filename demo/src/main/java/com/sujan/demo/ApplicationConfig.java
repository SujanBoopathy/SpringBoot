package com.sujan.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class ApplicationConfig {
    @Bean
	@Primary
	public HelloWorld helloWorld(){
		return new HelloWorld("Sujan Boopathy");
	}

	@Bean
	public HelloWorld helloWorld2(){
		return new HelloWorld("Saubali");
	}
	@Bean("bean1")
	public HelloWorld helloWorld3(){
		return new HelloWorld("Sara");
	}
}
