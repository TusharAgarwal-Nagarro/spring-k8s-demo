package com.k8s.spring.orderservice.repository;

import java.util.List;

import com.k8s.spring.orderservice.entity.Order;

public interface OrderRepository {
	
	public List<Order> findByUserId(Long userId);

}
