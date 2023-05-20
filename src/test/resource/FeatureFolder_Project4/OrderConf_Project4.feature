Feature: This feature is for order confirmation functionality


@OrderConf

Scenario: verify order confirmation after payment 

Given Launch "<URL>"
Then click place order button
Then enter name, country, city, credit card number, month and year and click purchase button
Then verify order confirmation received and click ok button 