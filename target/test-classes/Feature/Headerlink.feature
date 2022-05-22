

Feature: Validation homepage link in header page
@home
Scenario: verify homepage link dispplayed in header page

 Given Launch "<URL>"
 When Click on Home link
 Then verify home link  is displayed

@contect
Scenario: verify contect link is displayed in header page
Given Launch "<URL>"
When Click on contect link
Then verify contect link  is enabled


@aboutus
Scenario: verify aoutus link is displayed in header page
Given Launch "<URL>"
When Click on about us link
Then verify about us link  is displayed


@cart2
Scenario: Validate cart link displayed in header page
Given Launch "<URL>"
When Click on cart button
Then verify cart link  is displayed


@login
Scenario: Validate login link displayed in header page

Given Launch "<URL>"
When Click on Login link
Then verify Login link  is displayed




