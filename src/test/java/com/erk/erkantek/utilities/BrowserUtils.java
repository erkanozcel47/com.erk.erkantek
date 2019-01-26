package com.erk.erkantek.utilities;

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
	
	

}
