package com.jdc.schoolMgntSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.schoolMgntSystem.dao.UserRepository;
import com.jdc.schoolMgntSystem.exception.ResourceNotFoundException;
import com.jdc.schoolMgntSystem.model.User;
import com.jdc.schoolMgntSystem.service.IUserService;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
   
    @Autowired
    private IUserService userService;
    
    
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ResponseEntity<List < User >> getAllUsers() throws ResourceNotFoundException {

        List < User > users= userService.getUsers();

        if(users != null){
            return ResponseEntity.ok().body(users);
        }
        else
            throw new ResourceNotFoundException("Users not found");

    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public ResponseEntity < User > getUserById(@PathVariable(value = "userId") String userId)
    throws ResourceNotFoundException {
        User user = userService.getUser(userId);
        if(user != null){
        	return ResponseEntity.ok().body(user);
        }
           else
        	   throw new ResourceNotFoundException("User not found for this userid :: " + userId);
    }
    

    @RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable(value = "id") Long Id ) throws ResourceNotFoundException{
    	if(Id != null){
    		
    	System.out.println("User Deleted");
         userService.deleteUser(Id);
    	}else
    		throw new ResourceNotFoundException("User not found for this Id :: " + Id);
    	
         
    }

   
   
}