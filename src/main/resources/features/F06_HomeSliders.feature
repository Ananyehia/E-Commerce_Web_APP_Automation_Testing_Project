@smoke
  Feature: F06_HomeSliders | user choose from home page sliders
    Scenario: user choose first slider Nokia Lumia
      Given user go to Home Page
      When user choose first slider
      And user click on image of first Slider
      Then user go to first Slider page

    Scenario: user choose second slider IPhone
      Given user go to Home Page
      When user choose second slider
      And user click on image of second slider
      Then user go to second Slider page

