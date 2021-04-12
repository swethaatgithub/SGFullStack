package com.swetha.spring.mongo.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swetha.spring.mongo.api.model.CustomerDetails;
import com.swetha.spring.mongo.api.model.Transaction;
import com.swetha.spring.mongo.api.repository.CustomerDetailsRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CustomerDetailsController {
	
	@Autowired
	private CustomerDetailsRepository cdr;
	List<CustomerDetails> cd;
	List<CustomerDetails> cdget = new ArrayList<CustomerDetails>();
	List<Transaction> trans = new ArrayList<Transaction>();
	String username= ""; 
	String lastlogin= ""; 
	String balance= ""; 
	List<String> team = new ArrayList<String>();

	
	
	@PostMapping("/addCustomer")
	public String addCustomerDetails(@RequestBody CustomerDetails custDetails) {
		cdr.save(custDetails);
		return "Added book with ID: "; 		
	}
	
	@GetMapping("/getAllData")
	public List<CustomerDetails> getUserByName(String name) {
		return cdr.findAll();
	}
	
	@GetMapping("/getAllDataBySuccess")
	public List<CustomerDetails> getAllDataBySuccess() {
		this.cd = cdr.findAll();
		System.out.println("before for");
		for(CustomerDetails c: this.cd) {
			if(c.isSuccess()) {
//				System.out.println(c.toString());
			    cdget.add(c); 
			}
		}
		return cdget;
	}
		
		@GetMapping("/getAllDataByName/{id}")
		public List<CustomerDetails> getAllDataByName(@PathVariable String id) {
			this.cd = cdr.findAll();
			for(CustomerDetails c: this.cd) {
				if(c.getCust().getId().toString().equals(id) ) {
//					System.out.println(c.toString());
				    cdget.add(c); 
				}
			}	
		return cdget;
	}
		//Get User name from ID
		@GetMapping("/getNameByID/{id}")
		public String getNameByID(@PathVariable String id) {
			this.cd = cdr.findAll();
			for(CustomerDetails c: this.cd) {
				if(c.getCust().getId().toString().equals(id) ) {
//					System.out.println(c.toString());
					username = c.getCust().getName();
			        return username;
				}
			}	
		return username;
	}	
		
		//Get Transactions of user from ID
		@GetMapping("/getTransByID/{id}")
		public  List<Transaction> getTransByID(@PathVariable String id) {
			this.cd = cdr.findAll();
			for(CustomerDetails c: this.cd) {
				if(c.getCust().getId().toString().equals(id) ) {
//					System.out.println(c.toString());
					trans.addAll(c.getCust().getTransaction());
			        return trans;
				}
			}	
		return trans;
	}	
		
		//Get Last Login from ID
		@GetMapping("/getLastLoginByID/{id}")
		public String getLastLoginByID(@PathVariable String id) {
			this.cd = cdr.findAll();
			for(CustomerDetails c: this.cd) {
				if(c.getCust().getId().toString().equals(id) ) {
//					System.out.println(c.toString());
					lastlogin = c.getCust().getLastlogin();
			        return lastlogin;
				}
			}	
		return lastlogin;
	}
		
		//Get Balance from ID
		@GetMapping("/getBalanceByID/{id}")
		public String getBalanceByID(@PathVariable String id) {
			this.cd = cdr.findAll();
			for(CustomerDetails c: this.cd) {
				if(c.getCust().getId().toString().equals(id) ) {
//					System.out.println(c.toString());
					balance = c.getCust().getBalance();
			        return balance;
				}
			}	
		return balance;
	}
		
		//Get all Team member name
		@GetMapping("/getTeamNameList")
		public List<String> getTeamNameList() {
			this.cd = cdr.findAll();
			for(CustomerDetails c: this.cd) {
				//	System.out.println(c.toString());
					team.add(c.getCust().getName());
			}	
		return team;
	}

}
	