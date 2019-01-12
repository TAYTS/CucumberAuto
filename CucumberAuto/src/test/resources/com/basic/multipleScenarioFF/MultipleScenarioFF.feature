Feature: Create account of Facebook8
As a user u need to open Facebook home page and do the validation

Scenario: Validate First Name field81
Given User need to be on Facebook login page
When User enters user first name
Then User checks user first name is present
Then close browser


Scenario: Validate create user multiple fields82
Given User need to be on Facebook login page
When User enters user first name
And User enters user surname
Then User checks user first name is present
Then User Mobile field should be blank
Then close browser