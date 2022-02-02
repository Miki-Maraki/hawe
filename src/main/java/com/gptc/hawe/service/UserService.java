package com.gptc.hawe.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gptc.hawe.model.User;
import com.gptc.hawe.repository.UserRepository;

//@Component are @Service(service), @Controller(presentation), @Repository(Persistence/DAO)
// DAO - data access object

// here create the way what to access/ call the repository methods, data ...

@Service
public class UserService {

	@Autowired //enables automatic dependency injection and bean by matching data-type.
	private UserRepository userRepository;       // fields from repository class

	public List<User> getAllUser() {             // method  1
		return userRepository.getAllUser();
	}

	public List<User> getUsersStrtsWithM() {       // method 2	
		List<User> users = userRepository.getAllUser();   
		
		List<User> usersStartsWithM = users.stream().filter(u -> u.getUserName().startsWith("M"))
				.collect(Collectors.toList());
		
		return usersStartsWithM;               // System.out.println(usersStartsWithM);
	}

}
