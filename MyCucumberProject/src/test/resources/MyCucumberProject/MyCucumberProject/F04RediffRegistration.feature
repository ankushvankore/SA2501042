Feature: Registration process on rediff page

  Background: 
    Given Launch Rediffmail site

  Scenario: To validate registration process on rediff with valid data
    When Enter fullName as "Kanav Vij"
    When Enter rediffid as "kanavvijrajasthan"
    When Enter choose password as "Kanav@123"
    When Enter Confirm Password as "Kanav@123"
    And Click on Check Availablity
    Then Availablity message should display

  Scenario: To validate registration process on rediff with invalid data
    When I Enter fullName as "Meena P"
    When I Enter rediffid "meenapfromuk"
    When I Enter choose password "Meena@123"
    When I Enter Confirm Password "Meena@123"
    And I Click on Check Availablity
    Then I should get Availablity message
