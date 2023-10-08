package com.ebrahim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownExamples extends BaseDriver {

	String url = "https://www.amazon.com/";

	@Test
	public void dropDownTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);

		WebElement options = driver.findElement(By.id("searchDropdownBox"));
		Select select = new Select(options);

		// Index
		select.selectByIndex(5);
		Thread.sleep(3000);

		// text
		select.selectByVisibleText("Computers");
		Thread.sleep(3000);

	}

}
