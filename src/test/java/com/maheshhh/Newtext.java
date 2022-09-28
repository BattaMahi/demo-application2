package com.maheshhh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Newtext { 

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://github.com/login");
		
		WebElement Chandu = Driver.findElement(By.id("login_field"));
		if (Chandu.isDisplayed()) {
			if (Chandu.isEnabled()) {
			 Chandu.sendKeys("VK");
			 
			 String CH = Chandu.getAttribute("value");
			 System.out.println(CH);
			 Thread.sleep(4000);
			 Chandu.clear();
			
		}	else {
			System.err.println("Text box is not enabled");
		}
			
		}else {
			System.err.println("Text box is not displayed");
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
