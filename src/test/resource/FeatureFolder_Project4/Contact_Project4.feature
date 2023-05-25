Feature: This feature is for contact link functionality

@Contact

Scenario: verify contact link works successfully

Given Launch "<URL"
Then click contact link
Then enter email,name, message and click send message button
Then verify received msg and click ok button