package com.Actions;

import org.openqa.selenium.support.PageFactory;

import com.Elements.LoginElement;
import com.Utilities.SetupDriver;

public class LoginAction {
	
      LoginElement logElement;
	
	public LoginAction() {
    this.logElement= new LoginElement();
    PageFactory.initElements(SetupDriver.driver,logElement);
	}
	
	public String SigninPage() {
		SetupDriver.driver.get("https://www.macys.com/account/signin");
		String title = SetupDriver.driver.getTitle();
		return title;
	}

	public void email(String email ) {
	 logElement.emailaddress.sendKeys("md055760@gmail.com");	
		
	}
    public void password(String password) {
    	logElement.password.sendKeys("AaBb123");
    
    }
    
    public void signin() {
    logElement.signin.click();
    }
}