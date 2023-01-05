Feature: This feature is for login functionality





@Cart
Scenario: Verify user can login with valid card
Given MetaLunch "<URL>"
Then Click Login Link
Then Enter Username and Enter Pasword and Click Login button
Then Verify user can login with valid card 

