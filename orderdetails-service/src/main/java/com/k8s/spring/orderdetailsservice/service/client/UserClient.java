package com.k8s.spring.orderdetailsservice.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.k8s.spring.orderdetailsservice.model.User;


@FeignClient(name="user")
public interface UserClient {


	@GetMapping("/service/user/{userId}")
	public User getUserById(@PathVariable("userId") Long userId);
}
