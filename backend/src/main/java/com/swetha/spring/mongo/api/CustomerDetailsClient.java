package com.swetha.spring.mongo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import com.swetha.spring.mongo.api.model.CustomerDetails;
import com.swetha.spring.mongo.api.repository.CustomerDetailsRepository;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = CustomerDetailsRepository.class)

public class CustomerDetailsClient  implements CommandLineRunner{
	@Autowired
	CustomerDetailsRepository cdre;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CustomerDetailsClient.class, args);
	}
	
	
	
}
