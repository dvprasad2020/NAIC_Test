package com.hellofresh.challenge1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hellofresh.challenge1.SelectBrowserType;

import org.testng.annotations.AfterTest;

import pageObjects.CheckoutPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class RunWebTest extends SelectBrowserType{
	WebDriver driver;
	LandingPage objLandingPage;
	LoginPage objLoginPage;
	CheckoutPage objCheckoutPage;
	
	
	@BeforeTest
	public void basePageNavigation() throws IOException
	{
		driver=initializeDriver();
		driver.get("http://www.automationpractice.com/index.php");
		driver.manage().window().maximize();
		
	}

	@Test(priority=0)
	public void LandPage() throws IOException {
		objLandingPage = new LandingPage(driver);
		objLandingPage.signInTest();
		
	}
	
	@Test(priority=1)
	public void LogIn() throws IOException {
		driver=initializeDriver();
		driver.get("http://www.automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		objLoginPage = new LoginPage(driver);
		objLoginPage.logInTest();
		}
	
	@Test(priority=2)
	public void CheckOut() throws IOException {
		driver=initializeDriver();
		driver.get("http://www.automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		objCheckoutPage = new CheckoutPage(driver);
		objCheckoutPage.checkoutTest();
	}
	
	@AfterTest
	public void close() {
	driver.close();
		
	}

}