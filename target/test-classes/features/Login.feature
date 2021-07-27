Feature: Application Login

Background:
Given Validate Browser
When Brwoser is triggered
Then User launched the Application url

@RegTest
Scenario: Home page default login
Given User is on Netbanking landing page
When User login into application with username with "arvind" and password "excel123"
Then Home page is populated
And Cards are displayed are "true"

@SmokeTest
Scenario: Home page default login
Given User is on Netbanking landing page
When User login into application with username with "paul" and password "excel123"
Then Home page is populated
And Cards are displayed are "false"

@RegTest
Scenario: Home page default login
Given User is on Register landing page
When User sign up with following details
| john | abcd | john@abcd.com | Mysore | 9738037615 |
Then page is populated
And Card are displayed are "false"

@RegTest
Scenario Outline: Home page default login
Given User is on Netbanking landing page
When Users login into application with username with <Username> and password <Password>
Then Home page is populated
And Cards are displayed are "true"

Examples:
|Username |Password |
|User1    |pwd1     |
|User2    |pwd2     |
|User3    |pwd3     |