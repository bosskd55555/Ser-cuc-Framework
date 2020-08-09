$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/features/Login.feature");
formatter.feature({
  "name": "As a user, should be able to verify the deals page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Sanity"
    }
  ]
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