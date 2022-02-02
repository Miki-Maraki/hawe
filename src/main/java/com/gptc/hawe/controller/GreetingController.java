package com.gptc.hawe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gptc.hawe.service.GreetingService;

@Controller
public class GreetingController {
	
	private final GreetingService service;

	public GreetingController(GreetingService service) {
		this.service = service;
	}

	@RequestMapping("/greeting")   // display Hello, World
	public @ResponseBody String greeting() {
		return service.greet(); // invoke greet() method
	}

}
