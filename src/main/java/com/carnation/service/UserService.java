package com.carnation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carnation.model.User;
import com.carnation.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userrepository;
	 
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userrepository.save(user);
	}

}
