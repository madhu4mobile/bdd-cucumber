package com.triveratech.selenium;
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

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OrderRoomServicePage {
   protected WebDriver webDriver;

   public OrderRoomServicePage(WebDriver webDriver) {
      this.webDriver = webDriver;
   }

   public void addItem(String itemID) {
      String template = "#item_%s img";

      String cssSelector = String.format(template, itemID);
      List<WebElement> elements = webDriver.findElements(By.cssSelector(cssSelector));
      if (elements.size() > 0) {
         elements.get(0).click();
      }
   }

   public String getTotal() {
      WebElement total = webDriver.findElement(By.id("total"));
      return total.getText();
   }
}
