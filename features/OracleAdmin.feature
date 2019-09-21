Feature: Oracle Admin

Scenario: To Check Login Functionality with Valid Username 
and valid password.

Given Chrome is Opened and Login Page is displayed
When User enters "Sys" and "Newuser123"
And Click on Login button
Then Home Page should display
And Click On Administration Link
And Click On Database User
Then Database Page should Open
And Click on create
And Enter User Details
Then User should be Created