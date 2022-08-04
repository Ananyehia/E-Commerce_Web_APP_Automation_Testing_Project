@smoke
  Feature: F08_Wishlist | user could add products to wishlist successfully
    Scenario: user could add one product to wishlist
      Given user go to Home Page
      When user click on wishlist button of a product
      Then success message appears

    Scenario: user could check his wishlist and the items inside it
      Given user go to Home Page
      When user click on wishlist button of a product
      And  user wait until success message disappear
      And  user click on Wishlist Tab
      Then user check products quantity on his wishlist