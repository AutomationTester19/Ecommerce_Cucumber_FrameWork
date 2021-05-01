package com.dev.eCommerce_BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

	public WebDriver driver;
	
	private  By emailId = By.id("Email");
	private  By password = By.id("Password");
	private  By loginBtn = By.xpath("//button[@type='submit' and normalize-space()='Log in']");
	
	 public LoginPage(WebDriver driver)
	 {
		 this.driver = driver;
	 }
	 
	 public  void enterloginDetails()
	 {
		  if(driverFactory.driver().findElement(emailId).isDisplayed())
		  {
			  
		  }
		  if(driverFactory.driver().findElement(password).isDisplayed())
		  {
			  
		  }
		  if(driverFactory.driver().findElement(loginBtn).isDisplayed())
			  driverFactory.driver().findElement(loginBtn).click();
    }
	 
}
