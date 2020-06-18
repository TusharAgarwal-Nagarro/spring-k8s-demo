package com.k8s.spring.orderservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.k8s.spring.orderservice.entity.Order;
import com.k8s.spring.orderservice.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public List<Order> getOrderById(Long id) {
		return orderRepository.findByUserId(id); 
	}

}
