package com.jdc.schoolMgntSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jdc.schoolMgntSystem.exception.ResourceNotFoundException;
import com.jdc.schoolMgntSystem.model.Login;
import com.jdc.schoolMgntSystem.model.Registration;
import com.jdc.schoolMgntSystem.service.IUserService;
@Controller
@RequestMapping("/login")
public class UserLoginController {


		
	@Autowired
		private IUserService userService;

		/*public UserRegistrationController(IUserService userService) {
			super();
			this.userService = userService;
		}*/
		
		@ModelAttribute("logindata")
	    public Login userLogin() {
	        return new Login();
	    }
		
		@GetMapping("")
		public String showLoginForm() {
			return "login";
		}
		@PostMapping("")
		public  String  loginUserAccount(@ModelAttribute("logindata") Login login) throws ResourceNotFoundException {
			String response = userService.login(login);
			
	    	//if(response.equals("success")){
	    		if(response.equals("student"))
	    		return "redirect:/student";
	    		else if(response.equals("teacher"))
	    		return "redirect:/teacher";	
	             else if(response.equals("staff"))
	    		return "redirect:/staff";	
	             else 
	    	      return "redirect:/login/welcome";
	    	
	    	//return null;
	}
		
		
		@GetMapping("/teacher")
		public String getTeacher(){
			return "teacher";
		}
		
		@GetMapping("/staff")
		public String getStaff(){
			return "staff";
		}
		
		@GetMapping("/welcome")
		public String getwelcome(){
			return "welcome";
		}
}
