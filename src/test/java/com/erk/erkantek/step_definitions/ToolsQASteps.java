package com.erk.erkantek.step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.erk.erkantek.pages.ToolsQA;
import com.erk.erkantek.utilities.ConfigurationReader;
import com.erk.erkantek.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolsQASteps {

	ToolsQA tools;
	WebDriver driver;
	
	
	
	@Given("user on practice automation page")
	public void user_on_practice_automation_page() {

	//Driver.getDriver().get(ConfigurationReader.getProperty("url"));
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://www.google.ca/");
 		 tools = new ToolsQA();
 		 tools.firstName.sendKeys("Erk");
		
	}

	@When("user enter the credentials")
	public void user_enter_the_credentials() {
 		 tools = new ToolsQA();
 		 tools.lastName.sendKeys("Erk");
	 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
