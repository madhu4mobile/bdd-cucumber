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

public class RoomServiceStepDefinitions {

   private HotelServiceFacade serviceFacade = new HotelServiceFacade();

   private int roomNumber;
   @Given("the guest has checked in")
   public void the_guest_has_checked_in() {
      roomNumber = serviceFacade.checkIn("Diego");
   }


   @When("guest orders {int} steak(s) from roomservice")
   public void guest_orders_steak_from_roomservice(Integer numberOfItems) {
      for(int i = 0; i< numberOfItems; i++) {
         serviceFacade.addItemToOrder(roomNumber, "M1");
      }
   }

   @Then("a {double} dollar delivery fee is added to the bill")
   public void a_dollar_delivery_fee_is_added_to_the_bill(Double deliveryCharge) {
      RoomServiceOrder order = serviceFacade.placeOrder(roomNumber);
      double totalDeliveryCharges = order.getDeliveryFee();
      assertEquals(deliveryCharge,totalDeliveryCharges);
   }

   @When("guest orders multiple items from room service")
   public void guest_orders_multiple_items_from_room_service(List<String> items) {
      for(String itemID:items) {
         serviceFacade.addItemToOrder(roomNumber, itemID);
      }
   }
   @Then("a {int}% service charge will be added to the bill")
   public void a_service_charge_will_be_added_to_the_bill_at_checkout(Integer percentage) {
      RoomServiceOrder roomServiceOrder = serviceFacade.placeOrder(roomNumber);
      double subTotal = roomServiceOrder.getSubTotal();
      double serviceCharge = roomServiceOrder.getServiceCharge();
      assertEquals((subTotal/100*percentage),serviceCharge);
   }

   @When("Guest orders item {word}")
   public void guest_orders_item(String item) {
      serviceFacade.addItemToOrder(roomNumber, item);
   }

   @Then("{double} will be added to the bill")
   public void will_be_added_to_the_bill(Double amount) {
      RoomServiceOrder order = serviceFacade.placeOrder(roomNumber);
      double total = order.getTotal();
      assertEquals(amount,total);
   }


}
