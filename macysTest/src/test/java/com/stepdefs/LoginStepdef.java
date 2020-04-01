package com.stepdefs;

import com.Actions.LoginAction;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdef {
	LoginAction loginAc= new LoginAction();
	
	//Signin...
	
	@Given("^I navigated to Macy's login page$")
	public void i_navigated_to_Macy_s_login_page() {
	String actualTitle = loginAc.SigninPage();
	// Assert.assertEquals(acttualTitle, expected);
	System.out.println(actualTitle);
  
	}

	@When("^I click on Sign in$")
	public void i_click_on_Sign_in()  {
	loginAc.signin();    
	}

	@And("^I entered correct \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_entered_correct_and(String arg1, String arg2)  {
	 
	loginAc.email("md055760@gmail.com"); 
	loginAc.password("AaBb123");
	 
	}

	@Then("^I am successfully on  Macy's home page$")
	public void i_am_successfully_on_Macy_s_home_page()  {
	  loginAc.signin();  
	}



}
