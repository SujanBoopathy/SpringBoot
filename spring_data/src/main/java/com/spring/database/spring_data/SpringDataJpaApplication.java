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
	CommandLineRunner commandLineRunner(StudentRepository studentRepo
			,CourseMaterialRepository courseMaterialRepo
			,CourseRepository courseRepo
			,TeacherRepository teacherRepo
		) {
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
			
			
			
			System.out.println(studentRepo.updateFirstNameByEmail("suju", "sujan.ab@gmail.com"));
			
			Student student = studentRepo.getStudentByEmailId("sujan.ab@gmail.com"); 
			System.out.println(student);
			
			Student student2 = studentRepo.getStudentByEmailIdParam("sujan.ab@gmail.com"); 
			System.out.println(student2);
			
//			List<Student> studentList2 = studentRepo.findByFirstNameContaining("suj");
//			System.out.println(studentList2);
//			
//			List<Student> studentList3 = studentRepo.findByGuardianName("boopathy");
//			System.out.println(studentList3);
//			
//			List<Student> studentList4 = studentRepo.findByFirstNameAndLastName("sujan","boopathy");
//			System.out.println(studentList4);
			
			
			processCourse(courseMaterialRepo,courseRepo,teacherRepo,student2);
		};
	}
	
	public void processCourse(CourseMaterialRepository courseMaterialRepo,CourseRepository courseRepo,TeacherRepository teacherRepo,Student s) {
//		Course course = new Course(5,"DSA");
		
//		CourseMaterial courseMaterial = new CourseMaterial("google.com",course);
		
//		courseMaterialRepo.save(courseMaterial);
		
		List<CourseMaterial> courseMaterials = courseMaterialRepo.findAll();
		System.out.println(courseMaterials);
		
		List<Course> courseList = courseRepo.findAll();
		System.out.println(courseList);
		
		Teacher sujan = new Teacher("saubali","boopathy");
		Course course2 = new Course(5,"C++",sujan,List.of(s));
		courseRepo.save(course2);
		
//		Teacher teacher = new Teacher("sujan","boopathy",List.of(course2));
//		teacherRepo.save(teacher);
//		
//		List<Teacher> teachers = teacherRepo.findAll();
//		System.out.println(teachers);
		
	}

}
