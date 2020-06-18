package com.k8s.spring.userservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@lombok.Getter
@lombok.Setter
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private int age;

}
