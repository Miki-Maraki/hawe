package com.gptc.hawe.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.gptc.hawe.model.User;
import com.gptc.hawe.repository.UserRepository;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

	@Mock  // used when we have database call, 3rd party API call
	private UserRepository repository;

	@InjectMocks // service is dependent on repository (inject any mock class to create service object)
	private UserService userService;

	@Test
	public void getAllUserTest() {
		List<User> expectedListOfUsers = Arrays.asList(new User(101, "Nigus", "Nigus.Kidane@gmail.com"),
				new User(102, "Mike", "Mike.Kidane@gmail.com"), new User(103, "Seli", "Seli.Kidane@gmail.com"),
				new User(102, "Mesi", "Mesi.Kidane@gmail.com"), new User(102, "Meron", "Meron.Kidane@gmail.com"));
		
		when(repository.getAllUser()).thenReturn(expectedListOfUsers);
		
		List<User> actualListOfUsers = userService.getAllUser();
		
		assertNotNull(actualListOfUsers);
		assertEquals(expectedListOfUsers,actualListOfUsers);


	}

}
