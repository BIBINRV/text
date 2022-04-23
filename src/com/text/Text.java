package com.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\babin\\eclipse\\Selenium.Java\\driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
	driver.get("https://adactinhotelapp.com");
	WebElement texthtl = driver.findElement(By.xpath("//p[contains(text(),'Adactin')]"));
String txt = texthtl.getText();
	System.out.println(txt);
	}

}
