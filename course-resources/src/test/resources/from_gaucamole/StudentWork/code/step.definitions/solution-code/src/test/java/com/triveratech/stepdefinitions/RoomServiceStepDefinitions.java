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
import org.junit.jupiter.api.Assertions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoomServiceStepDefinitions {

   private HotelServiceFacade serviceFacade = new HotelServiceFacade();
   private int roomNumber;

   @Given("the guest has checked in")
   public void the_guest_has_checked_in() {
      roomNumber = serviceFacade.checkIn("Diego");
   }
   @When("guest orders {int} steak(s) from room service")
   public void guest_orders_steak_from_room_service(Integer int1) {
      for(int i = 0; i< int1; i++) {
         serviceFacade.addItemToOrder(roomNumber, "M1");
      }

   }
   @Then("a {double} dollar delivery fee is added to the bill")
   public void a_dollar_delivery_fee_is_added_to_the_bill(Double int1) {
      RoomServiceOrder order = serviceFacade.placeOrder(roomNumber);
      double totalDeliveryCharges = order.getDeliveryFee();
      Assertions.assertEquals(int1,totalDeliveryCharges);
   }

   @When("guest orders multiple items from room service")
   public void guest_orders_multiple_items_from_room_service(List<String> dataTable) {
      for(String itemID : dataTable) {
         serviceFacade.addItemToOrder(roomNumber, itemID);
      }

   }
   @Then("a {int}% service charge will be added to the bill")
   public void a_service_charge_will_be_added_to_the_bill(Integer int1) {
      RoomServiceOrder roomServiceOrder = serviceFacade.placeOrder(roomNumber);
      double subTotal = roomServiceOrder.getSubTotal();
      double serviceCharge = roomServiceOrder.getServiceCharge();
      Assertions.assertEquals((subTotal/100*int1),serviceCharge);
   }

   @When("Guest orders item {string}")
   public void guest_orders_item(String string) {
      serviceFacade.addItemToOrder(roomNumber, string);
   }
   @Then("{double} will be added to the bill")
   public void will_be_added_to_the_bill(Double double1) {
      RoomServiceOrder order = serviceFacade.placeOrder(roomNumber);
      double total = order.getTotal();
      Assertions.assertEquals(double1,total);
   }

}
