package com.k8s.spring.orderdetailsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.k8s.spring.orderdetailsservice.model.OrderDetails;
import com.k8s.spring.orderdetailsservice.service.OrderDetailsService;

@RestController
@RequestMapping(path="/service")
public class OrderDetailsController {
	
	@Autowired
	private OrderDetailsService orderDetailsService;
	
	@GetMapping("/orderdetails/{userId}")
	public OrderDetails getOrderDetails(@PathVariable("userId") Long userId) {
			return orderDetailsService.getOrderDetails(userId);
	}

}
