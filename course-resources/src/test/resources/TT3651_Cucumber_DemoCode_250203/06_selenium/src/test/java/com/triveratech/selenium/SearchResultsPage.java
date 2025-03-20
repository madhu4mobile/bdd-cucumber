package com.triveratech.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends DeparturesPage{
   @FindBy(id = "searchInfo")
   private WebElement searchInfo;
   @FindBy(id = "pageInfo")
   private WebElement pageInfo;

   @FindBy(xpath = "//*[@id='flights_table']/tr")
   private List<WebElement> flightRows;

   public SearchResultsPage(WebDriver driver) {
      super(driver);
   }

   public String getSearchInfo(){
      return searchInfo.getText();
   }
   public String getPageInfo(){
      return pageInfo.getText();
   }
   public int numberOfFlights(){
      return flightRows.size();
   }

   public String destination(int row){
      String destinationID = String.format("flight_%d_destination",row);
      WebElement element = driver.findElement(By.id(destinationID));
      return element.getText();
   }
}
