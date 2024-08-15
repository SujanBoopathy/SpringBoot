package com.spring.database.spring_data;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name="Student")
@Table( name="student", uniqueConstraints = {
		@UniqueConstraint(name="student_email_unique",columnNames= "email")
})
public class Student {
	public Student() {
		
	}
	public Student( String firstName, String lastName, String email, int age,Guardian guardian) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
		this.guardian = guardian;
	}
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
			name = "student_id",
			updatable = false
	)
	private Long studentId;
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
			columnDefinition = "TEXT"
	)
	private String email;
	
	@Column( 
			name = "age",
			nullable = false
	)
	private int age;
	
	@Embedded
	private Guardian guardian;
//	@Column(
//			name="guardian_name", 
//			nullable= false
//	)
//	private String guardianName;
//	@Column(
//			name="guardian_mobile", 
//			nullable= false
//	)
//	private String guardianMobileNo;
//	@Column(
//			name="guardian_email",
//			nullable= false
//	)
//	private String guardianEmail;

	@Override
	public String toString() {
		return "Student [id=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", age=" + age + ", guardian=" + guardian + "]";
	}
}
