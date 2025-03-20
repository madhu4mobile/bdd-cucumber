package com.triveratech.definitions;

import com.triveratech.selenium.AirportLandingPage;
import com.triveratech.selenium.SearchPage;
import com.triveratech.selenium.SearchResultsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class StepDefinitions {

   WebDriver webDriver;

   @Given("the user has navigated to the search page")
   public void the_user_has_navigated_to_the_search_page() {
      webDriver = WebDriverManager.chromedriver().create();
      webDriver.navigate().to("http://localhost:8080/airport");
      AirportLandingPage landingPage = new AirportLandingPage(webDriver);
      landingPage.clickSearchLink();
   }
   @When("the user searches for destination code LAX")
   public void the_user_searches_for_destination_code_lax() {
      SearchPage searchPage = new SearchPage(webDriver);
      searchPage.setDestinationCode("LAX");
      searchPage.search();
   }
   @Then("the page should show flights to Los Angeles")
   public void the_page_should_show_flights_to_los_angeles() {
      SearchResultsPage resultsPage = new SearchResultsPage(webDriver);
      int i = resultsPage.numberOfFlights();
      if(i > 0){
         String destination = resultsPage.destination(0);
         Assertions.assertEquals("Los Angeles (LAX)",destination);
      }else{
         Assertions.fail("No flights were found");
      }

   }



}
