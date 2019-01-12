Feature: Create account of Facebook10
As a user u need to open Facebook home page and do the validation

Scenario: Validate First Name field101
Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present


Scenario: Validate create user multiple fields102
Given User need to be on Facebook login page
When User enters user "Ryan" first name
And User enters user "Jack" surname
Then User checks user "Ryan" first name is present
Then User Mobile field should be blank