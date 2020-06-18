package com.k8s.spring.orderdetailsservice.service;

import com.k8s.spring.orderdetailsservice.model.OrderDetails;

public interface OrderDetailsService {

	public OrderDetails getOrderDetails(Long userId);
}
