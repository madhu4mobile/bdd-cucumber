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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WelcomePage {
   protected WebDriver webDriver;

   public WelcomePage(WebDriver webDriver) {
      this.webDriver = webDriver;
   }

   public OrderRoomServicePage navigateToOrderRoomService() {
      WebElement guest_services_menu = webDriver.findElement(By.id("menu_guest_services"));
      WebElement order_menu = webDriver.findElement(By.id("menu_order"));
      Actions builder = new Actions(webDriver);
      builder.moveToElement(guest_services_menu).click(order_menu).perform();

      WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(2));
      wait.until(ExpectedConditions.titleIs("Order Room Service"));
      return new OrderRoomServicePage(webDriver);
   }
}
