package com.spring.database.spring_data;

import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class Teacher {
	private long teacherId;
	private String firstName;
	private String lastName;
	private List<Course> courseList;
	
	public Teacher(long teacherId, String firstName, String lastName, List<Course> courseList) {
		super();
		this.teacherId = teacherId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.courseList = courseList;
	}
	
	public Teacher() {
		
	}


	public long getTeacherId() {
		return teacherId;
	}


	public void setTeacherId(long teacherId) {
		this.teacherId = teacherId;
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


	public List<Course> getCourseList() {
		return courseList;
	}


	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	
	
}
