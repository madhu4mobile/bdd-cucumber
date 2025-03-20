Feature: Google Homepage
  This feature verifies the functionality on Google Homepage

  Scenario: Check that main elements on Google Homepage are displayed
    Given a browser has been launched
    When Google Homepage is opened
    Then verify that the page displays search text box
    And the page displays Google a Search button

  Scenario: Check that a search returns the expected results
    Given a browser has been launched
    When A search is done for Cucumber
	And the search button is clicked
    Then The search results should contain content about harvesting cucumbers