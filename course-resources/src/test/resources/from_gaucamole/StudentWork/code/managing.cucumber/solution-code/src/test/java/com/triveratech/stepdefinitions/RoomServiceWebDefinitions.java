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

import com.triveratech.selenium.CheckInPage;
import com.triveratech.selenium.OrderRoomServicePage;
import com.triveratech.selenium.WelcomePage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RoomServiceWebDefinitions {
   private WebDriver driver;

   @After
   public void closeBrowser() {
      if (driver != null) driver.quit();
   }

   @Given("the guest has checked in using the website")
   public void the_guest_has_checked_in_using_the_website() {
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      driver.navigate().to("http://localhost:8080/hotel/checkin");
      CheckInPage checkInPage = new CheckInPage(driver);
      checkInPage.checkIn("Diego");

   }

   @Given("navigates to Order Room Service Webpage")
   public void navigates_to_order_room_service_webpage() {
      WelcomePage welcomePage = new WelcomePage(driver);
      welcomePage.navigateToOrderRoomService();
   }

   @When("guest selects multiple items")
   public void guest_selects_multiple_items(List<String> itemIDs) {
      OrderRoomServicePage orderPage = new OrderRoomServicePage(driver);
      for (String itemID : itemIDs) {
         orderPage.addItem(itemID);
         //      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
         //     wait.until(webdriver -> ((JavascriptExecutor)webdriver).executeScript("return jQuery.active == 0"));
      }
   }

   @Then("the page shows a total of {string} to be charged")
   public void the_page_shows_a_total_of_to_be_charged(String total) {
      OrderRoomServicePage orderPage = new OrderRoomServicePage(driver);
      String totalOnPage = orderPage.getTotal();
      Assertions.assertEquals(total, totalOnPage);
   }


}
