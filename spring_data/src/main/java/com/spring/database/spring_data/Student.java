package com.spring.database.spring_data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Student {
	@Id
	@SequenceGenerator(
			name  ="student_sequence",
			sequenceName = "student_sequence",
			allocationSize = 1
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "student_sequence"
	)
	@Column(
			name = "id",
			updatable = false
	)
	private long id;
	@Column( 
			name = "first_name",
			nullable = false, 
			columnDefinition = "TEXT"
	)
	private String firstName;
	@Column( 
			name = "last_name",
			nullable = false, 
			columnDefinition = "TEXT"
	)
	private String lastName;
	@Column( 
			name = "email",
			nullable = false, 
			columnDefinition = "TEXT",
			unique = true
	)
	private String email;
	@Column( 
			name = "age",
			nullable = false
	)
	private int age;
	
	public Student(long id, String firstName, String lastName, int age, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
