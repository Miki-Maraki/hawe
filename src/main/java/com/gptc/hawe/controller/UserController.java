package com.gptc.hawe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gptc.hawe.model.User;
import com.gptc.hawe.service.UserService;

// create controller to display the result
// To create the controller class, we are using two annotations @Controller and @RequestMapping/@GetMapping

@RestController  // presentation 
public class UserController { // controller class

	@Autowired //enables automatic dependency injection
	private UserService service;  //Using the Dependency Injection

	@GetMapping("/users") //Open the browser and invoke the URL http://localhost:8080/users
	public List<User> getAllUser() {
		return service.getAllUser();
	}

	@GetMapping("/usersm")
	public List<User> getAllUsersStartsWithM() {
		return service.getUsersStrtsWithM();
	}
	
	@PostMapping("/add/user")// on PostMan http://localhost:8096/add/user   then write the user on post
	public List<User> addUser(@RequestBody User userFromUI ) {
		List<User> users = service.getAllUser();
		users.add(userFromUI); 
		return users;
	}
}
