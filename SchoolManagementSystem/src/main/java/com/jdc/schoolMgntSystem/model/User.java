package com.jdc.schoolMgntSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "USER")
public class User {

	@Id
	@Column(name = "ID", nullable = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;

	@Column(name = "FIRST_NAME", nullable = true)
	private String firstName;

	@Column(name = "LAST_NAME", nullable = true)
	private String lastName;

	@Column(name = "USERID", nullable = true)
	private String userId;

	@Column(name = "PASSWORD", nullable = true)
	private String password;

	@Column(name = "CONFIRM_PASSWORD", nullable = true)
	private String confirmPassword;

	@CreatedDate
	@Column(name = "CREATED_DATE", nullable = true)
	private LocalDate createdDate;
	
	@Column(name = "ROLE", nullable = true)
	private String role;

}
