package com.wd.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.wd.utility.Services;

public class WelcomePage {

	WebDriver driver;
	Services services;

	final static String EXPECTED_TITLE = "The Internet";
	final static String EXPECTED_HEADING = "Welcome to the-internet";
	final String xpathLink = "//ul/li/a";
	String xpathLinkUsingIndex = "//ul/li[**index**]/a"; // ul/li[1]/a
	String xpathLinkUsingText = "//ul/li/a[text()='**lnkTxt**']"; //////// preferred
	String xpathLinkUsingAttribute = "//a[contains(@href,'**lnkTxt**')]";

	public WelcomePage(WebDriver driver) {
		System.out.println("WelcomePage - Constructor: " + driver);
		this.driver = driver;
		this.services = new Services(driver);
	}

	public void verifyWelcomePageTitle() {
		System.out.println("WelcomePage - Driver: " + driver);
		String actualTitle = driver.getTitle();
		System.out.println("Title: " + actualTitle);
		Assert.assertEquals(actualTitle, EXPECTED_TITLE,
				"Title should be '" + EXPECTED_TITLE + "', instead of '" + actualTitle + "'.");

	}

	public void verifyWelcomePageHeading() {

		WebElement headingEle = driver.findElement(By.className("heading")); // Class Name

		String actualHeading = headingEle.getText();
		Assert.assertEquals(actualHeading, EXPECTED_HEADING,
				"Heading should be '" + EXPECTED_HEADING + "', instead of '" + actualHeading + "'.");
	}

	public void clickOnLinkText(String lnkTxt) {
		System.out.println("*** Clicking on link: " + lnkTxt);
		WebElement linkEle = driver.findElement(By.linkText(lnkTxt)); // Link Text
		linkEle.click();
	}

	public void clickOnPartialLinkText(String lnkTxt) {
		System.out.println("*** Clicking on Partial Link: " + lnkTxt);
		WebElement linkEle = driver.findElement(By.partialLinkText(lnkTxt)); // Partial Link Text
		linkEle.click();
	}

	public void clickOnLinkUsingXpath() {
		System.out.println("*** Clicking on Link using XPATH ");
		services.clickOnElement(xpathLink); // Using XPATH
	}

	public void clickOnLinkUsingXpath(int index) {
		System.out.println("*** Clicking on Link using XPATH ");
		
		String xpath = xpathLinkUsingIndex.replace("**index**", index + "");
		System.out.println("Xpath buy Index: " + xpath);
		services.clickOnElement(xpath); // Using XPATH index
	}

	public void clickOnLinkUsingXpath(String lnkTxt) {
		System.out.println("*** Clicking on Link using XPATH ");
		
		String xpath1 = xpathLinkUsingText.replace("**lnkTxt**", lnkTxt);
		System.out.println("Xpath buy Link Text: " + xpath1);
		
		services.clickOnElement(xpath1); // Using XPATH
	}

	public void clickOnLinkUsingXpathAttribute(String lnkTxt) {
		System.out.println("*** Clicking on Link using XPATH & Attribute.");
		
		String xpath2 = xpathLinkUsingAttribute.replace("**lnkTxt**", lnkTxt);
		System.out.println("Xpath by Link Text: " + xpath2);
		
		services.clickOnElement(xpath2); // Using XPATH
	}

}

//h1[@class='heading']
// h1[text()='Welcome to the-internet']
// h1[contains(text(),'Welcome')]
// a[@href='/checkboxes']
// a[contains(@href,'checkboxes')]
