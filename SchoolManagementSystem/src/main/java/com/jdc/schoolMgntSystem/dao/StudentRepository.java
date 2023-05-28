package com.jdc.schoolMgntSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jdc.schoolMgntSystem.model.StudentProfile;
@Repository
public interface StudentRepository extends JpaRepository<StudentProfile, Long> {
	
	public StudentProfile findByUserId(String userId);

}
