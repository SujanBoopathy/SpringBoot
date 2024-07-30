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
			Guardian father = new Guardian("boopathy","boopathy123@gmail.com","20293930202");
			Student sujan = new Student("sujan", "boopathy","sujan.ab@gmail.com", 20,father);
			studentRepo.save(sujan);
		};
	}

}
