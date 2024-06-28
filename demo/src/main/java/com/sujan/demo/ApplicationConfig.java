package com.sujan.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
	@Qualifier("bean1")
	public HelloWorld helloWorld(){
		return new HelloWorld("Sujan Boopathy");
	}

	@Bean
	@Qualifier("bean2")
	public HelloWorld helloWorld2(){
		return new HelloWorld("Saubali");
	}
}
