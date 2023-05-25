Feature: Verify user can successfully login

@Login

Scenario: Verify user can successfully login with valid credential

Given Launch "<URL>" 
Then click Log in  link
Then enter username and password and click Login button
Then verify user successfully log in with valid credentials
Then user successfully logout from account