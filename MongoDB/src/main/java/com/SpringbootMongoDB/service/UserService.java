package com.SpringbootMongoDB.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringbootMongoDB.model.User;
import com.SpringbootMongoDB.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    //Create operation
    public String create( User user) {
    	
    	List email_validation = userRepository.findByEmail(user.getEmail());
    	
    	
    	String validation = "";
    	if(!email_validation.isEmpty()) {
    		
    	
    			validation  = "Email is already registered \n";
    		
    		
    		return validation;
    		}
    	
    	
    	
    	
    	 userRepository.save(user);
    	 return "User saved successfully";
    	 
    }
    //Retrieve operation
    public List<User> getAll(){
        return userRepository.findAll();
    }
    public User getByFirstName(String firstName) {
    	
    	
        return userRepository.findByName(firstName);
        
    }
    //Update operation
//    public User update(String firstName, String lastName, int age) {
//        User p = userRepository.findByName(firstName);
//        /*p.setLastName(lastName);
//        p.setAge(age);*/
//        return userRepository.save(p);
//    }
    //Delete operation
    public void deleteAll() {
        userRepository.deleteAll();
    }
    public void delete(String firstName) {
        User p = userRepository.findByName(firstName);
        userRepository.delete(p);
    }
    
    
    public static void main(String[] args) {
		User user  = new User();
		System.out.println(user.errormessage);
	}
    
    
    
    
}
