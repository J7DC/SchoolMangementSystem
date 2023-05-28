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
@Table(name = "USER")
public class User {

	@Id
	@Column(name = "ID", nullable = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;

	@Column(name = "USERID", nullable = true)
	private String userId;
	
	@Column(name = "PASSWORD", nullable = true)
	private String password;
	
	@Column(name = "DATE", nullable = true)
	private String date;
	
	@Column(name = "ROLE", nullable = true)
	private String role;

	/*

	@Column(name = "FIRST_NAME", nullable = false)
	private String firstName;

	@Column(name = "LAST_NAME", nullable = false)
	private String lastName;

	@Column(name = "AGE", nullable = false)
	private int age;

	@Column(name = "PLACE", nullable = false)
	private String place;*/

	

	// provide getter setter and toString method

}
