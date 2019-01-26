package com.erk.erkantek.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BrowserUtils {
	
	/*
	 * It will take a target title and it can handle an opened window.
	 * 
	 * */
	
	public static void switchToWindows(String targetTitle) {
		
		String origin = Driver.getDriver().getWindowHandle();
		for (String handle : Driver.getDriver().getWindowHandles()) {
			Driver.getDriver().switchTo().window(handle);
			if(Driver.getDriver().getTitle().equals(targetTitle)) {
				return;
			}
		}
		Driver.getDriver().switchTo().window(origin);
	}
	
	
	/*
	 * This method is hover over an element. 
	 * it uses actions class and after that uses movetoelement() method 
	 * basically the end perform the action.
	 * */
	
	public static void hover(WebElement element) {
		Actions action = new Actions(Driver.getDriver());
		action.moveToElement(element).perform();
	}
	

}
