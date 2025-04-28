Feature: Registration Process

  Background: 
    Given Launch registration page

  Scenario: To validate registration process with valid data
    When Enter following data
      | Anand  | Kumar  | anand@gmail.com  | 9898989898 | Ranchi   |
      | Nikita | Sharma | nikita@gmail.com | 7878787878 | Hydrabad |
      | Gagana | G      | gagana@gmail.com | 8787878787 | Hassan   |
    Then Registration process should successful

  Scenario: To validate registration process with valid data with header
    When Enter data as follows
      | FirstName | LastName | EmailId           | ContactNo  | Address |
      | Shardul   | B        | shardul@gmail.com | 7878787878 | Satara  |
      | Hema      | Kumari   | hema@gmail.com    | 8989898989 | Manjer  |
      | Trisha    | Roy      | trisha@gmail.com  | 7474747474 | Kolkata |
    Then Registration process should be successful
