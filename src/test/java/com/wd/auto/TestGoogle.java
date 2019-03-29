package com.wd.auto;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wd.utility.Init;

public class TestGoogle extends Init {

	String expectedTitle = "Google";

	@Test
	public void testGoogle() {
		System.out.println("*** TEST GOOGLE 1 ***");

		String actualTitle = driver.getTitle();
		System.out.println("Title: " + actualTitle);

		Assert.assertEquals(actualTitle, expectedTitle,
				"Title should be '" + expectedTitle + "', instead of '" + actualTitle + "'.");

	}

}
