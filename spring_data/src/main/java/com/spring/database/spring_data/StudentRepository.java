package com.spring.database.spring_data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long>{
	public List<Student> findByLastName(String lastName);
}
