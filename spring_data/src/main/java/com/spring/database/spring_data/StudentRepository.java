package com.spring.database.spring_data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface StudentRepository extends JpaRepository<Student,Long>{
	public List<Student> findByLastName(String lastName);
	public List<Student> findByFirstNameContaining(String name);
	public List<Student> findByGuardianName(String name);
	public List<Student> findByFirstNameAndLastName(String firstName, String lastName);
	
	@Query("select s from Student s where s.email = ?1")
	public Student getStudentByEmailId(String emailId);
	
	@Query(
			value="select * from student where email = :email",
			nativeQuery = true
	)
	public Student getStudentByEmailIdParam(@Param("email") String emailId);
	
	@Modifying
	@Transactional
	@Query(
		value = "update student set first_name = ?1 where email = ?2",
		nativeQuery = true
	)
	public int updateFirstNameByEmail(String firstName,String email);
}
