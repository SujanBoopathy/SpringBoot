package com.spring.database.spring_data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepo) {
		return args -> {
			Student sujan = new Student("sujan","boopathy",21,"sujan.ab@gmail.com");
			studentRepo.save(sujan);
		};
	}

}
