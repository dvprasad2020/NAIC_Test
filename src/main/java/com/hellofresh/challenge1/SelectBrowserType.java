package com.hellofresh.challenge1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectBrowserType {
	public static WebDriver driver;
	public static WebDriverWait wait;
    public String existingUserEmail = "mflsqe@naic.org";
    public String existingUserPassword = "mflsqe1234";
    
	public WebDriver initializeDriver() throws IOException
	{
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\GeethuKarthu\\web-test-naic\\src\\main\\java\\com\\hellofresh\\challenge1\\InputData.properties");
	prop.load(fis);
	String browserType = prop.getProperty("Browser");
	System.out.println(browserType);
	if(browserType.equals("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GeethuKarthu\\web-test-naic\\src\\test\\java\\resources\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	else if(browserType.equals("Firefox"))
	{
		System.out.println("Initialization of FireFox Browser code goes here...");
		driver=new FirefoxDriver();
	}
	else if(browserType.equals("InternetExplorer"))
	{
		System.out.println("Initialization of InternetExplorer Browser code goes here...");
		driver=new InternetExplorerDriver();
	}
	else
	{
		System.out.println("Incorrect Browser selection...");
		}
	wait = new WebDriverWait(driver, 10, 50);
	return driver;
	}
	}