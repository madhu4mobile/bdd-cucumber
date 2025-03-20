package com.triveratech.stepdefinitions;
/**
 * <p>
 * This component and source code may be used for instructional and evaluation
 * purposes only. No part of this component or its source code may be sold,
 * transferred, or publicly posted, nor may it be used in a commercial or
 * production environment, without the express written consent of the Trivera
 * Technologies, LLC.
 * <p>
 * Copyright (c) 2025 Trivera Technologies, LLC. http://www.triveratech.com
 *
 * 
 * </p>
 */

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleHomepage {
   @Given("a browser has been launched")
   public void a_browser_has_been_launched() {
      System.out.println("A browser has been launched");
   }

   @When("Google Homepage is opened")
   public void google_homepage_is_opened() {
      System.out.println("Google Homepage is opened");
   }

   @Then("verify that the page displays a search text box")
   public void verify_that_the_page_displays_a_search_text_box() {
      System.out.println("Verify that the page displays a search text box");
   }

   @Then("the page displays the Google Search button")
   public void the_page_displays_the_google_search_button() {
      System.out.println("The page displays the Google Search button");
   }
}
