package com.triveratech.hotel.dto;

import java.time.LocalDate;

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
public class CheckInResponse {

   private String name;
   private LocalDate checkInDate;
   private int roomNumber;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public LocalDate getCheckInDate() {
      return checkInDate;
   }

   public void setCheckInDate(LocalDate checkInDate) {
      this.checkInDate = checkInDate;
   }

   public int getRoomNumber() {
      return roomNumber;
   }

   public void setRoomNumber(int roomNumber) {
      this.roomNumber = roomNumber;
   }
}
