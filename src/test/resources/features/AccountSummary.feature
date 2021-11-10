
  Feature: Account Summary

    Background: login
      Given the user is logged in
    @wip
    Scenario: Account Summary Page
      Given Page should have the title Zero – Account summary
      When Account summary page have titles

        |Cash Accounts  |
      |Investment Accounts |
      |Credit Accounts|
      | Loan Accounts|
      Then Account table should have titles
      |Account     |
      |Credit Card |
      | Balance    |