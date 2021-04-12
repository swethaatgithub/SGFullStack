package com.swetha.spring.mongo.api.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import com.swetha.spring.mongo.api.model.CustomerDetails;

@Repository
public interface CustomerDetailsRepository extends MongoRepository<CustomerDetails, String> {


}
