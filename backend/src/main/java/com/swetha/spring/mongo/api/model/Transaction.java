package com.swetha.spring.mongo.api.model;

public class Transaction {

	public String date;
	public String desc;
	public String amount;
	
	
	
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(String date, String desc, String amount) {
		super();
		this.date = date;
		this.desc = desc;
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Transaction [date=" + date + ", desc=" + desc + ", amount=" + amount + "]";
	} 
	
	
	
}
