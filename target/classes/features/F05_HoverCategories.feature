@smoke
Feature: F05_HoverCategories | user could choose from Categories in Home Page
 Scenario: user hover on main Categories and select Category Successfully
   Given user go to Home Page
   When user hover on one of the three main Categories
   And  user select one of the three sub-Categories and get the text of it
   Then the sub-Category page is opened
