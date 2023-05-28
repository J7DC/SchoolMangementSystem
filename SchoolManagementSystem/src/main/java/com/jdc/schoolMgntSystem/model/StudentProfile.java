package com.jdc.schoolMgntSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "STUDENT")
public class StudentProfile {

	@Id
	@Column(name = "ID", nullable = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;

	/*@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")*/
	@Column(name = "ROLL_NUMBER", nullable = true, unique = true)
	private String rollNumber;

	@Column(name = "FIRST_NAME", nullable = true)
	private String firstName;

	@Column(name = "LAST_NAME", nullable = true)
	private String lastName;

	@Column(name = "FATHER_NAME", nullable = true)
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

	@Column(name = "CONTACT_NUMBER", nullable = true)
	private String contactNumber;

	@Column(name = "USERID", nullable = true)
	private String userId;

	/*@Column(name = "ACADEMIC_INFO", nullable = true)
	private AcademicInfo academicInfo;*/
}
