Feature: Oracle Login

Scenario Outline: To Check Login Functionality with Valid Username and valid password

Given Chrome is Opened and login page is displayed
When User enters "<UN>" and "<PWD>"
And click on login button
Then Home Page should display

Examples:
|UN|PWD|
|abcuser|abcuser123|
|xyzuser|xyzuser123|