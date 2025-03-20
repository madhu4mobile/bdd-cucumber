package com.triveratech.destination.rules;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightDefinitions {


   @Given("a flight from {string} to London")
   public void a_flight_from_to_london(String string) {
      System.out.printf("a flight from  %s to London%n",string);
   }

   @Given("a flight from New York to London")
   public void a_flight_from_new_york_to_london() {
      System.out.println("a flight from New York to London");
   }
   @Given("the flight departs at {int}:{int} am")
   public void the_flight_departs_at_am(Integer int1, Integer int2) {
      System.out.printf("the flight departs at %d:%d am%n",int1,int2);
   }
   @Given("the passenger arrives at {int}:{int} am")
   public void the_passenger_arrives_at_am(Integer hours, Integer minutes) {
      System.out.printf("the passenger arrives at %d:%d am%n",hours,minutes);
   }
   @When("the passenger attempts to check-in")
   public void the_passenger_attempts_to_check_in() {
      System.out.println("the passenger attempts to check-in");
   }
   @Then("The check-in should be successful")
   public void the_check_in_should_be_successful() {
      System.out.println("The check-in should be successful");
   }
   @Then("The check-in should be denied")
   public void the_check_in_should_be_denied() {
      System.out.println("The check-in should be denied");
   }

   @Given("a flight from Paris to Berlin")
   public void a_flight_from_paris_to_berlin() {

   }
   @Given("the passenger arrives at the gate {int}:{int} am")
   public void the_passenger_arrives_at_the_gate_am(Integer int1, Integer int2) {

   }
   @When("the passenger attempt to board")
   public void the_passenger_attempt_to_board() {

   }
   @Then("boarding should be allowed")
   public void boarding_should_be_allowed() {

   }

}
