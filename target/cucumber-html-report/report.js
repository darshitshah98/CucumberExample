$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/OracleAdmin.feature");
formatter.feature({
  "name": "Oracle Admin",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To Check Login Functionality with Valid Username",
  "description": "and valid password.",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Chrome is Opened and Login Page is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "NewUserStep.chrome_is_Opened_and_Login_Page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Sys\" and \"Newuser123\"",
  "keyword": "When "
});
formatter.match({
  "location": "NewUserStep.user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "NewUserStep.click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Home Page should display",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUserStep.home_Page_should_display()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click On Administration Link",
  "keyword": "And "
});
formatter.match({
  "location": "NewUserStep.click_On_Administration_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click On Database User",
  "keyword": "And "
});
formatter.match({
  "location": "NewUserStep.click_On_Database_User()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Database Page should Open",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUserStep.database_Page_should_Open()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click on create",
  "keyword": "And "
});
formatter.match({
  "location": "NewUserStep.click_on_create()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Enter User Details",
  "keyword": "And "
});
formatter.match({
  "location": "NewUserStep.enter_User_Details()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "User should be Created",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUserStep.user_should_be_Created()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[User Created.]\u003e but was:\u003c[1 error has occurred\nUser already exists]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepDefination2.NewUserStep.user_should_be_Created(NewUserStep.java:71)\r\n\tat ✽.User should be Created(file:features/OracleAdmin.feature:15)\r\n",
  "status": "failed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});