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
		objLandingPage = new LandingPage();
		objLandingPage.initializeDriver();
		objLandingPage.signInTest();
		
	}
	
	@Test(priority=1)
	public void LogIn() {
		objLoginPage = new LoginPage();
		objLoginPage.logInTest();
		}
	
	@Test(priority=2)
	public void CheckOut() {
		objCheckoutPage = new CheckoutPage();
		objCheckoutPage.checkoutTest();
	}
	
	@AfterTest
	public void close() {
	driver.close();
		
	}

}