package com.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\babin\\eclipse\\Selenium.Java\\driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
		driver.get("http://greenstech.in");
		WebElement btncrs = driver.findElement(By.xpath("//a[text()='Careers']"));
		btncrs.click();
		WebElement btnCrs = driver.findElement(By.xpath("//a[text()='CAREERS']"));
		btnCrs.click();
		WebElement btnovw = driver.findElement(By.id("overview-tab"));
		btnovw.click();
        WebElement btnhd = driver.findElement(By.xpath("//a[@id='overview-tab']"));
		btnhd.click();
		
		WebElement txtcrs = driver.findElement(By.xpath("//p[contains(text(),'an expert in Selenium')]"));
		Thread.sleep(3000);

String text = txtcrs.getText();
Thread.sleep(3000);
				System.out.println(text);
				driver.quit();
		
}
} 