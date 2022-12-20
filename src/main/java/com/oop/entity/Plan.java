package com.oop.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
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
public class Plan {
	@Id
	private Long planId;
	private String planName;
	private String planStatus;
	private String caseNum;
	private String customerName;
	private String customerSsn;
	private Double customerAmount;
	private String customerDeniedReason;
	private Date startDate;
	private Date endDate;

}
