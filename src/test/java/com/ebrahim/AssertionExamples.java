package com.ebrahim;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExamples extends BaseDriver {

	String url = "https://www.amazon.com/";

	@Test (priority = 0)
	public void assertTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);

		String expectedTitle = "mazon.com. Spend less. Smile more.";
		String actualTitle = driver.getTitle();

		//Hard Assertion
		//Assert.assertEquals(actualTitle, expectedTitle);
		
		//Soft Assertion
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expectedTitle, actualTitle);
		
		System.out.println("Hello.....");
		
		softAssert.assertAll();
	}
	
	@Test (priority = 1)
	public void second() {
		System.out.println("2nd Test");
	}
}
