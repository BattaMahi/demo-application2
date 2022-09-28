package com.maheshhh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdowns1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		
		WebElement coursename = driver.findElement(By.id("course"));
		
		Select coursenamedropdown = new Select(coursename);
		
		List<WebElement> coursedropdownoptions = coursenamedropdown.getOptions();
		for (WebElement option  : coursedropdownoptions) {
			System.out.println(option.getText());
		}
		
		coursenamedropdown.selectByIndex(1);
		Thread.sleep(5000);
		coursenamedropdown.selectByValue("net");
		Thread.sleep(5000);
		coursenamedropdown.selectByVisibleText("Javascript");
		
		
		String selectedtext = coursenamedropdown.getFirstSelectedOption().getText();
		
		System.out.println("selected cisibletext . "+ selectedtext );
//		WebElement idename = driver.findElement(By.id("ide"));
//		
//		Select idedropdown = new Select(idename);
//		
//		List<WebElement> idenamedropdownoptions = idedropdown.getOptions();
//		for (WebElement option : idenamedropdownoptions) {
//			System.out.println(option.getText());
//			
//		}
//		
//		idedropdown.selectByIndex(0);
//		Thread.sleep(5000);
//		idedropdown.selectByValue("ij");
//		Thread.sleep(5000);
//		idedropdown.selectByVisibleText("NetBeans");
		
		
		
		
		
		
	}

}
