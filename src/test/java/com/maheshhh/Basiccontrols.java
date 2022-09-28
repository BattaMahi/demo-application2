package com.maheshhh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basiccontrols {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		
		Thread.sleep(2000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(2000);
		WebElement hindicheck = driver.findElement(By.id("hindichbx"));
		hindicheck.click();
		Thread.sleep(2000);
		if(hindicheck.isSelected())
			hindicheck.click();
		Thread.sleep(2000);
		driver.findElement(By.id("registerbtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("msg")).getText());
		Thread.sleep(2000);
		driver.findElement(By.id("navigateHome")).click();
		
	}

}
