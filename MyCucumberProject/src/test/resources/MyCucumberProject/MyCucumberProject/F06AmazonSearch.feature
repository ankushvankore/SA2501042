Feature: Amazon Product Search

  Scenario: To validate search functionality on Amazon
    Given Launch Amazon site
    When Enter "Earphone Bellow" and 1000
    And Hit the enter key
    Then The correct products should display

    Scenario: To validate another search functionality
    When I Enter "IPhone under " and 10000
    And I Hit the enter key
    Then Correct products should display