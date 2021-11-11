Feature: Pay Bills
  Scenario: User should be able to pay
    Given the user is logged in
    When the user clicks pay bills on account activity page
    When Page should have the title "Zero - Pay Bills"
    When the user should be pay
    When  the user should not be pay without empty date or amount
    Then  amount and date should not alphebetical or special characters