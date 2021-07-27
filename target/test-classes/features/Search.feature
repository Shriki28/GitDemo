Feature: Search and place order for vegetables

@SeleniumTest1
Scenario: Search for items and validate results
Given User is on GreenKart landing page
When User searched for Cucumber vegetable
Then "Cucumber" results are displayed


@SeleniumTest2
Scenario Outline: Search for items and then move to checkout page
Given User is on GreenKart landing page
When User searched for <Vegetablename> vegetable
And Added items to cart
And User proceeded to checkout page to purchase
Then Verify selected <Vegetablename> items are displayed in checkout page

Examples:
|Vegetablename |
|Brinjal |
|Beetroot |
