package com.gptc.hawe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
    public String home() {
        return "Hello World!";
    }
	
	@GetMapping("/messagetwo/{cityName}")  //http://localhost:8096/messagetwo/Dallas
	@ResponseBody
	public String getStringTwo(@PathVariable String cityName) {
		return "Hello : " + cityName;
	}
	@GetMapping("/n")
	public String setName() {
		return "Bob";
	}

}
