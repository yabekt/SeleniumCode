package com.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccessDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		Select dpCountry=new Select(driver.findElement(By.name("country")));
		dpCountry.selectByVisibleText("ANGOLA");
		
		//Selecting items in a multiple select items
		driver.get("http://jsbin.com/osebed/2");
		Select fruits=new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);

	}

}
