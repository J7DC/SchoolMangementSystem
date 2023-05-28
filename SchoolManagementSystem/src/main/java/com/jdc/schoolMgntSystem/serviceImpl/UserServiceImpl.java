package com.jdc.schoolMgntSystem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.jdc.schoolMgntSystem.dao.StudentRepository;
import com.jdc.schoolMgntSystem.dao.UserRepository;
import com.jdc.schoolMgntSystem.exception.BusinessErrorCode;
import com.jdc.schoolMgntSystem.exception.BusinessException;
import com.jdc.schoolMgntSystem.exception.ResourceNotFoundException;
import com.jdc.schoolMgntSystem.model.Login;
import com.jdc.schoolMgntSystem.model.Registration;
import com.jdc.schoolMgntSystem.model.StudentProfile;
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
	
	@ModelAttribute("user")
	public Registration userRegistration() {
		return new Registration();
	}
	
	
	@Override
	public User save(Registration registrationDto) {
		String role = registrationDto.getRole();
		if(role.equals("student")){
			saveStudent(registrationDto);
		}
		else if(role.equals("teacher")){
			saveTeacher(registrationDto);
		}
		else if( role.equals("staff")){
			saveStaff(registrationDto);
		}
		UserMapper userMapper = new UserMapper();
		User user = userMapper.map(registrationDto);
		
		return userRepository.save(user);
	}

	
	public void saveStudent(@ModelAttribute("user") Registration registration){
		StudentProfile student  = new StudentProfile();
		student.setAge(registration.getAge());
		student.setFirstName(registration.getFirstName());
		student.setLastName(registration.getLastName());
		student.setAddress(registration.getPlace());
		student.setRollNumber(registration.getUserId());
		studentRepo.save(student);
	}
	public void saveTeacher(Registration registration){
		StudentProfile student  = new StudentProfile();
		student.setAge(registration.getAge());
		student.setFirstName(registration.getFirstName());
		student.setLastName(registration.getLastName());
		student.setAddress(registration.getPlace());
		student.setRollNumber(registration.getUserId());
		
	}
	public void saveStaff(Registration registration){
		StudentProfile student  = new StudentProfile();
		student.setAge(registration.getAge());
		student.setFirstName(registration.getFirstName());
		student.setLastName(registration.getLastName());
		student.setAddress(registration.getPlace());
		student.setRollNumber(registration.getUserId());
		
	}
	@Override
	public void saveUser(Registration registration) throws BusinessException {
		UserMapper userMapper = new UserMapper();
		User user = userMapper.map(registration);
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
	public User getRegistrationMapper(Registration registration){
		
		User user = new User();
		/*user.setAge(registration.getAge());
		user.setDate(registration.getDate());
		user.setFirstName(registration.getFirstName());
		user.setLastName(registration.getLastName());
		user.setPlace(registration.getPlace());
		user.setUserId(registration.getUserId());
		user.setPassword(registration.getPassword());*/
		return user;
		
	}



/*	@Override
	public UserDetails loadUserByUsername(String userid) throws UsernameNotFoundException {
	
		User user = userRepository.findByUserId(userid);
		if(user == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		
		//return new org.springframework.security.core.userdetails.User(user.getUserId(), user.getPassword());	
		return null;
	}
	*/
	
}
