package com.ebrahim;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FirstAutomation extends BaseDriver{
	
	
	String url = "https://www.selenium.dev/downloads/";
	
	@Test
	public void openUrl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		//Thread.sleep(10000); //1000ms = 1s
		
		driver.findElement(By.xpath("//span[contains(text(),'Blog')]")).click();
		Thread.sleep(10000);
		
	}
	

}
