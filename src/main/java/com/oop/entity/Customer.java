package com.oop.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	private Long customerId;
	private String customerName;
	private String customerEmail;
	private Long customerMobileNumber;
	private String gender;
	private String customerSsn;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Plan plan;
	
}
