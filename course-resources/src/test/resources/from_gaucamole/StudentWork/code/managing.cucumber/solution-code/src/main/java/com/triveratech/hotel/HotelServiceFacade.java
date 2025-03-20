package com.triveratech.hotel;
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

import com.triveratech.hotel.dto.CheckInRequest;
import com.triveratech.hotel.dto.CheckInResponse;
import com.triveratech.hotel.dto.ServiceOrderResponse;
import com.triveratech.hotel.model.Item;
import com.triveratech.hotel.model.RoomServiceOrder;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.List;

public class HotelServiceFacade {
   private RestClient restClient;

   public HotelServiceFacade() {
      restClient = RestClient.builder().baseUrl("http://localhost:8080").defaultHeader("Accept", MediaType.APPLICATION_JSON_VALUE).build();
   }

   public HotelServiceFacade(String baseURL) {
      restClient = RestClient.builder().baseUrl(baseURL).defaultHeader("Accept", MediaType.APPLICATION_JSON_VALUE).build();

   }

   public int checkIn(String name) {
      CheckInResponse response = restClient.post().uri("/hotel/registration/checkin").body(new CheckInRequest(name, LocalDate.now())).retrieve().body(CheckInResponse.class);
      return response.getRoomNumber();
   }

   public RoomServiceOrder addItemToOrder(int roomNumber, String itemID) {
      ServiceOrderResponse response = restClient.get().uri("/hotel/services/roomServiceOrder/{roomNumber}/add/{itemID}", roomNumber, itemID).retrieve().body(ServiceOrderResponse.class);
      return mapServiceOrder(response);
   }

   public RoomServiceOrder removeItemFromOrder(int roomNumber, String itemID) {
      ServiceOrderResponse response = restClient.get().uri("/hotel/services/roomServiceOrder/{roomNumber}/add/{itemID}", roomNumber, itemID).retrieve().body(ServiceOrderResponse.class);
      return mapServiceOrder(response);
   }

   public RoomServiceOrder placeOrder(int roomNumber) {
      ServiceOrderResponse response = restClient.get().uri("/hotel/services/roomServiceOrder/{roomNumber}", roomNumber).retrieve().body(ServiceOrderResponse.class);
      return mapServiceOrder(response);
   }

   private RoomServiceOrder mapServiceOrder(ServiceOrderResponse so) {
      RoomServiceOrder order = new RoomServiceOrder(so.getOrderId(),so.getSubTotal(), so.getServiceCharge(), so.getDeliveryFee(), so.getTotal());
      List<Item> items = order.getItems();
      so.getItems().stream().map(i -> new Item(i.getReference(), i.getDescription(), i.getPrice())).forEach(items::add);
      return order;
   }
}
