package com.gptc.hawe.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HaweApplicationController { 
	
//  @GetMapping("/print")
//	@RequestMapping(value="/print", method=Post)
//	@RequestMapping(value="/print", method=put)
//	@RequestMapping(value="/print", method=Delete)
//	@RequestMapping(value="/print", method=post)
	
	@GetMapping("/print")
//	@PostMapping("/print")
//	@DeleteMapping("/print")
	public String getString() {
		return "First day string app";
	}
	@GetMapping("/message")    //Open the browser and invoke the URL http://localhost:8080/message
	public String getMessage() {
		return "string boot is working";
	}
	
	
    static	String[] cust = {"bob", "King","Mike"};
	@GetMapping("/nameList")
	public String [] getStringOne() {
		return cust;
	}
	
	@GetMapping("/add/{a}/{b}") // Open the browser and invoke the URL http://localhost:8080/add/6/7
	public int add(@PathVariable int a, @PathVariable int b) {
		return  a+b;
	}
	
	@GetMapping("/add/{a}/{b}/{c}") // Open the browser and invoke the URL http://localhost:8080/add/6/7/3
	public int addandMultiplay(@PathVariable int a, @PathVariable int b, @PathVariable int c) {
		return  (a+b)*c;
	}
	
	@GetMapping("/hollo")  
	public String hollo()   
	{  
	return "Hello User, have a nice day.";  
	}  
	
	static List<String> myList = new ArrayList<>();

	static {
		myList.add("Bob");
		myList.add("Mike");
		myList.add("King");
	}
	// to display http://localhost:8080/names/name 
	@GetMapping("/names/{name}")
	@ResponseBody
	public List<String> addAndGetNames(@PathVariable String name){
		myList.add(name);
		return myList;
	}
	@GetMapping("/alo")
	public String hello() {
		return " hello STS method";
	}
	public void isNotNull() {
		// TODO Auto-generated method stub
		
	}
	
		
	

}
