package com.gptc.hawe.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloControllerTest {
	
	@Autowired
	private HelloController controller;

	@Test
	public void contextLoads() throws Exception {
		controller.isNotNull();
	}

}
