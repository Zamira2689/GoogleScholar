@automation1
Feature: Home Page

  Scenario: Basic search with a valid keyword
    Given user needs to go to main page of Google Scholar
    Then user needs verify the page title
    Then user should be able to enter some valid keywords in the search bar
    And user should click on the search button
    Then user verifies that relevant search results are displayed