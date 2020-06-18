package com.k8s.spring.orderservice.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.k8s.spring.orderservice.entity.Order;

@Repository
public class OrderRepositoryImpl implements OrderRepository {

	
	private List<Order> data;
	
	@PostConstruct
	public void init() {
		data = new ArrayList<>();
		data.add(new Order(1L, 250, 1L, LocalDateTime.now()));
		data.add(new Order(2L, 500, 1L, LocalDateTime.now()));
		data.add(new Order(3L, 1000, 2L, LocalDateTime.now().minusDays(1)));
	}
	
	@Override
	public List<Order> findByUserId(Long userId) {
		return data.stream().filter(o->o.getUserId().equals(userId)).collect(Collectors.toList());
	}
	

}
