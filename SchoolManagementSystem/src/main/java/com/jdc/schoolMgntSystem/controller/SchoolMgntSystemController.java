package com.jdc.schoolMgntSystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolMgntSystemController {

	
	   @GetMapping("/welcome")
	   public String get(){
		   return "welcome";
	   }

	   
	 
}
