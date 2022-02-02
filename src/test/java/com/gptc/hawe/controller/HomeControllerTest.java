package com.gptc.hawe.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HomeControllerTest {
	
	@Test
    public void testHomeController() {
        HomeController homeController = new HomeController();
        String result = homeController.home();
        assertEquals(result, "Hello World!");
    }

}
