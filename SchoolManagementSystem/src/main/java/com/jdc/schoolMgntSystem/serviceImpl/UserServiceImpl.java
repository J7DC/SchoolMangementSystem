package com.jdc.schoolMgntSystem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc.schoolMgntSystem.dao.StudentRepository;
import com.jdc.schoolMgntSystem.dao.UserRepository;
import com.jdc.schoolMgntSystem.exception.BusinessErrorCode;
import com.jdc.schoolMgntSystem.exception.BusinessException;
import com.jdc.schoolMgntSystem.exception.ResourceNotFoundException;
import com.jdc.schoolMgntSystem.model.Login;
import com.jdc.schoolMgntSystem.model.User;
import com.jdc.schoolMgntSystem.service.IUserService;

@Service
public class UserServiceImpl  implements IUserService{
	
	/*@Autowired
	private BCryptPasswordEncoder passwordEncoder;*/
	@Autowired
	private StudentRepository studentRepo;
	
	@Autowired
	private UserRepository userRepository;


	@Override
	public void userRegisrtaion(User user) throws BusinessException {
		if(user != null){
			userRepository.save(user);
		}else
			throw new BusinessException(BusinessErrorCode.BU_ERR_REQ_OBJECT_NOT_FOUND, "Requested object not found in system");
	}

	@Override
	public List<User> getUsers() {
		List<User> userlist = userRepository.findAll();
		return userlist;
	}

	@Override
	public User getUser(String id)  throws ResourceNotFoundException {
	User user =  userRepository.findByUserId(id);
		return user;
	}

	@Override
	public String login(Login login)  throws ResourceNotFoundException{
	String userId =	login.getUserName();

		User  user = userRepository.findByUserId(userId);
		String role = user.getRole();
		if(user != null){
	   if  ( login.getUserName().equals(user.getUserId()) && login.getPassword().equals(user.getPassword()))
	   {
		   return role.toString();

	   }
		}
		   return "failure";

	}

	@Override
	public void deleteUser(Long id) throws ResourceNotFoundException {
		userRepository.deleteById(id);
		
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveUser(User user) throws BusinessException {

	}

}
