@AmazonTest
Feature: Amazon Links

  Background: 
    Given Launch "https://www.amazon.in/"

  @SmokeTest
  Scenario: To validate Sell Link
    When I Click on Sell Link
    Then Sell Page should open

  @BestSellerLink
  Scenario: To Validate Best Sellers Link
    When I Click on Best Sellers link
    Then Best Sellers page should open

  @MobileLink
  Scenario: To Validate Mobile Link
    When I Click on Mobile Link
    Then Mobiles Page should open

  @FashionLink
  Scenario: To validate Fashion Link
    When I Click on Fashion Link
    Then Fashion page should open
