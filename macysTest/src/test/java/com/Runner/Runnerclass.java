package com.Runner;



import java.io.File;

import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class Runnerclass {

	@CucumberOptions(features = { "features" },
	glue = { "com.stepdefs", "com.Utilities" }, plugin = { "pretty","html:target/cucumber-htmlreport", 
	"json:target/cucumber-report.json",	"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },
 
			 monochrome = true
)
	 @Test
	 public class comRunner extends AbstractTestNGCucumberTests {

					 	
	@After
	public  void writeExtentReport() {
	Reporter.loadXMLConfig(new File("config/loginreport.xml"));

	}
	}	 
					 	 
	}	 
			 
			 
			 
			 
			 
			 
			 
			 
		 
			 
			 
			 
			 
			 
			 		





