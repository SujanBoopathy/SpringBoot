package com.spring.database.spring_data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student,Long>{
	public List<Student> findByLastName(String lastName);
	public List<Student> findByFirstNameContaining(String name);
	public List<Student> findByGuardianName(String name);
	public List<Student> findByFirstNameAndLastName(String firstName, String lastName);
	
	@Query("select s from Student s where s.email = ?1")
	public Student getStudentByEmailId(String emailId);
}
