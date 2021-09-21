package com.selenium.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	
	@Test
	public void LoginTest() throws IOException {
		driver.get(baseUrl);
		logger.info("url open");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.setUserName(username);
		logger.info("usernam entered");
		
		loginpage.setPassword(password);
		logger.info("password entered");
		
		loginpage.clickLoginbtn();
		logger.info("butn clicked");
		 System.out.println(driver.getTitle());

		if(driver.getTitle().equals("Guru992 Bank Manager HomePage")) {
			logger.info("success");
			AssertJUnit.assertTrue(true);

		}else {
			
			logger.error("failure");
			captureScreen(driver, "LOgintest");
			AssertJUnit.assertFalse(true);
			
		}
	}
	
}
