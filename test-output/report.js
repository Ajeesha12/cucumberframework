$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Admin/eclipse-workspace/NOC_BDDFrameork/src/main/java/Features/deals.feature");
formatter.feature({
  "line": 1,
  "name": "Deals data management",
  "description": "",
  "id": "deals-data-management",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Deals data creation",
  "description": "",
  "id": "deals-data-management;deals-data-creation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is already in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Title of login page is freeCRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter username and password",
  "rows": [
    {
      "cells": [
        "test1@mailinator.com",
        "Ajeesha@29"
      ],
      "line": 7
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Verify the title of home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user moves to deals page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user navigate to new deals page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "enter data details",
  "rows": [
    {
      "cells": [
        "Mr.",
        "test1company",
        "",
        "testproducts",
        "testcompany",
        "testtag"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "select save button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "dealstepdefinition.user_is_already_in_login_page()"
});
formatter.result({
  "duration": 15556964581,
  "status": "passed"
});
formatter.match({
  "location": "dealstepdefinition.title_of_login_page_is_freeCRM()"
});
formatter.result({
  "duration": 34485162,
  "status": "passed"
});
formatter.match({
  "location": "dealstepdefinition.enter_username_and_password(DataTable)"
});
formatter.result({
  "duration": 425684215,
  "status": "passed"
});
formatter.match({
  "location": "dealstepdefinition.user_clicks_on_login_page()"
});
formatter.result({
  "duration": 109163385,
  "status": "passed"
});
formatter.match({
  "location": "dealstepdefinition.verify_the_title_of_home_page()"
});
formatter.result({
  "duration": 6429350,
  "status": "passed"
});
formatter.match({
  "location": "dealstepdefinition.user_moves_to_deals_page()"
});
formatter.result({
  "duration": 6267579680,
  "status": "passed"
});
formatter.match({
  "location": "dealstepdefinition.user_navigate_to_new_deals_page()"
});
formatter.result({
  "duration": 204255671,
  "status": "passed"
});
formatter.match({
  "location": "dealstepdefinition.enter_and(DataTable)"
});
formatter.result({
  "duration": 1262903283,
  "status": "passed"
});
formatter.match({
  "location": "dealstepdefinition.select_save_button()"
});
formatter.result({
  "duration": 131823915,
  "status": "passed"
});
formatter.match({
  "location": "dealstepdefinition.close_the_browser()"
});
formatter.result({
  "duration": 723766742,
  "status": "passed"
});
});