package com.jdc.schoolMgntSystem.serviceImpl;

import com.jdc.schoolMgntSystem.model.Registration;
import com.jdc.schoolMgntSystem.model.User;

public class UserMapper {
	
	public User map(Registration registration) {
		
		User user = new User();
		//user.setAge(registration.getAge());
		user.setDate(registration.getDate());
		//user.setFirstName(registration.getFirstName());
		//user.setLastName(registration.getLastName());
		//user.setPlace(registration.getPlace());
		user.setUserId(registration.getUserId());
		user.setPassword(registration.getPassword());
		user.setRole(registration.getRole());
		return user;
		
	}
}
	
/*public User mapdto(UserRegistrationDto registrationdto) {
		
		User user = new User();
		user.setAge(registrationdto.getAge());
		user.setDate(registrationdto.getDate());
		user.setFirstName(registrationdto.getFirstName());
		user.setLastName(registrationdto.getLastName());
		user.setPlace(registrationdto.getPlace());
		user.setUserId(registrationdto.getUserId());
		user.setPassword(registrationdto.getPassword());
		return user;

}*/
