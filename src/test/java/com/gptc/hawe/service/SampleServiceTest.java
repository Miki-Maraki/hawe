package com.gptc.hawe.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


public class SampleServiceTest {
	
	//private SampleService sample = new SampleService();
	
	// helps to represent ( = new SampleService();)
	private SampleService sample= new SampleService();
//	@Autowired
//	private SampleService sample;
	//junit used to test unit testing in java one by one (for each method)
	// provide one test positive scenario ( expected value equal to actual value)
	// provide one test negative scenario (expected value not equal to actual value )

	@Test
	public void testAddSuccessScenario() { // test add method 
		int expected = 6;
		int actual = sample.add(2, 4);

		assertEquals(expected, actual);
		
	}

	
	@Test
	public void testAddNegativeScenario() {
		int expected = 7;
		int actual = sample.add(2, 4);
		
		assertNotEquals(expected, actual);
		
	}
	
	@Test
	public void testSubPositiveScenario() {// test sub method
		int expected = 4;
		int actual = sample.sub(8, 4);

		assertEquals(expected, actual);
	}
	
	@Test
	public void testSubNegativeScenario() {
			int expected = 5;
			int actual = sample.sub(8, 4);

			assertNotEquals(expected, actual);
	}
	
	@Test
	public void testComOperPositiveScenario() {  // test comOper method
		//int expected c=12;
		//int actual c = sample.add(7, 5);
		//int expected d = 2;
		//int actual d = sample.sub(7, 5);
		int expected = 140;
		int actual  = sample.comOper(12, 2);
//		12+2=14
//		12-2=10
//		14*10=140
	   
		assertEquals(expected, actual);
	}
	
	@Test
	public void testComOperNegativeScenario() {
		//int expected c=13;
		//int actual c = sample.add(7, 5);
		//int expected d = 3;
		//int actual d = sample.sub(7, 5);
		int expected = 139;
		int actual  = sample.comOper(12, 2);
	   
		assertNotEquals(expected, actual);
	}
	
}
