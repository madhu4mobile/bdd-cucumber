package com.triveratech.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.LocalTime;

public class SearchPage extends AirportPage{

   @FindBy(id = "destinationCode")
   private WebElement destinationCodeInput;
   @FindBy(id = "limit")
   private WebElement flightsPerPageInput;
   @FindBy(id = "time")
   private WebElement departingAfter;
   @FindBy(id = "searchBtn")
   private WebElement searchButton;

   public SearchPage(WebDriver driver) {
      super(driver);
   }

   public void setDestinationCode(String destinationCode){
      destinationCodeInput.clear();
      destinationCodeInput.sendKeys(destinationCode);
   }
   public void setLimit(int limit){
      flightsPerPageInput.clear();
      flightsPerPageInput.sendKeys(Integer.toString(limit));
   }
   public void setDepartingAfter(LocalTime time){
      String timeString = time.toString();
      departingAfter.clear();
      departingAfter.sendKeys(timeString);
   }
   public SearchResultsPage search(){
      searchButton.click();
      return new SearchResultsPage(driver);
   }

}
