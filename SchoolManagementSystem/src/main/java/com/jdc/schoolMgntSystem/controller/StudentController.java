package com.jdc.schoolMgntSystem.controller;

import javax.servlet.http.HttpServletRequest;

import com.jdc.schoolMgntSystem.SchoolMgntSystemApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.jdc.schoolMgntSystem.exception.ResourceNotFoundException;
import com.jdc.schoolMgntSystem.model.StudentProfile;
import com.jdc.schoolMgntSystem.model.StudentProfileDto;
import com.jdc.schoolMgntSystem.service.IStudentService;


@RestController
@RequestMapping("/student")
public class StudentController {

	private static final Logger Log = LoggerFactory.getLogger(SchoolMgntSystemApplication.class);

	@Autowired
	private IStudentService studentService;

	@RequestMapping(value = "/getStudent/{id}", method = RequestMethod.GET)
	public StudentProfile showStudentProfile(HttpServletRequest request, @PathVariable("id") long id) {
		//request.setAttribute("student",studentRepo.findById(id) );
		StudentProfile student= studentService.getStudentById(id);
		Log.info("setting attributes");
		return student;
	}

	@RequestMapping(value="/addStudent", method=RequestMethod.POST)
	public ResponseEntity<String>  saveStudentProfile(@RequestBody  StudentProfile student) throws ResourceNotFoundException {
		studentService.saveStudent(student);
		System.out.println("Student added");
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value="/updateStudent", method=RequestMethod.PUT)
	public ResponseEntity<String> updateStudent(@RequestParam String userId,@RequestBody StudentProfileDto  studentbody ) throws Exception{

		studentService.updateStudent(userId,studentbody);
		System.out.println("Student updated");
		return new ResponseEntity<>(HttpStatus.OK);

	}


}
