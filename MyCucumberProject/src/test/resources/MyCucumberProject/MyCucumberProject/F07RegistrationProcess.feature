Feature: Registration Process

  Background: 
    Given Launch registration page

  Scenario: To validate registration process with valid data
    When Enter following data
      | Anand  | Kumar  | anand@gmail.com  | 9898989898 | Ranchi   |
      | Nikita | Sharma | nikita@gmail.com | 7878787878 | Hydrabad |
      | Gagana | G      | gagana@gmail.com | 8787878787 | Hassan   |
    Then Registration process should successful
