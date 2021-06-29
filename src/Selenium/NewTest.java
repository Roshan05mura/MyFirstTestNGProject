package Selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class NewTest {
	  public WebDriver driver;
		 
	      @Test(priority=1)
		  public void f() {  
			  driver.get("http://localhost:8081/login.html");
		  }
		  
		  @Test(priority=2)
		  public void login() throws InterruptedException {	
			  driver.findElement(By.cssSelector("#usernameInput")).sendKeys("MxAdmin");
			    driver.findElement(By.cssSelector("#passwordInput")).sendKeys("RMmendix@123");
			    driver.findElement(By.cssSelector("#loginButton")).click();	     
		      Thread.sleep(100);
		  } 
		  
		  @Test(priority=3)
		 	  public void openExpensesTab() {
		 	      WebDriverWait wait = new WebDriverWait(driver,10);
		 	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mx-name-tabPage1"))).click();
		 	  }
		 	  
		 	  
		 	  @Test(priority=4)
		 	  public void NewButton() {
		 		  driver.findElement(By.cssSelector(".mx-name-newButton1")).click();	      
		 	      driver.findElement(By.cssSelector(".mx-window-active .mx-name-textBox1 input")).clear();
		 	      driver.findElement(By.cssSelector(".mx-window-active .mx-name-textBox1 input")).sendKeys("Roshan");
		 	      driver.findElement(By.cssSelector(".mx-window-active .mx-name-textBox2 input")).clear();
		 	      driver.findElement(By.cssSelector(".mx-window-active .mx-name-textBox2 input")).sendKeys("22");
		 	      driver.findElement(By.cssSelector(".mx-window-active .mx-name-textBox3 input")).clear();
		 	      driver.findElement(By.cssSelector(".mx-window-active .mx-name-textBox3 input")).sendKeys("1999");
		 	      driver.findElement(By.cssSelector(".mx-window-active .mx-name-actionButton1")).click();	
		 	  }  
		  
		 	 @Test(priority=5)
		 	  public void SearchButton() {
		 		driver.findElement(By.cssSelector(".mx-name-searchButton1")).click();
		 		driver.findElement(By.cssSelector(".mx-name-searchField1 input")).clear();	 			 		 
		 		driver.findElement(By.cssSelector(".mx-name-searchField1 input")).sendKeys("Roshan");
		 		driver.findElement(By.cssSelector(".mx-name-searchField2 input")).clear();	 			 		 
		 		driver.findElement(By.cssSelector(".mx-name-searchField2 input")).sendKeys("22");
		 		driver.findElement(By.cssSelector(".mx-name-searchField3 input")).clear();	 			 		 
		 		driver.findElement(By.cssSelector(".mx-name-searchField3 input")).sendKeys("1999");
		 		driver.findElement(By.cssSelector(".mx-name-search")).click();
		 		driver.findElement(By.cssSelector(".mx-name-reset")).click();	
		 	
		 	 }
		 	  
		 	@Test(priority=6)
		 	public void DeleteButton() { 			 			 		    	 	    
		 		driver.findElement(By.cssSelector(".mx-name-actionButton2")).click();
		 	    
		 	}
		 	
		 	
		 	@Test(priority=7)
		 	public void signOut() {
		 		driver.findElement(By.cssSelector(".mx-name-sidebarToggle1")).click();
		 		driver.findElement(By.cssSelector("a[title='Sign Out']")).click();
		 	}
	  
		 	 @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		  driver= new FirefoxDriver();	  
	  }
	  
	  @AfterTest
	  public void afterTest() { 
		  driver.close();
	  }

	}