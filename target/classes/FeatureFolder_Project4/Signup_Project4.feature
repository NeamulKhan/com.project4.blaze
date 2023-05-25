Feature: this feature is for sign up functionality

@Signup

Scenario: verify user can successfully sign up with valid credential


Given Launch "<URL>" 
Then click Sign up  link
Then enter username and password and click Sign up button
Then verify user successfully able to sign up