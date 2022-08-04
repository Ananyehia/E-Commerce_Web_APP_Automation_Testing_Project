@smoke
  Feature: F07_FollowUs |users could open followUs links

    Scenario: user opens facebook link
      Given user go to Home Page
      When user opens facebook link
      Then "https://www.facebook.com/nopCommerce" is opened in new tab

    Scenario: user opens twitter link
      Given user go to Home Page
      When user opens twitter link
      Then "https://twitter.com/nopCommerce" is opened in new tab
# Scenario 3 rss icon does not open new tab
    Scenario: user opens rss link
      Given user go to Home Page
      When user opens rss link
      Then "https://demo.nopcommerce.com/new-online-store-is-open" is opened in new tab

    Scenario: user opens youtube link
      Given user go to Home Page
      When user opens youtube link
      Then "https://www.youtube.com/user/nopCommerce" is opened in new tab