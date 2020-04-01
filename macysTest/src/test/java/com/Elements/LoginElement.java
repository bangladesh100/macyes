package com.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginElement {
	
	@FindBy(xpath="//*[@id=\"myRewardsLabel-status\"]/span[1]")
	public WebElement Signin;
	
	@FindBy(id="email")
	public WebElement emailaddress;
	
	
	@FindBy(id="pw-input")
	public WebElement password;
	
	@FindBy(id="sign-in")
	public WebElement signin;

}
