package com.jdc.schoolMgntSystem.service;

import org.springframework.stereotype.Service;

import com.jdc.schoolMgntSystem.exception.BusinessException;
import com.jdc.schoolMgntSystem.model.StudentProfile;
import com.jdc.schoolMgntSystem.model.StudentProfileDto;

import javassist.tools.rmi.ObjectNotFoundException;
@Service
public interface IStudentService {
	
	public void saveStudent(StudentProfile student);
	public void updateStudent(String userId,StudentProfileDto student) throws BusinessException,ObjectNotFoundException;
	public StudentProfile getStudentById(long id);

	}
