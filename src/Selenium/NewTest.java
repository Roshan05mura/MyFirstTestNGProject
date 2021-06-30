package Selenium;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NewTest {
	  public WebDriver driver;
		 
	      @Test(priority=1)
		  public void f() {  
			  driver.get("https://aws.amazon.com/console/");
		  }
		 	 @BeforeTest
	  public void beforeTest() throws IOException {
		  System.setProperty("webdriver.gecko.driver","/usr/bin/geckodriver");
		  driver= new FirefoxDriver();	  
		 	 }

	  @AfterTest
	  public void afterTest() { 
		  driver.close();
	  }

	}