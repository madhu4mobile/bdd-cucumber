Feature: Searching for flights
  Users are capable of searching for departing flights

  Background:
    Given that the user is on the flight search page

  Scenario: Searching for a destination code that does exist
    When the user searched for the destination code AMS
    And the user want to see 61 flights per page
    Then at most 6 flights to AMS should be shown

  Scenario: Searching for location
    When user searches for a location

  Scenario: Searching for locations
    When user searches for a locations

  Scenario: Searching for destination
    When user searches for a destination

  Scenario: Searching for destinations
    When user searches for a destinations

  Scenario: User searches on multiple tabs
    When the user performs searches on multiple tables for destination codes
    |AMS|
    |LAX|
    |LAS|
    Then 3 different pages will be show


  Scenario Outline: Change the number of flights on the search page
    When the user enter destination code <destinationCode>
    And the user changes the number of flights to <amount>
    Then no more than <amount> to <destinationCode> are shown

    Examples:
    |destinationCode|amount|
    |AMS            |2     |
    |LAX            |6     |
    |LAS            |3     |