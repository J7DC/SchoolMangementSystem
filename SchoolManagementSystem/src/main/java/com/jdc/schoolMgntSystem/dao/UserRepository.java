package com.jdc.schoolMgntSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jdc.schoolMgntSystem.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findByUserId(String userId);

}
