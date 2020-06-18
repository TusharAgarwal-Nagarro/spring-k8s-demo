package com.k8s.spring.orderservice.entity;

import java.time.LocalDateTime;

@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
public class Order {
	
	private Long id;
	
	private double amount;
	
	private Long userId;
	
	private LocalDateTime createdOn;

}
