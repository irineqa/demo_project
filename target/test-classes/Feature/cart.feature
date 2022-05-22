
@all
Feature: Validation Cart page

@S
Scenario: verify added product displyed on cart page for a register user

Given Launch "<URL>"
When Click log in
When Enter username and password and click log in
When Click on  Nokia lumia 1520 
When Click on add to cart button
When Click on cart button
Then Product displayed on cart page


@cart
Scenario: Verify added product displyed on cart page for a guest user

Given Launch "<URL>"
When  Click on Galaxy S6
When Click on add to cart button
When Click on cart button
Then Verify Product displayed on cart page

@title
Scenario: Varify product title on Cart page 
Given  Launch "<URL>"
When Click on NexUS S6
When Click on add to cart button
When Click on cart button
Then Verify product title is displayed


@price
Scenario:  Validate product price on Cart page 
Given Launch "<URL>"
When Click on Sony vaio i5
When Click on add to cart button
When Click on cart button
Then Verify product  price is displayed




@orderbutton
Scenario: Validate ored button in cart page
Given Launch "<URL>"
When Click on Sony vaio i5
When Click on add to cart button
When Click on cart button
Then Verify order button displayed on cart page



