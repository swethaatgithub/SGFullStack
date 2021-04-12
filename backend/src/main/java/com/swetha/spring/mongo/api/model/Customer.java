package com.swetha.spring.mongo.api.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

public class Customer {
	@Id
	public String id;
	public String name;
	public String lastlogin;
	public String balance; 
	List<Transaction> transaction = new ArrayList<Transaction>();
		

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String id, String name, String lastlogin, String balance, List<Transaction> transaction) {
		super();
		this.id = id;
		this.name = name;
		this.lastlogin = lastlogin;
		this.balance = balance;
		this.transaction = transaction;
	}

	public List<Transaction> getTransaction() {
		return transaction;
	}

	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", lastlogin=" + lastlogin + ", balance=" + balance
				+ ", transaction=" + transaction + "]";
	}

	public String getLastlogin() {
		return lastlogin;
	}

	public void setLastlogin(String lastlogin) {
		this.lastlogin = lastlogin;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}
	
	
	

}
	