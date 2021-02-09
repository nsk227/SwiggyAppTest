package com.jenkins.test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FoodSearch {
	
	WebDriver  driver ;
	public FoodSearch(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	public void FindFood() throws InterruptedException {
		System.out.println("Food Search Begins");
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='Search for restaurants or dishes']")).sendKeys("Chicken Momos"+ "\n");
		Thread.sleep(5000);
		WebElement menuitem = driver.findElement(By.partialLinkText("mad momos"));
		menuitem.click();
		Thread.sleep(5000);
		WebElement title=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[1]/div[3]/div[1]/div/div[2]/div/div[1]/div/h1"));
		
		
		String foodresult=title.getText();
		Assert.assertEquals("mad momos", foodresult);
		System.out.println("In Search Result- It should be displaying: " + title.getText());
		
		
		  try { Thread.sleep(5000); } catch (InterruptedException e1) {
		  
		  e1.printStackTrace(); }
		  driver.get("https://www.swiggy.com/restaurants");
		  driver.manage().window().maximize();
		  
		  try { Thread.sleep(3000); } 
		  catch (InterruptedException e) 
		  { // TODO   Auto-generated catch block e.printStackTrace();   }
		  }
		 
		System.out.println("Food Search Complete");
	}
	
}
	
