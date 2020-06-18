package com.k8s.spring.orderservice.service;

import java.util.List;

import com.k8s.spring.orderservice.entity.Order;

public interface OrderService {
	
	public List<Order> getOrderById(Long id);

}
