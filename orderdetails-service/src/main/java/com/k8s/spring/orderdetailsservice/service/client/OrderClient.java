package com.k8s.spring.orderdetailsservice.service.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.k8s.spring.orderdetailsservice.model.Order;

@FeignClient(name="order")
public interface OrderClient {
	
	@GetMapping("/service/order/{userId}")
	public List<Order> getOrderById(@PathVariable("userId") Long userId);


}
