package com.jdc.schoolMgntSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jdc.schoolMgntSystem.model.Registration;
import com.jdc.schoolMgntSystem.model.User;
import com.jdc.schoolMgntSystem.service.IUserService;
import com.jdc.schoolMgntSystem.serviceImpl.UserMapper;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

	@Autowired
	private IUserService userService;

	public UserRegistrationController(IUserService userService) {
		super();
		this.userService = userService;
	}

	@ModelAttribute("user")
	public Registration userRegistration() {
		return new Registration();
	}

	@GetMapping("")
	public String showRegistrationForm() {
		return "userregistration";
	}

	@PostMapping("")
	public String registerUserAccount(@ModelAttribute("user") Registration registration) {
	
		userService.save(registration);
		return "redirect:/login";
	}
	
	
}
