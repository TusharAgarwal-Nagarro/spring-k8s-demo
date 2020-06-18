package com.k8s.spring.orderservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.k8s.spring.orderservice.entity.Order;
import com.k8s.spring.orderservice.service.OrderService;

@RestController
@RequestMapping(path = "/service")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/order/{userId}")
	public List<Order> getOrderById(@PathVariable("userId") Long userId) {
		return orderService.getOrderById(userId);
	}

}
