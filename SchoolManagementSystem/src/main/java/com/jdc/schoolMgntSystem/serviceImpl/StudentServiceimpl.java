package com.jdc.schoolMgntSystem.serviceImpl;


import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jdc.schoolMgntSystem.dao.StudentRepository;
import com.jdc.schoolMgntSystem.exception.BusinessException;
import com.jdc.schoolMgntSystem.model.StudentProfile;
import com.jdc.schoolMgntSystem.model.StudentProfileDto;
import com.jdc.schoolMgntSystem.service.IStudentService;

import ch.qos.logback.classic.Logger;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class StudentServiceimpl implements IStudentService {
	
	private static final Logger log = (Logger) LoggerFactory.getLogger(StudentServiceimpl.class);
	@Autowired
	private StudentRepository studentRepo;
	

	@Override
	public void saveStudent(StudentProfile student) {
		studentRepo.save(student);
		
	}
	
	@Override
	public void  updateStudent(String userId,StudentProfileDto student) throws BusinessException, ObjectNotFoundException{
		if(userId != null){
		StudentProfile newStudent = findStudentByuserId(userId);

			newStudent.setAddress(student.getAddress());
			newStudent.setAge(student.getAge());
			newStudent.setContactNumber(student.getContactNumber());
			newStudent.setEmail(student.getEmail());
			newStudent.setFatherName(student.getFatherName());
			newStudent.setFirstName(student.getFirstName());
			newStudent.setImage(student.getImage());
			newStudent.setLastName(student.getLastName());
			newStudent.setRollNumber(student.getRollNumber());
			newStudent.setSex(student.getSex());
			studentRepo.save(newStudent);
		}
	System.out.println("Student edited");
		
	}

	@Transactional(readOnly = true)
	public StudentProfile findStudentByuserId(String userId) throws ObjectNotFoundException {

		StudentProfile newStudent = studentRepo.findByUserId(userId);
		if (newStudent!= null)
		{
			return newStudent;
		} else {
			log.info("Either notification id not present or is Deleted");
			throw new ObjectNotFoundException("Requested Object not available in the system");
		}
	}

	public StudentProfile getStudentById(long id) {
		return studentRepo.findById(id).orElse(null);
	}

	}
	
