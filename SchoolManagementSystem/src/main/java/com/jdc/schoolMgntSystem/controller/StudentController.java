package com.jdc.schoolMgntSystem.controller;

import javax.net.ssl.SSLEngineResult.Status;
import javax.servlet.http.HttpServletRequest;

import jdk.jpackage.internal.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jdc.schoolMgntSystem.dao.StudentRepository;
import com.jdc.schoolMgntSystem.exception.BusinessException;
import com.jdc.schoolMgntSystem.exception.ResourceNotFoundException;
import com.jdc.schoolMgntSystem.model.StudentProfile;
import com.jdc.schoolMgntSystem.model.StudentProfileDto;
import com.jdc.schoolMgntSystem.service.IStudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private IStudentService studentService;
	@Autowired
	private StudentRepository studentRepo;

	@ModelAttribute("student")
	public StudentProfile studentLogin() {
		return new StudentProfile();
	}


	@GetMapping("/getStudent")
	public String showStudentProfile(HttpServletRequest request) {
		request.setAttribute("student",studentRepo.findById(4l) );
		Log.info("setting attributes");
		return "student";
	}

	@PostMapping("/createStudent")
	public String saveStudentProfile(@ModelAttribute("student") StudentProfile student) throws ResourceNotFoundException {
		studentService.saveStudent(student);
		return "Student saved";
	}

	@PutMapping(value ="/editStudent",produces = { "application/json;charset=UTF-8" },consumes = {
			"application/json" })
	public ResponseEntity<String> editStudent(@RequestParam String userId,@RequestBody StudentProfileDto  studentbody ) throws Exception{

		studentService.editStudent(userId,studentbody);
		System.out.println("Student updated");
		return new ResponseEntity<>(HttpStatus.OK);

	}


}
