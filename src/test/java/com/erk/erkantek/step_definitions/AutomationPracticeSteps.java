package com.erk.erkantek.step_definitions;

import org.junit.Assert;

import com.erk.erkantek.pages.AutomationPracticeLogin;
import com.erk.erkantek.utilities.ConfigurationReader;
import com.erk.erkantek.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AutomationPracticeSteps {
	
	AutomationPracticeLogin automate;

@Given("user navigates to http:\\/\\/automationpractice.com")
public void user_navigates_to_http_automationpractice_com() {
	 
	Driver.getDriver().get(ConfigurationReader.getProperty("urlAutoWeb"));
}

@When("user logs in using Username as “USER” and Password “PASSWORD”")
public void user_logs_in_using_Username_as_USER_and_Password_PASSWORD() {
	automate = new AutomationPracticeLogin();
	automate.emailAsUserName.sendKeys("ozclk.erkn@gmail.com");
	automate.password.sendKeys("password");
	automate.submitButton.click();
	
	
}

@Then("login should be successful")
public void login_should_be_successful() {
	automate = new AutomationPracticeLogin();
	String actualName = automate.erkozcelik.getText();
	String expectedName = "erkan ozclk";

	Assert.assertEquals(expectedName, actualName);
	
	
}


@When("user logs in using Username as {string} and Password {string}")
public void user_logs_in_using_Username_as_and_Password(String userName, String password) {
	
	automate = new AutomationPracticeLogin();
 	automate.emailAsUserName.sendKeys(userName);
 	automate.password.sendKeys(password);
 	automate.submitButton.click();
	
}




@Then("error message should be thrown")
public void error_message_should_be_thrown() {
    
	automate = new AutomationPracticeLogin();
	String expectedError="There is 1 error";
	Assert.assertEquals(expectedError,automate.errorMassage.getText());
	
	
}

















}
