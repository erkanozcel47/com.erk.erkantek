package com.erk.erkantek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.erk.erkantek.utilities.Driver;

public class ToolsQA {

	public ToolsQA() {
		
		PageFactory.initElements(Driver.getDriver() , this);
		
	}
	
	
	@FindBy(xpath="//input[@name='firstname']")
	public WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	public WebElement lastName;
	
	@FindBy(xpath="//input[@value='Male']")
	public WebElement genderMale;
	
	@FindBy(xpath="//input[@id='exp-4']")
	public WebElement experience;
 
	@FindBy(xpath="//input[@id='datepicker']")
	public WebElement date;
	
	@FindBy(xpath="//label[.=' Automation Tester']")
	public WebElement profession;
	 
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
