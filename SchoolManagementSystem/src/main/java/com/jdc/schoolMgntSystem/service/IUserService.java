package com.jdc.schoolMgntSystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jdc.schoolMgntSystem.exception.BusinessException;
import com.jdc.schoolMgntSystem.exception.ResourceNotFoundException;
import com.jdc.schoolMgntSystem.model.Login;
import com.jdc.schoolMgntSystem.model.User;
@Service
public interface IUserService  /*extends UserDetailsService*/ {
	
	public void userRegisrtaion(User user) throws BusinessException;
	public List<User> getUsers();
	public User getUser(String userid) throws ResourceNotFoundException;
	public String login(Login login)  throws ResourceNotFoundException;
	public void deleteUser(Long id)  throws ResourceNotFoundException;
	public User updateUser(User user);

	public void saveUser(User user)throws BusinessException;
	
}
