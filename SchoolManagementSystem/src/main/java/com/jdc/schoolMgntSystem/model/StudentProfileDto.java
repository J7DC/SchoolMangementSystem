package com.jdc.schoolMgntSystem.model;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentProfileDto {

	private String rollNumber;
	private String firstName;
	private String lastName;
	private String fatherName;
	private String address;
	private int age;
	private String sex;
	private String image;
	private String email;
	private String contactNumber;
	private String role;

}
