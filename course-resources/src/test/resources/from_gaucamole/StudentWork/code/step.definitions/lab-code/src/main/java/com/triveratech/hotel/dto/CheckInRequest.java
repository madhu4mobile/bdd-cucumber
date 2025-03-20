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
import java.time.LocalDate;

public class CheckInRequest {
   private String name;
   private LocalDate checkInDate;

   public CheckInRequest(String name, LocalDate checkInDate) {
      this.name = name;
      this.checkInDate = checkInDate;
   }

   public String getName() {
      return name;
   }

   public LocalDate getCheckInDate() {
      return checkInDate;
   }
}
