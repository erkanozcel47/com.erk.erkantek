package com.erk.erkantek.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	/**
	 * I create a method that return wait for stopping execution, 
	 * so used thread sleep with try catch method.
	 * i used {@link InterruptedException} exception.
	 * */
	
	public static void waitFor(int second) {
		try {
			Thread.sleep(second*1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	 
	/**
	 * I create a method that it returns when Selenium can`t find any element 
	 * it will wait for certain time for element to be visible. 
	 * 
	 * */
	public static WebElement waitForVisibilty(WebElement element, int timeToWaitInSecond) {
		
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeToWaitInSecond);
		return wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	/**
	 * I created this method that it returns a certain element and 
	 * wait for that element to be visible for certain time. it uses wit locater.
	 * */
	public static WebElement waitForVisibilty(By locator,int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeOut);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	/**
	 * In this method we wait for clickablity.
	 * @param WebDriverWait
	 * @return ExpectedConditions
	 * */
	
	public static WebElement waitForClickablility(WebElement element, int timeout) {
		
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	
	}

	/**
	 * In this method we wait for clickablity.
	 * @param WebDriverWait
	 * @return ExpectedConditions
	 * */

	public static WebElement waitForClickablility(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	
	
	
	
	
	
	
	
	

}
