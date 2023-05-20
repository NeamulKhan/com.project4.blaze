Feature: This feature is for cart functionality

@Cart

Scenario: verify item added in cart

Given Launch "<URL>" 
Then click sony vaio i5
Then click add to cart button
Then click cart link
Then verify item added in the cart


