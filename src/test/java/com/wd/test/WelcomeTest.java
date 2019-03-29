package com.wd.test;

import org.testng.annotations.Test;

import com.wd.page.WelcomePage;
import com.wd.utility.Init;

public class WelcomeTest extends Init { // We have inherited the Init class
// as soon as we have inherited then Init class, 
//all data members & method get inherited.

	@Test
	public void testWelcome() {

		WelcomePage welcomePage = new WelcomePage(driver);

		welcomePage.verifyWelcomePageTitle();
		welcomePage.verifyWelcomePageHeading();

	}

	@Test
	public void testClickOnLink() throws InterruptedException {

		WelcomePage welcomePage = new WelcomePage(driver);

		welcomePage.verifyWelcomePageTitle();
		welcomePage.verifyWelcomePageHeading();
		welcomePage.clickOnLinkText("Checkboxes");

		// Thread.sleep(9000);

	}

	@Test
	public void testClickOnLinkViaPartialLinkText() throws InterruptedException {

		WelcomePage welcomePage = new WelcomePage(driver);

		welcomePage.verifyWelcomePageTitle();
		welcomePage.verifyWelcomePageHeading();
		welcomePage.clickOnPartialLinkText("Dynamic");

		// Thread.sleep(9000);

	}

	@Test
	public void testClickOnLinkViaXpath() throws InterruptedException {

		WelcomePage welcomePage = new WelcomePage(driver);

		welcomePage.verifyWelcomePageTitle();
		welcomePage.verifyWelcomePageHeading();
		welcomePage.clickOnLinkUsingXpath();

		// Thread.sleep(9000);

	}

	@Test
	public void testClickOnLinkViaXpathUsingIndex() throws InterruptedException {

		WelcomePage welcomePage = new WelcomePage(driver);

		welcomePage.verifyWelcomePageTitle();
		welcomePage.verifyWelcomePageHeading();
		welcomePage.clickOnLinkUsingXpath(3);

		// Thread.sleep(9000);

	}

	@Test
	public void testClickOnLinkViaXpathUsingText() throws InterruptedException {

		WelcomePage welcomePage = new WelcomePage(driver);

		welcomePage.verifyWelcomePageTitle();
		welcomePage.verifyWelcomePageHeading();
		welcomePage.clickOnLinkUsingXpath("Dynamic Controls");

		// Thread.sleep(9000);

	}

	@Test
	public void testClickOnLinkViaXpathUsingAttribute() throws InterruptedException {

		WelcomePage welcomePage = new WelcomePage(driver);

		welcomePage.verifyWelcomePageTitle();
		welcomePage.verifyWelcomePageHeading();
		welcomePage.clickOnLinkUsingXpathAttribute("/checkboxes");

		// Thread.sleep(9000);

	}

}
