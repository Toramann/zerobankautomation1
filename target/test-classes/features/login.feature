

Feature: User should be able to login
  Scenario: Login as a User
    Given the user is on the login page
    When the user enters the User information
    Then  the user should be able to login


  Scenario Outline: Login as invalid Cridentails
    Given the user is on the login page
    When the user enter invalid "<username>" and "<password>"
    Then the user should see error message

    Examples:
  |username | password  |
  |user     | password  |
  |username | pass      |
  |         | password  |
  |username |           |
  |         |           |