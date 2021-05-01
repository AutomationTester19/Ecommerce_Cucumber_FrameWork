package com.dev.eCommerce_StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.dev.eCommerce_BasePage.BasePage;
import com.dev.eCommerce_BasePage.LoginPage;
import com.dev.eCommerce_BasePage.driverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BasePageStepDefination extends BasePage {

	private LoginPage loginPage = new LoginPage(driverFactory.driver());

	@Given("Navigate to ECommerce WebPage")
	public void navigate_toECommerceWebPage() {
		driverFactory driverfactory = new driverFactory();
		String browserDriver = getProperty("browser");
		if (browserDriver.isEmpty())
			Assert.assertFalse(false);

		driverFactory.initializeDriver(browserDriver);
		String url = driverfactory.getProperty("url");
		if (url.isEmpty())
			Assert.assertFalse(false);

		driverFactory.driver().get(url);
		loginPage.enterloginDetails();
	}

	@Then("Validate Page Title Should be {string}")
	public void validatePageTitle(String expectedTitle)
	{
		if(expectedTitle.isEmpty())
			System.out.println("Title Cannot be empty");
		
	
		String actualTitle = driverFactory.driver().getTitle().trim();
		Assert.assertEquals(actualTitle, expectedTitle, "Validate Title");
		
	}
	
	@Then("Navigate to {string} from home page")
	public void menuNavigation(String menuNavigation) {
		
		String xpath = " ";
		String navigatiion = " ";
		if(menuNavigation.contains("~"))
		{
			 String[] nav = menuNavigation.split("~");
			 for(String menuNavigator :  nav)
			 {
				 
				 
			 }
		}
	}
}
