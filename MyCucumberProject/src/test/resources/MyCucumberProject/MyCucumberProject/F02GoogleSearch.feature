Feature: Google Search

  Scenario: To validate Search functionality on Google
    Given Open Google in Browser
    When Enter text to be searched
    And Hit enter
    Then A valid search result should display
