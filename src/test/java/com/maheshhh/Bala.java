package com.maheshhh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bala {

		public static void main(String[] args ) {
			
			WebDriverManager.chromedriver().setup();
			WebDriver bala = new ChromeDriver();
			bala.get("https://www.facebook.com/home.php");
			
			
			bala.findEliment(By.id("id=\"email\").sendkeys("lellabalaji@gmail.com");
			
			
		}
}
