package com.ebrahim;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScrollExamples extends BaseDriver{
	
	String url = "https://www.amazon.com/";
	
	@Test
	public void testScroll() throws InterruptedException {
		 driver.manage().window().maximize();
		 driver.get(url);
		 Thread.sleep(5000);
		 
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		 //Specific
		 WebElement locaton = driver.findElement(By.xpath("//div[contains(text(),'Make Money with Us')]"));
		 js.executeScript("arguments[0].scrollIntoView(true);", locaton);
		 Thread.sleep(5000);
		 
		 //Top
		 js.executeScript("window.scrollTo(0,0)");
		 Thread.sleep(5000);
		 
		 //Down
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 Thread.sleep(5000);
	}

}
