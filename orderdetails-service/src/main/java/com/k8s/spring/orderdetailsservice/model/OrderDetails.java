package com.k8s.spring.orderdetailsservice.model;

import java.util.List;

@lombok.Getter
@lombok.Setter
public class OrderDetails {
	
	private User userDetails;
	
	private List<Order> orders;

}
