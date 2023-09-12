package com.jdc.schoolMgntSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.jdc.schoolMgntSystem.exception.ResourceNotFoundException;
import com.jdc.schoolMgntSystem.model.Login;
import com.jdc.schoolMgntSystem.service.IUserService;
@RestController
@RequestMapping("/login")
public class UserLoginController {

	@Autowired
	private IUserService userService;

	@RequestMapping(value="/userlogin", method= RequestMethod.POST)
	public ResponseEntity < String >  login(@RequestBody Login login)throws ResourceNotFoundException{
		String response = userService.login(login);
		if(response.equals("failure")){
			throw new ResourceNotFoundException("Login body  not found  :: " );
		}
		else{
			return ResponseEntity.ok().body(" LOGIN SUCCESS");
		}
	}


}
