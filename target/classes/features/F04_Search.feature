@smoke
  Feature: F04_Search | user could search for any products on the website
    Scenario Outline: user could search using Product name
      Given user go to Home Page
      When user write <productName> in search field
      And user click search button
      Then user go to search results page
      And user find that the search shows relevant results to the <productName>
      Examples:
        | productName |
        | book        |
        | laptop      |
        | nike        |

    Scenario Outline: user could search for product using sku
      Given user go to Home Page
      When user search for Products by <sku>
      And user click search button
      Then user find the searched product and open it
      And user find that the sku in the product page contains the <sku> that was used in search

      Examples:
        | sku |
        | SCI_FAITH |
        | APPLE_CAM |
        | SF_PRO_11 |




