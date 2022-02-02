package com.gptc.hawe.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gptc.hawe.model.User;

//@Component are @Service(service), @Controller(presentation), @Repository(Persistence/DAO)
//DAO - data access object

@Repository
public class UserRepository {
	// repository class
	// list of data
	static List<User> usersFromDataBase = new ArrayList<>();
	static {
		usersFromDataBase.add(new User(101, "Nigus", "Nigus.Kidane@gmail.com"));
		usersFromDataBase.add(new User(102, "Mike", "Mike.Kidane@gmail.com"));
		usersFromDataBase.add(new User(103, "Seli", "Seli.Kidane@gmail.com"));
		usersFromDataBase.add(new User(104, "Mesi", "Mesi.Kidane@gmail.com"));
		usersFromDataBase.add(new User(105, "Meron", "Meron.Kidane@gmail.com"));
	}


//			Arrays.asList(new User(101, "Nigus", "Nigus.Kidane@gmail.com"),
//			new User(102, "Mike", "Mike.Kidane@gmail.com"), new User(103, "Seli", "Seli.Kidane@gmail.com"),
//			new User(102, "Mesi", "Mesi.Kidane@gmail.com"), new User(102, "Meron", "Meron.Kidane@gmail.com"));

	public List<User> getAllUser() { // method that define how to access the list
		return usersFromDataBase;
	}

}
