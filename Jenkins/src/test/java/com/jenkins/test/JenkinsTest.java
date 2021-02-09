package com.jenkins.test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class JenkinsTest {

static WebDriver driver;
 
  @BeforeMethod
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dibyaswari Khadka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		System.out.println("Search Method Start");
		driver.get("https://www.swiggy.com/restaurants");
		driver.manage().window().maximize();
		
		WebElement location=driver.findElement(By.xpath("//input[@type='text'and @id='location']"));
		location.sendKeys("Pune");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[2]/div/div[3]/div[1]/span[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div/div/ul/li[5]/div/a/span[2]")).click();
		Thread.sleep(3000);
				  
  }
  
  @Test
  public void A() throws InterruptedException {
	  FoodSearch Food = new FoodSearch(driver);
	   Food.FindFood();
	   System.out.println("PASS:AS EXPECTED");
  }

  @Test
  public void B() throws InterruptedException {
   RestaurantSearch restaurant = new  RestaurantSearch(driver);
   restaurant.FindRestaurant();
 System.out.println("PASS:AS EXPECTED");
  }
 
 
  @AfterMethod
  public void afterTest() {
	  driver.close();
	  System.out.println("Search Method End");
  }

}
