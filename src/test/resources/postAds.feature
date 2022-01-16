Feature: User can sell something

  Background: user will go to add post page
    Given user go to home page
    And user click on post add btn
    When user will login
      |ashiq3@gmail.com |Ashiq@1234 |
  Scenario Outline: User can give ads for all product
    When user click on "<Item>"
    Then user will fill all the requirements of "<Item>"
    And Go to home page and logout
    Examples:

     |  Item  | Heading |
     |   1  |  car      |
     |   2  | MotorBike |
     |   3  | Mobile    |
     |   4  | Property  |
