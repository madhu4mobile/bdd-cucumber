package com.triveratech.selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import io.github.bonigarcia.wdm.WebDriverManager;
public abstract class AirportPage implements AutoCloseable{
   protected WebDriver driver;


   @FindBy(id = "link_home")
   @CacheLookup
   private WebElement linkHome;

   @FindBy(id = "link_search")
   @CacheLookup
   private WebElement linkSearch;

   @FindBy(id = "link_departures")
   @CacheLookup
   private WebElement linkDepartures;

   @FindBy(id = "link_by_terminal")
   @CacheLookup
   private WebElement linkByTerminal;

   public AirportPage(WebDriver driver) {
      this.driver = driver;
      PageFactory.initElements(driver, this);
   }

   public String getPageTitle() {
      return driver.getTitle();
   }

   public int getNumberOfMenuItems(){
      List<WebElement> elements = driver.findElements(By.xpath("//nav/ul/li"));
      return elements.size();
   }

   public AirportLandingPage clickHomeLink(){
      linkHome.click();
      return new AirportLandingPage(driver);
   }

   public SearchPage clickSearchLink(){
      linkSearch.click();
      return new SearchPage(driver);
   }

   public DeparturesPage clickDeparturesLink(){
      linkDepartures.click();
      return new DeparturesPage(driver);
   }

   public DeparturesByTerminalPage clickLinkByTerminal(char terminal){
      linkByTerminal.click();
      String linkText = "Terminal " + terminal;
      driver.findElement(By.linkText(linkText)).click();
      return new DeparturesByTerminalPage(driver);
   }

   public void close(){
      if(this.driver != null){
         this.driver.close();
      }
   }
}
