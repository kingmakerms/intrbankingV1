package com.intbanking.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.intbanking.pageobject.AddCustomerPage;
import com.intbanking.pageobject.Loginpage;

public class TC_AddCustomerTest_003 extends BaseClass {
	
	@Test
	public void addNewCustomer() throws InterruptedException, IOException {
		Loginpage lp=new Loginpage(driver);
		lp.setUserName(username);
		logger.info("user name is provided");
		lp.setPassword(password);
		logger.info("password is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust=new AddCustomerPage(driver);
		addcust.clickAddNewCustomer();
		logger.info("Providing customer details");
		addcust.custName("Malatesh");
		addcust.custgender("male");
		Thread.sleep(2000);
		addcust.custdob("15", "06", "1997");
		addcust.custaddress("Heeladahalli post belur");
		addcust.custcity("Ranibennur");
		addcust.custstate("Karnataka");
		addcust.custpinno("571211");
		addcust.custtelephoneno("9900768521");
		
		String email=randomstring()+"@gmail.com";
		addcust.custemailid(email);
		addcust.custpassword("EgyrUsu");
		addcust.custsubmit();
		
		Thread.sleep(3000);
		logger.info("validation started....");
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		if(res==true) {
			Assert.assertTrue(true);
			logger.info("test case passed...");
		}
		else
		{
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
			logger.info("test case failure...");
		}
	}

}
