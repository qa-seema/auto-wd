package com.wd.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Services {
	
	WebDriver driver;

	public Services(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnElement(String xpath) {

		WebElement linkEle = driver.findElement(By.xpath(xpath)); // Using XPATH
		linkEle.click();

	}

	public boolean isElementPresent(String xpath) {

		driver.findElement(By.xpath(xpath));
		return true;

	}

}
