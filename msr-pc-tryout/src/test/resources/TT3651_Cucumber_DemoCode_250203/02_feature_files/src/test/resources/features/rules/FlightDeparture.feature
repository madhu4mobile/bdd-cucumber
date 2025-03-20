Feature: FLight Departure Management
  It is all about being on time

  Rule: Passengers must check in before the check-in deadline
    Background:
      Given a flight from "New York" to London
      And the flight departs at 10:00 am

    Example: Passenger checks in on time
      Given the passenger arrives at 7:00 am
      When the passenger attempts to check-in
      Then The check-in should be successful

    Example: Passenger checks in late
      Given the passenger arrives at 9:55 am
      When the passenger attempts to check-in
      Then The check-in should be denied

    Rule: Boarding closes 15 minutes before departure
       Background:
         Given a flight from Paris to Berlin
         And the flight departs at 6:00 am

       Example: Passenger boards on time
         Given the passenger arrives at the gate 5:30 am
         When the passenger attempt to board
         Then boarding should be allowed