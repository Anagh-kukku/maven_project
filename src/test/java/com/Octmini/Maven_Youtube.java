package com.Octmini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maven_Youtube {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayar\\eclipse-workspace\\Selenium_Sept\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	 driver.findElement(By.name("search_query")).sendKeys("suicide squad trailer");
	 driver.findElement(By.id("search-icon-legacy")).click();
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
	}

}
