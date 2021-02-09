package com.jenkins.test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RestaurantSearch {

	WebDriver driver;

	public RestaurantSearch(WebDriver driver) {
		this.driver=driver;

	}

	public void FindRestaurant() throws InterruptedException {
		System.out.println("Restaurant Search Begin");
		
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='Search for restaurants or dishes']")).sendKeys("Royal Pune"+ "\n");
		Thread.sleep(5000);
		WebElement spotitem = driver.findElement(By.partialLinkText("Royal Pune"));
		spotitem.click();
		Thread.sleep(5000);
		WebElement restaurant= driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[1]/div[3]/div[1]/div/div[2]/div/div[1]/div/h1"));
		
		
		String spotresult=restaurant.getText();
		Assert.assertEquals("Royal Pune", spotresult);
		System.out.println("In Search Result- It should be displaying: " + restaurant.getText());
		
		System.out.println("Restaurant Search Complete");
	}
}
