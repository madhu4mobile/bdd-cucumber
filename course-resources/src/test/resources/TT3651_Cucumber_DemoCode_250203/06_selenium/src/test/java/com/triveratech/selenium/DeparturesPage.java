package com.triveratech.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DeparturesPage extends AirportPage{

   @FindBy(id="flights_table")
   private WebElement tableBody;

   public DeparturesPage(WebDriver driver) {
      super(driver);
   }

   public int countDepartureRows(){
      List<WebElement> rows = tableBody.findElements(By.xpath("tr"));
      return rows.size();
   }

   public boolean containsData(){
      List<WebElement> rows = tableBody.findElements(By.xpath("tr"));
      if(rows.size() == 0) return false;

      if(rows.size() == 1){
         WebElement webElement = rows.get(0);
         String id = webElement.getAttribute("id");
         return !("noFlightsFound".equals(id));
      }
      return true;
   }

   public String getNoDataText(){
      List<WebElement> rows = tableBody.findElements(By.xpath("tr"));
      if(rows.size() == 1){
         WebElement webElement = rows.get(0);
         String id = webElement.getAttribute("id");
         if("noFlightsFound".equals(id)){
            return webElement.getText();
         }
      }
      return null;
   }
}
