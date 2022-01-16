Feature: User login
  Scenario Outline: User login with multiple data
    Given User go to home page of
    When User go to profile and visit login page
    Then Fill up login information with "<UserName>" and "<Password>"
    And Login Unsuccessful or login successful checking "<UserName>"

    Examples:
      |UserName         |Password   |
      |ashiq6@gmail.com |Ashiq@1234 |
      |ashiq3@gmail.com |Ashiq@1234 |
      |ashiq2@gmail.com |Ashiq@1234 |