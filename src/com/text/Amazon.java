package com.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\babin\\eclipse\\Selenium.Java\\driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement txtamz = driver.findElement(By.xpath("//a[contains(text(),'Conditions')]"));
		String text = txtamz.getText();
		System.out.println(text);
	}

}
