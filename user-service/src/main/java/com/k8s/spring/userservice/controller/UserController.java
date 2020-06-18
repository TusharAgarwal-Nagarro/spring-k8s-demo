package com.k8s.spring.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.k8s.spring.userservice.entity.User;
import com.k8s.spring.userservice.service.UserService;

@RestController
@RequestMapping(path = "/service")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/user/{userId}")
	public User getUserById(@PathVariable("userId") Long userId) {
		return userService.findByUserId(userId);
	}

}
