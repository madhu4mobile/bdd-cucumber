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
public class Item {
   private String reference;
   private String description;
   private double price;

   public Item(String reference, String description, double price) {
      this.reference = reference;
      this.description = description;
      this.price = price;
   }

   public String getReference() {
      return reference;
   }

   public String getDescription() {
      return description;
   }

   public double getPrice() {
      return price;
   }
}
