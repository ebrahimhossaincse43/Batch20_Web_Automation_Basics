package com.ebrahim;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class IncognitoMode extends BaseDriver{

	String url = "https://www.amazon.com/";
	
	@Test
	public void openIncognito() throws InterruptedException, AWTException {
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.delay(100);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.delay(100);
		robot.keyPress(KeyEvent.VK_N);
		robot.delay(100);
		
		robot.keyRelease(KeyEvent.VK_N);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(100);
		
		driver.switchTo().window(windowHandling().get(1));
		driver.get(url);
		Thread.sleep(5000);
		
		driver.switchTo().window(windowHandling().get(0));
		driver.get(url);
		Thread.sleep(5000);
	}
	
	public List<String> windowHandling() {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandleList = new ArrayList<String>(windowHandles);
		return windowHandleList;
	}
	
}
