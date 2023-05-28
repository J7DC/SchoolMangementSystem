package com.jdc.schoolMgntSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//@ComponentScan
//@EnableWebMvc
@SpringBootApplication
public class SchoolMgntSystemApplication  {
	
	public static void main(String[] args) {
		SpringApplication.run(SchoolMgntSystemApplication.class, args);
		System.out.println("Server is up!!!");
		
		 
	}

}
