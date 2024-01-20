package com.carnation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.carnation.model.User;
import com.carnation.service.UserService;

public class UserController {
	
	@Autowired
	UserService userservice;
	
	@PostMapping ("/save-user")
	public User saveUser(@RequestBody User user) {
		return userservice.saveUser(user);
		
	}

}
