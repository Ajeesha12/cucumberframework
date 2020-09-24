#Feature: FreeCRM Create contacts
#Scenario Outline: Free CRM create new contacts
#
#Given User is already in login page
#When Title of login page is freeCRM
#When user enter "<username>" and "<password>"
#Then user clicks on login page
#Then Verify the title of home page
#Then user moves to deals page
#Then user navigate to new deals page
#Then enter "<firstname>" and "<lastname>"
#Then select save button
#Then close the browser
#
#Examples:
#
#|username|password|firstname|lastname|
#|test1@mailinator.com|Ajeesha@29|Ajeesha|test|
#|test2@mailinator.com|Ajeesha@123|Jisha|new|