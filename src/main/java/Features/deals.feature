Feature: Deals data management
Scenario: Deals data creation

Given User is already in login page
When Title of login page is freeCRM
When user enter username and password
|test1@mailinator.com|Ajeesha@29|
Then user clicks on login page
Then Verify the title of home page
Then user moves to deals page
Then user navigate to new deals page
Then enter data details
|Mr.|test1company||testproducts|testcompany|testtag|
Then select save button
Then close the browser