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

public class CheckInPage {

   protected WebDriver webDriver;

   public CheckInPage(WebDriver webDriver) {
      this.webDriver = webDriver;
   }

   public WelcomePage checkIn(String name) {
      webDriver.findElement(By.id("name")).sendKeys(name);
      webDriver.findElement(By.xpath("//button")).click();
      return new WelcomePage(webDriver);
   }
}
