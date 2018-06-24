package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumDemo {
 public static void main (String[] args) {
	 System.setProperty("webdriver.chrome.driver" ,
	"/Users/nejlagulsaglam/Documents/selenium dependencies/drivers/chromedriver");
	 
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://google.com");
	 
	 WebDriver driver2 = new ChromeDriver();
	 driver2.get("http://cybertekschool.com");
	 
	 WebDriver driver3 = new ChromeDriver();
	 driver3.get("http://ebay.com");
	 
 }
}
