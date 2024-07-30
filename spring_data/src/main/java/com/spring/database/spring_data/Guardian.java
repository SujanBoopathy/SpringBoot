package com.spring.database.spring_data;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@AttributeOverrides({
	@AttributeOverride(
			name="name",
			column = @Column(name="guardian_name")
	),
	@AttributeOverride(
			name="email",
			column = @Column(name="guardian_email")
	),
	@AttributeOverride(
			name="mobile",
			column = @Column(name="guardian_mobile")
	)
})
public class Guardian {
	String guardianName;
	String guardianEmail;
	String mobileNumber;
	
	public Guardian(String name,String email,String mobile) {
		this.guardianName = name;
		this.guardianEmail = email;
		this.mobileNumber = mobile;
	}
}
