package com.spring.database.spring_data;

import jakarta.persistence.Column;
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
	public Student( String firstName, String lastName, String email, int age, String guardianName,
			String guardianMobileNo, String guardianEmail) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
		this.guardianName = guardianName;
		this.guardianMobileNo = guardianMobileNo;
		this.guardianEmail = guardianEmail;
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
			name = "id",
			updatable = false
	)
	private Long id;
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
	@Column(
			name="guardian_name", 
			nullable= false
	)
	private String guardianName;
	@Column(
			name="guardian_mobile", 
			nullable= false
	)
	private String guardianMobileNo;
	@Column(
			name="guardian_email",
			nullable= false
	)
	private String guardianEmail;
}
