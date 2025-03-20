Feature: Searching for flights

  @web
  Scenario: A user searches for flights
    Given that the user is on the flight search page
    When user enters an unknown destination code
    Then a message will be displayed that no flights were found

  @rest
  Scenario: A system searches for flights
    Given system is is authorized to search
    When system searched for an unknown destination code
    Then a 404 status code is returned























