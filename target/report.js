$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/features/Deals.feature");
formatter.feature({
  "name": "Entering deals feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Without examples",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "As a user should be able to launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageBDD.user_opens_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user entering the username and password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageBDD.user_enters_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the deals",
  "keyword": "Then "
});
formatter.match({
  "location": "DashBoardBDD.user_enters_the_deals()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Entering all the details in deals Page",
  "keyword": "And "
});
formatter.match({
  "location": "DealsPageBDD.entering_all_the_details_in_deals_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Logout from the application page",
  "keyword": "Then "
});
formatter.match({
  "location": "DashBoardBDD.validate_Homepage_title()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "With examples",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user entering the username and password",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageBDD.user_enters_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the deals",
  "keyword": "Then "
});
formatter.match({
  "location": "DashBoardBDD.user_enters_the_deals()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the list string lecture details are",
  "rows": [
    {
      "cells": [
        "title",
        "amount",
        "probability",
        "commision"
      ]
    },
    {
      "cells": [
        "Doe",
        "30",
        "Associate",
        "new"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "DealsPageBDD.theListStringLectureDetailsAre(String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Logout from the application page",
  "keyword": "Then "
});
formatter.match({
  "location": "DashBoardBDD.validate_Homepage_title()"
});
formatter.result({
  "status": "passed"
});
});