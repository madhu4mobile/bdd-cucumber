Feature: Google Homepage
  This feature verifies the functionality on Google's Homepage

  Scenario: Check that the main elements on Google's Homepage are displayed
    Given a browser has been launched
    When Google Homepage is opened
    Then verify that the page displays a search text box
    And the page displays the Google Search button
