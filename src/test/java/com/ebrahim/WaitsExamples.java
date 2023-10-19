package com.ebrahim;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitsExamples extends BaseDriver {

	String url = "https://demo.nopcommerce.com/";

	@Test
	public void locatorTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		
		//Implicit
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		WebElement search = (WebElement) wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("mall-searchterms")));
		
	}

}
