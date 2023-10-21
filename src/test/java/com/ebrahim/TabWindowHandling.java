package com.ebrahim;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class TabWindowHandling extends BaseDriver{
	String url = "https://www.amazon.com/";
	String secondUrl = "https://www.daraz.com.bd/";
	
	@Test
	public void TabTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		
		String orginalTab = driver.getWindowHandle();
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		String secondTab = driver.getWindowHandle();
		driver.get(secondUrl);
		Thread.sleep(3000);
		
		driver.switchTo().window(orginalTab);
		Thread.sleep(3000);
		
		driver.switchTo().window(secondTab);
		Thread.sleep(3000);
		
	}
		
}
