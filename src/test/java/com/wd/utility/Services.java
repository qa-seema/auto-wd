package com.wd.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Services {

	WebDriver driver;

	public Services(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnElement(String xpath) {

		waitForElement(xpath);

		WebElement linkEle = driver.findElement(By.xpath(xpath)); // Using XPATH
		linkEle.click();

	}

	public boolean isElementPresent(String xpath) {
		driver.findElement(By.xpath(xpath));
		return true;
	}

	public void waitForElement(String locator) {

		System.out.println("# Waiting for element by xpath: " + locator);
		WebDriverWait wait = new WebDriverWait(driver, 30, 1);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));	
			
	}

}
