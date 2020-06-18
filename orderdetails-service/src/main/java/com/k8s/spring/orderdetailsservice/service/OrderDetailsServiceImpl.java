package com.k8s.spring.orderdetailsservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.k8s.spring.orderdetailsservice.model.OrderDetails;
import com.k8s.spring.orderdetailsservice.service.client.OrderClient;
import com.k8s.spring.orderdetailsservice.service.client.UserClient;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {
	
	@Autowired
	private UserClient userClient;
	
	@Autowired
	private OrderClient orderClient;

	@Override
	public OrderDetails getOrderDetails(Long userId) {
		
		OrderDetails orderDetails = new OrderDetails();
		orderDetails.setUserDetails(userClient.getUserById(userId));
		orderDetails.setOrders(orderClient.getOrderById(userId));
		return orderDetails;
	}

}
