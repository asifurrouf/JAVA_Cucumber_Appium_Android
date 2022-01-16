Feature: New User Register

  Scenario: New User registration
    Given User navigate to Bikroy homepage
    When User go to registration page and enter in use your email
    When Fill up the form by given data
     |Name |Email           |Password   |ConfirmPassword |
     |Qups2 |ashiq.new1@gmail.com |Ashiq@1234  |Ashiq@1234   |

    Then Click on Contine
    And User go to home page


