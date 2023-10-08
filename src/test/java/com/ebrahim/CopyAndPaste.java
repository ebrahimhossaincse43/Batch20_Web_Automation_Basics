package com.ebrahim;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CopyAndPaste extends BaseDriver {

	String url = "https://demoqa.com/automation-practice-form";

	@Test
	public void copyPaste() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();

		Actions action = new Actions(driver);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("Ebrahim Hossain");
		Thread.sleep(2000);
		
		//Select 
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		//Copy
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		//Tab
		action.sendKeys(Keys.TAB);
		action.build().perform();
		
		//paste
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		Thread.sleep(5000);
	}
}
