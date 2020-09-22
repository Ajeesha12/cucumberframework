Feature: NOC Login feature

#Scenario: NOC Login Test Scenario
#Given User is already on login page
#When title of login page is ASPCL NOC Portal
#Then user enters "vishnu" and "12345678@"
#Then user clicks on login
#Then user is on home page


Scenario Outline: NOC Login Test Scenario
Given User is already on login page
When title of login page is ASPCL NOC Portal
Then user enters "<username>" and "<password>"
Then user clicks on login
Then user is on home page
Then close the browser
Examples:
 |username|password|
 |vishnu  |12345678@|
 |Messi   |12345678@|