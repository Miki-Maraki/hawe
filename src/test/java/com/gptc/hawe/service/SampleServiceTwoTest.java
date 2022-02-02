package com.gptc.hawe.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class SampleServiceTwoTest {
	
	//private SampleServiceTwo sample2 = new SampleServiceTwo();
	// @Autowired enables automatic dependency injection
	
	//	@Autowired // enables automatic dependency injection
		private SampleServiceTwo sample2 = new SampleServiceTwo();
		
		@Test
		public void testAddSuccessScenario() {
			int expected = 24;
			int actual = sample2.add(15, 9);
			
			assertEquals (expected, actual);
				
		}
		
		@Test
		public void testAddNegativeScenario() {
			int expected = 26;
			int actual = sample2.add(15, 9);
			
			assertNotEquals (expected, actual);
				
		}
}
