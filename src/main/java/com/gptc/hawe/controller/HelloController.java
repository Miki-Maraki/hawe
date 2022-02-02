package com.gptc.hawe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")  //Open the browser and invoke the URL http://localhost:8080/hello
	public String redirect() {
		return "This is viewpage";
	}

	@RequestMapping("/helloagain")
	public String display() {
		return "final";
	}
	
	@RequestMapping("/boot")       //Open the browser and invoke the URL http://localhost:8080/
	  public String helloWorld(){
	    return "Hello World from Spring Boot";
	  }

	public void isNotNull() {
		// TODO Auto-generated method stub
		
	}

	
}
