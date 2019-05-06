package com.SpringbootMongoDB.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.SpringbootMongoDB.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
    public User findByName(String firstName);
    public List<User> findByEmail(String email);
    public List<User> findByMobile(String mobilenumber);
    
   
}
