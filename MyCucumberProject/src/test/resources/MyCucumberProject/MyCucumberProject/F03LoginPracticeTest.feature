Feature: Login on Practice Test Site

  Background: 
    Given Launch Practice Test site

  Scenario: To validate login on paractice test site with valid data
    When Enter valid user name
    When Enter valid password
    And Click on Login button
    Then Home page should display

  Scenario: To validate login on paractice test site with invalid data
    When Enter invalid user name
    When Enter invalid password
    And Click on Submit button
    Then Error message should display
