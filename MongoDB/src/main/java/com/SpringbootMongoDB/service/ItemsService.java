package com.SpringbootMongoDB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringbootMongoDB.model.Items;
import com.SpringbootMongoDB.repository.ItemRepository;

@Service
public class ItemsService {
	
	@Autowired
	ItemRepository itemRepo;
	
	public Items addItem(Items item) {
		
		return itemRepo.save(item);
	}
	

}
