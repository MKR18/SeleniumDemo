package com.selenium.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	
	@FindBy(name="uid")
	@CacheLookup
	WebElement User_name;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement user_password;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btn_login;
	
	public void setUserName(String username) {
		User_name.sendKeys(username);
	
	}
	
	public void setPassword(String password) {
		user_password.sendKeys(password);
	
	}
	
	public void clickLoginbtn() {
		btn_login.click();
	}
	
	
	
}
