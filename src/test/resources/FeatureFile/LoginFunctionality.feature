Feature: Login Functionality Feature

In order to ensure Login Functionality works,
I want to run the cucumber test to verify it is working


@regression    @Smoke 
Scenario: Login Functionality

Given user navigates to http://automationpractice.com
When user logs in using Username as “USER” and Password “PASSWORD”
Then login should be successful

@regression
Scenario: Login Functionality

Given user navigates to http://automationpractice.com
When user logs in using Username as "ozclk.erkn@gmail.com" and Password "pasword"
Then error message should be thrown