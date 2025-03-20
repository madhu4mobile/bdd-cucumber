Feature: Searching for flighs
  Users are capable of searching for departing flights

  Background:
    Given The user is authenticated
    And that the users is on the flight search page

  Scenario: Performing a search for an unknown destination
    User enters a destination that is not known in the system
    When user enters an unknown destination code
    Then a message will be displayed that no flights were found

  Scenario: Performing a search without providing destination
    User enters NO destination
    When user enters no destination code
    Then a message will be displayed that no flights were found


  Rule: Boarding closes 15 minutes before departure
    Background:
      Given a flight from Paris to Berlin
      And the flight departs at 6:00 am

    Example: Passenger boards on time
      Given the passenger arrives at the gate 5:30 am
      When the passenger attempt to board
      Then boarding should be allowed