package com.dev.eCommerce_BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverFactory extends BasePage {

	public WebDriver driver1;
	public static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
	
	
	public static WebDriver initializeDriver(String browser)
	{
		if(browser.isEmpty())
			          browser = " ";
		
		 if(browser.equalsIgnoreCase("chrome"))
		 {    
			   WebDriverManager.chromedriver().setup();
		       threadDriver.set(new ChromeDriver());
		 }
		 else  if(browser.equalsIgnoreCase("edge"))
		 {    
			   WebDriverManager.edgedriver().setup();
		       threadDriver.set(new EdgeDriver());
		 }
		  driver().manage().deleteAllCookies();
		  driver().manage().window().maximize();
		  
		  return driver();
	}
	
	public static  synchronized WebDriver driver()
	{
		  return threadDriver.get();
	}
}
