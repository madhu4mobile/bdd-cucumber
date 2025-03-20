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

import com.triveratech.hotel.HotelServiceFacade;
import com.triveratech.hotel.model.RoomServiceOrder;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoomServiceStepRESTDefinitions {

   private HotelServiceFacade serviceFacade = new HotelServiceFacade();

   private int roomNumber;
   @Given("the guest has checked in")
   public void the_guest_has_checked_in() {
      roomNumber = serviceFacade.checkIn("Diego");
   }

   @When("guest orders multiple items from room service")
   public void guest_orders_item(List<String> itemIDs) {
      for(String itemID : itemIDs) {
         serviceFacade.addItemToOrder(roomNumber, itemID);
      }
   }

   @Then("a total of {double} will be charged")
   public void will_be_added_to_the_bill(Double amount) {
      RoomServiceOrder order = serviceFacade.placeOrder(roomNumber);
      double total = order.getTotal();
      assertEquals(amount,total);
   }


}
