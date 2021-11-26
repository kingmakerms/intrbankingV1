package com.intbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver ldriver;
	
	public Loginpage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin; 
	
	@FindBy(xpath="//a[normalize-space()='Log out']")
	@CacheLookup
	WebElement lnkLogout;
	
	
	public void setUserName(String uname) {
		 txtUserName.sendKeys(uname);
		 
	}
	public void setPassword(String pwd) {
		 txtpassword.sendKeys(pwd);
		 
	}
	public void clickSubmit() {
		btnLogin.click();
	}
	public void clickLogout()
	{
		lnkLogout.click();
	}
		
	

}
