package com.hellofresh.challenge1;

import java.io.IOException;

import org.testng.annotations.Test;

public class InvokeURLTest extends SelectBrowserType{
	
	@Test
	public void basePageNavigation() throws IOException
	{
		driver=initializeDriver();
		driver.get("http://www.automationpractice.com/index.php");
	}

}
