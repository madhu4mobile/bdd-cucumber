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
import java.time.LocalDateTime;
import java.util.List;

public class ServiceOrderResponse {
   private Long orderId;
   private int roomNumber;
   private LocalDateTime orderDateTime;
   private List<OrderItemResponse> items;
   private int numberOfItems;
   private double subTotal;
   private double serviceCharge;
   private double deliveryFee;
   private double total;

   public Long getOrderId() {
      return orderId;
   }

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public int getRoomNumber() {
      return roomNumber;
   }

   public void setRoomNumber(int roomNumber) {
      this.roomNumber = roomNumber;
   }

   public LocalDateTime getOrderDateTime() {
      return orderDateTime;
   }

   public void setOrderDateTime(LocalDateTime orderDateTime) {
      this.orderDateTime = orderDateTime;
   }

   public List<OrderItemResponse> getItems() {
      return items;
   }

   public void setItems(List<OrderItemResponse> items) {
      this.items = items;
   }

   public int getNumberOfItems() {
      return numberOfItems;
   }

   public void setNumberOfItems(int numberOfItems) {
      this.numberOfItems = numberOfItems;
   }

   public double getSubTotal() {
      return subTotal;
   }

   public void setSubTotal(double subTotal) {
      this.subTotal = subTotal;
   }

   public double getServiceCharge() {
      return serviceCharge;
   }

   public void setServiceCharge(double serviceCharge) {
      this.serviceCharge = serviceCharge;
   }

   public double getDeliveryFee() {
      return deliveryFee;
   }

   public void setDeliveryFee(double deliveryFee) {
      this.deliveryFee = deliveryFee;
   }

   public double getTotal() {
      return total;
   }

   public void setTotal(double total) {
      this.total = total;
   }
}
