package com.intbanking.testcase;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.intbanking.pageobject.Loginpage;



public class Tc_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() throws IOException {
		
		logger.info("URL Opened");
		
		Loginpage lp=new Loginpage(driver);
		lp.setUserName(username);
		logger.info("Enter username");
		lp.setPassword(password);
		logger.info("Enter password");
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("login test passed");
		}
		else
		{
			captureScreen(driver,randomNum()+"loginTest");
			Assert.assertTrue(false);
			logger.info("login test failed");
		}
	}

}
