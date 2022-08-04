@smoke
  Feature: F03_currencies | users could change currency
    Scenario: user could change currency to Euro successfully
      Given user go to Home Page
      When user select euro currency from the dropdown list on the top left of home page
      Then the products in home page is displayed in Euro Currency