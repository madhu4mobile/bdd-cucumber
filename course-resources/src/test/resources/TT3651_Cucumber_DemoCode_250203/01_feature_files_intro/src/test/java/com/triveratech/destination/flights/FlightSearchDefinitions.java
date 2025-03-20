package com.triveratech.destination.flights;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightSearchDefinitions {

   @Given("that the users is on the flight search page")
   public void that_the_users_is_on_the_flight_search_page() {
      System.out.println("1) that the users is on the flight search page");
   }
   @When("user enters an unknown destination code")
   public void user_enters_an_unknown_destination_code() {
      System.out.println("2) user enters an unknown destination code");
   }
   @Then("a message will be displayed that no flights were found")
   public void a_message_will_be_displayed_that_no_flights_were_found() {
      System.out.println("3) a message will be displayed that no flights were found");
   }

   @When("user enters no destination code")
   public void user_enters_no_destination_code() {
      System.out.println("4) user enters no destination code");
   }
}
