package com.SpringbootMongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.SpringbootMongoDB.model.Items;

public interface ItemRepository extends MongoRepository<Items, String> {
	
	

}
