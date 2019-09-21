Feature: Oracle Login

Scenario: To Check Login Functionality with Valid Username 
and valid password.

Given Chrome is Opened and Login Page is displayed
When User enters userName and password
And Click on Login button
Then Home Page should display