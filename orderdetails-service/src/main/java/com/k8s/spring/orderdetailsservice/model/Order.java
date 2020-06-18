package com.k8s.spring.orderdetailsservice.model;

import java.time.LocalDateTime;

@lombok.Getter
@lombok.Setter
public class Order {
	
	private Long id;
	
	private double amount;
	
	private LocalDateTime createdOn;

}
