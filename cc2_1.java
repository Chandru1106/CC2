package com.seleinum.test.seleinum;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cc2_1 {
  @Test
  public void f() throws InterruptedException {
	  		WebDriverManager.chromedriver().setup();
	  		ChromeOptions co = new ChromeOptions();
	  		co.addArguments("--remote-allow-origins=*");
	  		WebDriver driver = new ChromeDriver(co);
	  		driver.get("https://www.yatra.com/hotels");
	  		driver.manage().window().maximize();
	  		driver.findElement(By.xpath("//*[@id=\"booking_engine_flights\"]/div/span")).click();
	  		driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[1]/div[1]/ul[1]/li[2]/a")).click();
	  		driver.findElement(By.xpath("//*[@id=\"BE_flight_origin_city\"]")).click();
	  		Thread.sleep(3000);
  		

	  		WebElement che=driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[1]/div[2]/ul/li[1]/ul/li[1]/div/div/ul/div/div/div/li[4]"));
			che.click();
			Thread.sleep(2000);
			WebElement going=driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[1]/div[2]/ul/li[1]/ul/li[3]/div/div/ul/div/div/div/li[6]"));
			going.click();
			Thread.sleep(2000);		
			
			driver.findElement(By.xpath("//*[@id=\"BE_flight_origin_date\"]")).click();
			Thread.sleep(2000);
			
			WebElement dt=driver.findElement(By.xpath("//*[@id=\"01/05/2023\"]"));
			dt.click();
			Thread.sleep(2000);
			
			WebElement dt1=driver.findElement(By.xpath("//*[@id=\"10/05/2023\"]"));
			dt1.click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"BE_flight_paxInfoBox\"]/span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"BE_flight_passengerBox\"]/div[1]/div[1]/div/div/span[2]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"BE_flight_passengerBox\"]/div[1]/div[1]/div/div/span[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"BE_flight_passengerBox\"]/div[1]/div[1]/div/div/span[2]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"flight_class_select_child\"]/ul/li[2]/span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[3]/div[1]/div[1]/a")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"BE_flight_flsearch_btn\"]")).click();
			Thread.sleep(2000);
			
			
}
}
