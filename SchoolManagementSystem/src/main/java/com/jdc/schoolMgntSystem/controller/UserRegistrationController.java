package com.jdc.schoolMgntSystem.controller;

import com.jdc.schoolMgntSystem.exception.BusinessErrorCode;
import com.jdc.schoolMgntSystem.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.jdc.schoolMgntSystem.model.User;
import com.jdc.schoolMgntSystem.service.IUserService;

@RestController
@RequestMapping("/registration")
public class UserRegistrationController {

	@Autowired
	private IUserService userService;

	public UserRegistrationController(IUserService userService) {
		super();
		this.userService = userService;
	}

	@RequestMapping(value="/register", method= RequestMethod.POST)
	public ResponseEntity < String >  registerUser(@RequestBody User user ) throws BusinessException {
		if(user.getUserId()!=null){
			userService.userRegisrtaion(user);
			return ResponseEntity.ok().body(" Registration done successfully.... !!!");
		}
		else
			throw new BusinessException(BusinessErrorCode.BU_ERR_BAD_INPUT,
					"Request body of Registration not valid!!! ");
	}
	
}
