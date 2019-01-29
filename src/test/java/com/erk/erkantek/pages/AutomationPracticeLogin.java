package com.erk.erkantek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.erk.erkantek.utilities.Driver;

public class AutomationPracticeLogin {
	
	public AutomationPracticeLogin() {
		PageFactory.initElements(Driver.getDriver(), this);
		
	}
	
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement emailAsUserName;
	
	@FindBy(xpath="//input[@id='passwd']")
	public WebElement password;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	public WebElement submitButton;
	 
	@FindBy(xpath="//span[.='erkan ozclk']")
	public WebElement erkozcelik;
	
	@FindBy(xpath="//p[.='There is 1 error']")
	public WebElement errorMassage;
	 
	 

}
