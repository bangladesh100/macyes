package com.Utilities;

import cucumber.api.java.After;

public class AfterClass {
	@After
	public void afterAction(){
		SetupDriver.tearDown();
		System.out.println("----------");
	}
	
}


