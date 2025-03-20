package com.triveratech.hotel.dto;
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
public class OrderItemResponse{
   private String reference;
   private String description;
   private double price;

   public String getReference() {
      return reference;
   }

   public void setReference(String reference) {
      this.reference = reference;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }
}
