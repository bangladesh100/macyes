package com.Utilities;

import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.Before;

public class BeforeClass {
	
	@Before
	public static void setUp(Scenario scen) {
		System.out.println("Chrome driver initialized.");
		SetupDriver.getChromeDriver();
		System.out.println("Chrome driver End");
	}

}
