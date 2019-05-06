package com.SpringbootMongoDB.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringbootMongoDB.model.Items;
import com.SpringbootMongoDB.model.User;
import com.SpringbootMongoDB.service.ItemsService;
import com.SpringbootMongoDB.service.UserService;


@RestController
@RequestMapping(value="/api")
public class userController {
	
	@Autowired
    private UserService userService;
	
	@Autowired
	ItemsService itemService;
	
	@ResponseBody
    @RequestMapping(value ="/create",method = RequestMethod.POST)
    public String  create(@Valid @RequestBody User user) {
        
        return userService.create(user);
    }

    @RequestMapping(value="/get/{name}",method = RequestMethod.GET)
    public User getUser(@PathVariable("name") String name) {
        return userService.getByFirstName(name);
    }
    @RequestMapping(value="/getAll",method = RequestMethod.GET)
    @ResponseBody
    public List<User> getAll(){
        return userService.getAll();
    }
    
    @RequestMapping(value="/delete",method = RequestMethod.DELETE)

    public String delete(@RequestParam String firstName) {
        userService.delete(firstName);
        return "Deleted "+firstName;
    }
    @RequestMapping(value="/deleteAll",method = RequestMethod.DELETE)
    public String deleteAll() {
        userService.deleteAll();
        return "Deleted all records";
    }
    @GetMapping("/hello")
    public String msg() {
    	return "hello world";
    }
    
    
    
    @RequestMapping(value="/selectItem",method = RequestMethod.POST)
    public Items itemAdd(Items item) {
    	return itemService.addItem(item);
    }
    
 



}

