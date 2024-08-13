package com.spring.database.spring_data;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Course {
	@Id
	@SequenceGenerator(
			name = "course_sequence",
			sequenceName = "course_sequence",
			allocationSize = 1
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "course_sequence"
	)
	private int courseId;
	private int credit;
	private String title;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(
			name = "teacher_id",
			referencedColumnName = "teacherId"
	)
	private Teacher teacher;
	
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public Course() {

	}
//	public Course( int credit, String title) {
//		this.credit = credit;
//		this.title = title;
//	}
	
	public Course( int credit, String title,Teacher teacher) {
		this.credit = credit;
		this.title = title;
		this.teacher = teacher;
	}
	
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", credit=" + credit + ", title=" + title + "]";
	}
}
