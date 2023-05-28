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

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "PROFILE")
public class UserProfile {
	
	@Id
	@Column(name = "ID", nullable = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	
	@Column(name = "FIRSTNAME", nullable = true)
	private String firstName;
	
	@Column(name = "LASTNAME", nullable = true)
	private String lastName;
	
	@Column(name = "FATHERNAME", nullable = true)
	private String fatherName;
	
	@Column(name = "ADDRESS", nullable = true)
	private String address;
	
	@Column(name = "AGE", nullable = true)
	private int age;
	
	@Column(name = "SEX", nullable = true)
	private String sex;
	
	@Column(name = "IMAGE", nullable = true)
	private String image;
	
	@Column(name = "EMAIL", nullable = true)
	private String email;
	
	@Column(name = "CONTACTNUMBER", nullable = true)
	private String contactNumber;
	
	@Column(name = "ROLE", nullable = true)
	private String role;
	
	

		
	}
