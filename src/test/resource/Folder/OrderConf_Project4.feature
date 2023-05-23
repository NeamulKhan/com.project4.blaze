Feature: This feature is for order confirmation functionality

@Order_Conf

Scenario: verify order confirmation 

Given Launch "<URL>"
Then click sony vaio i5 and click add to cart
Then click cart link and click place order button
Then enter name,country,city,credit card,month,year and click purchase button
Then verify order confirmation received and click ok button
