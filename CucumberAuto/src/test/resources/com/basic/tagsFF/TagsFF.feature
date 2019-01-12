@Important
Feature: Create account of Facebook11
As a user u need to open Facebook home page and do the validation

@Smoke
Scenario: Validate First Name field111
Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present
Then close browser

@Smoke @Regression
Scenario: Validate create user multiple fields112
Given User need to be on Facebook login page
When User enters user "Ryan" first name
And User enters user "Jack" surname
Then User checks user "Ryan" first name is present
Then User Mobile field should be blank
Then close browser


Scenario: Validate First Name field113
Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present
Then close browser

@Regression
Scenario: Validate First Name field114
Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present
Then close browser

@Smoke
Scenario: Validate First Name field115
Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present
Then close browser