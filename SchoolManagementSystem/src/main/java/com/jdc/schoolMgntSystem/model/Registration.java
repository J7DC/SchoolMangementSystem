package com.jdc.schoolMgntSystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Registration {

	private String firstName;
	private String lastName;
	private String place;
	private int age;
	private String Date;
	private String userId;
	private String password;
	private String role;
	private String cnfPassword;
}
