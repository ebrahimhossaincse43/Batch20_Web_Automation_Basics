package com.ebrahim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestSample extends BaseDriver{

	String url = "https://temp-mail.org/en/";
	
	@Test
	public void browerCommandTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		
		Thread.sleep(5000);
		WebElement mail = driver.findElement(By.xpath("//input[@id='mail']"));
		
		System.out.println(mail.getText());
		
		
		
		
	}
	
}
