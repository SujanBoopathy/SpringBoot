package com.spring.database.spring_data;

import java.util.List;

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
			
			Student saubali = new Student("saubali", "boopathy","saubali.b@gmail.com", 21,father);
			studentRepo.save(saubali);
			
			String lastName = "boopathy";
			List<Student> studentList = studentRepo.findByLastName(lastName);

			for(Student student : studentList) {				
				System.out.println("Student  :"+student);
			}
			
			Student student = studentRepo.getStudentByEmailId("sujan.ab@gmail.com"); 
			System.out.println(student);
			
//			List<Student> studentList2 = studentRepo.findByFirstNameContaining("suj");
//			System.out.println(studentList2);
//			
//			List<Student> studentList3 = studentRepo.findByGuardianName("boopathy");
//			System.out.println(studentList3);
//			
//			List<Student> studentList4 = studentRepo.findByFirstNameAndLastName("sujan","boopathy");
//			System.out.println(studentList4);
		};
	}

}
