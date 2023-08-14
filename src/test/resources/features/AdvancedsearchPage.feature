Feature: Advances search
  Scenario: Advanced search with a valid keyword
    Given user needs to go to main page of Google Scholar
    Then user needs verify the page title
    And user needs click on left side button on the top
    Then user needs click Advanced search option
    And user should be in the advanced search
    Then user should be able to enter multiple search criteria such as author, publication year and key words
    And user should be able to click search button
    Then user verifies that relevant search results are displayed