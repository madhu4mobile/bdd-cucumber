package com.triveratech.destination.flights;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class FlightSearchDefinitions {

   @Given("that the user is on the flight search page")
   public void that_the_user_is_on_the_flight_search_page() {
      System.out.println("the user is on the flight search page");
   }

   @When("^the user want to see (\\d{1,2}) flights per page$")
   public void the_user_want_to_see_flights_per_page(Integer numberOfFlights) {
      System.out.printf("the user want to see %d flights per page%n",numberOfFlights);
   }


   @When("^the user searched for the destination code ([A-Z]{3})$")
   public void the_user_searched_for_the_destination_code(String destinationCode) {
      System.out.printf("the user searched for the destination code %s%n",destinationCode);
   }
   @Then("^at most (\\d+) flights to ([A-Z]{3}) should be shown$")
   public void at_most_flights_to_should_be_shown(Integer int1, String string) {
      System.out.printf("at most %d flights to %s should be shown%n",int1,string);
   }

   @When("user searches for a destination(s)/location(s)")
   public void user_searches_for_a_destination() {

   }

   @When("the user performs searches on multiple tables for destination codes")
   public void the_user_performs_searches_on_multiple_tables_for_destination_codes(List<String> dataTable) {

      dataTable.forEach(System.out::println);
   }
   @Then("{int} different pages will be show")
   public void different_pages_will_be_show(Integer int1) {

   }

   @When("the user enter destination code {word}")
   public void the_user_enter_destination_code_ams(String destinationCode) {
      System.out.printf("the user enter destination code %s%n",destinationCode);
   }
   @When("the user changes the number of flights to {int}")
   public void the_user_changes_the_number_of_flights_to(Integer int1) {
      System.out.printf("the user changes the number of flights to %d%n",int1);
   }
   @Then("no more than {int} to {word} are shown")
   public void no_more_than_to_ams_are_shown(Integer int1, String destinationCode) {
      System.out.printf("no more than %d to %s are shown%n",int1,destinationCode);
   }

}
