Feature: Login Functionality Feature

In order to ensure Login Functionality works,
I want to run the cucumber test to verify it is working


@temp
Scenario Outline: Login Functionality

Given user navigates to http://automationpractice.com
When user logs in using Username as <UserName> and Password <Password>
Then login should be successful

     Examples:
              |UserName                |Password         |
              |ozclk.erkn@gmail.com    |password         |
              |ozclk.erkn@gmail.com    |passwor          |
              |ozclk.erkn@gmail.com    |passwo           |
             
 