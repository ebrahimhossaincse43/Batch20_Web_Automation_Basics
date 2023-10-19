package com.ebrahim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class VisibilityExamples extends BaseDriver{

	String url = "https://demo.nopcommerce.com/";

	@Test
	public void locatorTest() throws InterruptedException {

		driver.get(url);
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("mall-searchterms"));
		
		try {
			if(search.isSelected()) {
				search.click();
				search.sendKeys("Macbook");
				Thread.sleep(5000);
				//Report
			}
	
		} catch (Exception e) {
			//Report
		}
		
		// ID
		
		
	}
	
}
