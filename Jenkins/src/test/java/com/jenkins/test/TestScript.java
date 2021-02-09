package com.jenkins.test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {
	
	static WebDriver driver;
	
	
	public static void main (String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dibyaswari Khadka\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
			
	   FoodSearch Food = new FoodSearch(driver);
	   RestaurantSearch restaurant = new  RestaurantSearch(driver);
	   Food.FindFood();
	   restaurant.FindRestaurant();
		
}
}
