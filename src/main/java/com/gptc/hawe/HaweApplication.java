package com.gptc.hawe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// This is the first step in creating a Spring Boot Project Using STS
// when we need to access the other controlle, model, repository, service or Test 
// this class must in up and running state by run as "Java application" and  then  
// must show Tomcat started on port : http 8080
// --->> in the console shows that the application is up and running

// Annotate the class by adding an annotation @SpringBootApplication.
// It is a combination of three annotations @EnableAutoConfiguration, @ComponentScan, and @Configuration.

@SpringBootApplication
public class HaweApplication {

	//After creating the class file, call the static method run() of the SpringApplication class. 
	//In the following code, we are calling the run() method and passing the class name as an argument.
	
	public static void main(String[] args) {
		SpringApplication.run(HaweApplication.class, args); // it will start application
	}
	
/*	 A single @SpringBootApplication annotation is used to enable the following annotations:
     @EnableAutoConfiguration: It enables the Spring Boot auto-configuration mechanism.
     @ComponentScan: It scans the package where the application is located.
     @Configuration: It allows us to register extra beans in the context or import additional configuration classes.

*/
}
