Feature: Try Data Driven Testing using Cucumber

  Scenario Outline: Validate DDT on Try Testing
    Given Launch "https://trytestingthis.netlify.app/" in browser
    When I Enter "<FirstName>"
    When I Enter the "<LastName>"
    When I Select the "<Gender>"
    Then Process should complete

    Examples: 
      | FirstName | LastName | Gender |
      | Tamana    | S        | Female |
      | Rithik    | P        | Male   |
      | Gagana    | G        | Female |
      | Mayura    | Jadhav   | Female |
