Feature: Application Login

@SmokeTest
Scenario: Home page default login
Given User is on Netbanking landing page
When User login into application with username with "eve" and password "excel123"
Then Home page is populated
And Cards are displayed are "true"