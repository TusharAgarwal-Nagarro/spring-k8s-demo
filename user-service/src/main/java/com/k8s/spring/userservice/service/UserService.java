package com.k8s.spring.userservice.service;

import com.k8s.spring.userservice.entity.User;

public interface UserService {
	
	User findByUserId(Long id);

}
