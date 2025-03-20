Feature: Searching for flighs
  Users are capable of searching for departing flights

  Scenario: Performing a search for an unknown destination
  User enters a destination that is not known in the system
    Given that the users is on the flight search page
    When user enters an unknown destination code
    Then a message will be displayed that no flights were found

  Scenario: Performing a search without providing destination
  User enters NO destination
    Given that the users is on the flight search page
    When user enters no destination code
    Then a message will be displayed that no flights were found