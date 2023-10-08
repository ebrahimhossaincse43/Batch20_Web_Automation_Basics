package com.ebrahim;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertExamples extends BaseDriver{
	
	String url = "https://demoqa.com/alerts";
	
	@Test
	public void alertTest() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();

		
		WebElement alert1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
		alert1.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		
		WebElement alert2= driver.findElement(By.xpath("//button[@id='confirmButton']"));
		alert2.click();
		Thread.sleep(3000);
		alert.dismiss();
		Thread.sleep(3000);
		
		WebElement alert3= driver.findElement(By.xpath("//button[@id='promtButton']"));
		alert3.click();
		Thread.sleep(2000);
		alert.sendKeys("Hello...");
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(3000);
		
	}

}
