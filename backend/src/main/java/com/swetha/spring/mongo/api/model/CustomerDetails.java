package com.swetha.spring.mongo.api.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection="customerDetails") 
public class CustomerDetails {
	 
	 private boolean success;
	 Customer cust;
	 
	
	 
	public CustomerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerDetails(boolean success, Customer cust) {
		super();
		this.success = success;
		this.cust = cust;
	}
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}

	@Override
	public String toString() {
		return "CustomerDetails [success=" + success + ", cust=" + cust + "]";
	}

	

	}