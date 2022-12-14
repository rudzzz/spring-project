package com.project.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.userdept.entities.User;
import com.project.userdept.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@GetMapping()
	public List<User> findUsers(){
		List<User> result = userRepository.findAll();
		return result;
	}

	@GetMapping(value = "/{id}")
	public User findById(@PathVariable Long id){
		User result = userRepository.findById(id).get();
		return result;
	}

	@PostMapping()
	public User save(@RequestBody User user){
		User result = userRepository.save(user);
		return result;
	}
}
