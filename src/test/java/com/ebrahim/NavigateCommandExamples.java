package com.ebrahim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NavigateCommandExamples extends BaseDriver{
	
	String url = "https://www.daraz.com.bd/";
	
	@Test
	public void navigateTest() throws InterruptedException {
		
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement loginButton = driver.findElement(By.xpath("//a[@class='bld-txt']"));
		loginButton.click();
		Thread.sleep(3000);
		
		//Back
		driver.navigate().back();
		Thread.sleep(3000);
		
		//Forward
		driver.navigate().forward();
		Thread.sleep(3000);
		
		//Refresh
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.google.com");
		Thread.sleep(3000);
		
	}

}
