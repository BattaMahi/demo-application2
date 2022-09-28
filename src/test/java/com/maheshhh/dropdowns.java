package com.maheshhh;

import java.util.List;

import org.junit.internal.runners.model.EachTestNotifier;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdowns {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
//		WebElement coursename = driver.findElement(By.id("course"));
//		
//		Select coursenamedropdown = new Select(coursename);
//		List<WebElement> courseNameDropdownOptions = coursenamedropdown.getOptions();
//		for(WebElement option : courseNameDropdownOptions) {
//			System.out.println(option.getText());
//		}
//		
//		coursenamedropdown.selectByIndex(1);
//		Thread.sleep(2000);
//		coursenamedropdown.selectByValue("net");
//		Thread.sleep(2000);
//		coursenamedropdown.selectByVisibleText("Python");
		
		
		WebElement ideElement = driver.findElement(By.id("ide"));
		
		Select idedropdown = new Select(ideElement);
		List<WebElement> ideDropdownOptions = idedropdown.getOptions();
		for (WebElement option : ideDropdownOptions) {
			System.out.println(option.getText());
		}
		
		idedropdown.selectByIndex(0);
		Thread.sleep(2000);
		idedropdown.selectByValue("ij");
		Thread.sleep(2000);
		idedropdown.selectByVisibleText("NetBeans");
		Thread.sleep(3000);
		
		idedropdown.deselectByVisibleText("NetBeans");
	}

}
