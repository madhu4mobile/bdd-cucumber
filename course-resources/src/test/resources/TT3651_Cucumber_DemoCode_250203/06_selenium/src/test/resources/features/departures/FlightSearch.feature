Feature: Searching for flights

  Scenario: Search for flights to destination
    Given the user has navigated to the search page
    When the user searches for destination code LAX
    Then the page should show flights to Los Angeles