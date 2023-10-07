package com.ebrahim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorExamples extends BaseDriver {

	String url = "https://demo.nopcommerce.com/";

	@Test
	public void locatorTest() throws InterruptedException {

		driver.get(url);
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(driver.getTitle());
		
		// ID
		WebElement search = driver.findElement(By.id("small-searchterms"));
		search.click();
		search.sendKeys("Macbook");
		Thread.sleep(5000);

		WebElement login = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
		login.click();
		Thread.sleep(5000);

		WebElement text = driver.findElement(By.xpath("//div[contains(text(),'By creating an account on our website, you will be')]"));
		System.out.println(text.getText());
		String font = text.getCssValue("font-size");
		System.out.println("Font: "+font);
		
		String color = text.getCssValue("background-color");
		System.out.println("Color: "+color);
		
		// By Name
		WebElement email = driver.findElement(By.name("Email"));
		email.clear();
		email.sendKeys("test@noemail.com");
		System.out.println(email.getAttribute("data-val-required"));
		Thread.sleep(5000);

		// LinkText
//		WebElement forgetPass = driver.findElement(By.linkText("Forgot password?"));
//		forgetPass.click();
//		Thread.sleep(5000);

		// Partial LinkText
		WebElement forgetPass = driver.findElement(By.partialLinkText("Forgot"));
		forgetPass.click();
		Thread.sleep(5000);
		
		//TagName[@AttributeName='value']
		//*[@AttributeName='value']
		//*[contains(text(),'value')]
		

	}

}
