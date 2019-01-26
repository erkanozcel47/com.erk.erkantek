package com.erk.erkantek.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
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
	/*
	 *  
	 * return a list of string from a list of element. it is included null elements. 
	 * @param list
	 * @return
	 * */
	public static List<String> getElementsText(List<WebElement> list){
		
		List<String> elemTexts = new ArrayList<>();
		for (WebElement element : list) {
			elemTexts.add(element.getText());
		}
		
		return elemTexts;
	}
	/*
	 *  
	 * return a list of string from a list of element by locator. it is not included null elements. 
	 * @param list
	 * @return
	 * */
	public static List<String> getElementText(By locator) {
		List<WebElement> elements= Driver.getDriver().findElements(locator);
		List<String> elementTexts = new ArrayList<>();
		
		for(WebElement elem :elements ) {
			if(!elem.getText().isEmpty()) {
				elementTexts.add(elem.getText());
			}
			
		}
		return elementTexts;
	}
	
	

}
