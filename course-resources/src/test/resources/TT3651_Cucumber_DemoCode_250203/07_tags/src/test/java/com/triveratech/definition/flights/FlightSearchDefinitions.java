package com.triveratech.definition.flights;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightSearchDefinitions {
   @Given("that the user is on the flight search page")
   public void that_the_user_is_on_the_flight_search_page() {
      System.out.println("that the user is on the flight search page");
   }
   @When("user enters an unknown destination code")
   public void user_enters_an_unknown_destination_code() {
      System.out.println("user enters an unknown destination code");
   }
   @Then("a message will be displayed that no flights were found")
   public void a_message_will_be_displayed_that_no_flights_were_found() {
      System.out.println("a message will be displayed that no flights were found");
   }

   @Given("system is is authorized to search")
   public void system_is_is_authorized_to_search() {
      System.out.println("system is is authorized to search");
   }
   @When("system searched for an unknown destination code")
   public void system_searched_for_an_unknown_destination_code() {
      System.out.println("system searched for an unknown destination code");
   }
   @Then("a {int} status code is returned")
   public void aStatusCodeIsReturned(Integer int1) {

   }

   @Then("a {int} status code is returned2")
   public void aStatusCodeIsReturned2(Integer int1) {

   }
}
