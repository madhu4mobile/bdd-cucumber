package com.triveratech.selenium;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeparturesByTerminalPage extends DeparturesPage {

   @FindBy(id = "terminalInfo")
   private WebElement terminalInfo;
   @FindBy(id = "searchInfo")
   private WebElement searchInfo;
   @FindBy(id = "pageInfo")
   private WebElement pageInfo;

   public DeparturesByTerminalPage(WebDriver driver) {
      super(driver);
   }

   public boolean isTerminalInfoVisible(){
      return terminalInfo.isDisplayed();
   }
   public boolean isSearchInfoVisible(){
      try {
         return searchInfo.isDisplayed();
      } catch (NoSuchElementException e) {
         return false;
      }
   }
   public String getTerminalInfo(){
      return terminalInfo.getText();
   }
   public String getSearchInfo(){
      return searchInfo.getText();
   }
   public String getPageInfo(){
      return pageInfo.getText();
   }
}
