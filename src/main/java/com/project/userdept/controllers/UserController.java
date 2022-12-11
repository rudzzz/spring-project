package com.project.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.userdept.entities.User;
import com.project.userdept.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	public List<User> findUsers(){
		return userRepository.findAll();
	}
}
