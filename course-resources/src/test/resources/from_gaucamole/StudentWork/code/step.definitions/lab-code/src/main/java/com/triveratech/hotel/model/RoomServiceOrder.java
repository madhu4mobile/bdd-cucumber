package com.triveratech.hotel.model;
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

import java.util.ArrayList;
import java.util.List;

public class RoomServiceOrder {
   private Long orderId;
   private List<Item> items = new ArrayList<>();
   private double subTotal;
   private double serviceCharge;
   private double deliveryFee;
   private double total;

   public RoomServiceOrder(Long orderId, double subTotal, double serviceCharge, double deliveryFee, double total) {
      this.orderId = orderId;
      this.subTotal = subTotal;
      this.serviceCharge = serviceCharge;
      this.deliveryFee = deliveryFee;
      this.total = total;
   }

   public Long getOrderId() {
      return orderId;
   }

   public List<Item> getItems() {
      return items;
   }

   public double getSubTotal() {
      return subTotal;
   }

   public double getServiceCharge() {
      return serviceCharge;
   }

   public double getDeliveryFee() {
      return deliveryFee;
   }

   public double getTotal() {
      return total;
   }
}
