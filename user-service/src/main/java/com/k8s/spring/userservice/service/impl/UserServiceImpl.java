package com.k8s.spring.userservice.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.k8s.spring.userservice.entity.User;
import com.k8s.spring.userservice.repository.UserRepository;
import com.k8s.spring.userservice.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User findByUserId(Long id) {
		
		Optional<User> user = userRepository.findById(id);
		if(user.isPresent()) {
			return user.get();
		}
		else return null;
	}

}
