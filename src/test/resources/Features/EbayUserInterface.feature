Feature: validate ebay service

  Scenario: validate the ebay ui
    Given user navigates to ebay
    And user has landed on the main page
    And user searches for "mazda mx-5"
    And user can see the search results for "Mazda MX-5"
    And log the number of obtained search results
    And user clicks on check button for "Manual" label
