package com.jdc.schoolMgntSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.schoolMgntSystem.dao.UserRepository;
import com.jdc.schoolMgntSystem.exception.BusinessErrorCode;
import com.jdc.schoolMgntSystem.exception.BusinessException;
import com.jdc.schoolMgntSystem.exception.ResourceNotFoundException;
import com.jdc.schoolMgntSystem.model.Login;
import com.jdc.schoolMgntSystem.model.Registration;
import com.jdc.schoolMgntSystem.model.User;
import com.jdc.schoolMgntSystem.service.IUserService;

@RequestMapping("/api/v1")
@RestController
//@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;
   
    @Autowired
    private IUserService userService;
    
    
    @GetMapping("/users")
    public List < User > getAllUsers() {
        return userService.getUsers();
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity < User > getUserById(@PathVariable(value = "userId") String userId)
    throws ResourceNotFoundException {
        User user = userService.getUser(userId);
        if(user != null){
        	return ResponseEntity.ok().body(user);
        }
           else
        	   throw new ResourceNotFoundException("User not found for this userid :: " + userId);
        //return ResponseEntity.ok().body(user);
    }
    
     @PostMapping("/registration")
    public ResponseEntity < String >  createUser(@RequestBody Registration registration ) throws BusinessException {
    	System.out.println("User saved");
    	if(registration.getUserId()!=null){
         userService.saveUser(registration);
         return ResponseEntity.ok().body(" Registration done successfully.... !!!");
    	}/*else
    	   return ResponseEntity.ok().body(" Registration Failed.... !!! for userId : " + registration.getUserId());*/
     else
    	 throw new BusinessException(BusinessErrorCode.BU_ERR_BAD_INPUT,
					"Request body of Registration not valid!!! ");
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable(value = "id") Long Id ) throws ResourceNotFoundException{
    	if(Id != null){
    		
    		//To do for chk if id does
    	System.out.println("User Deleted");
         userService.deleteUser(Id);
    	}else
    		throw new ResourceNotFoundException("User not found for this Id :: " + Id);
    	
         
    }
   @PostMapping("/login/post")
    public ResponseEntity < String >  login(@RequestBody Login login)throws ResourceNotFoundException{
    	String response = userService.login(login);
    	if(!response.equals("success")){
    	throw new ResourceNotFoundException("Login body  not found  :: " );
    	}
        else{
    		return ResponseEntity.ok().body(" LOGIN SUCCESS");
        }
    }
   
   
}