package com.signinpage.using_listener_demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.fileutility.property.PropertiesFile;
import com.goibibo.keywords.Keywords;
import com.keywordframework.goibibo.Constants;
import com.utilities.Log;

//@Listeners(listener_demo.ListenerTest.class)
@Listeners(com.signinpage.using_listener_demo.ListenerTest.class)

public class SignIn_testCases {
	@Test
	public void Login() throws IOException {
		Log.info("**************Test case Start******************************");
		Keywords.openBrowser("Chrome");
		Keywords.openUrl("https://www.goibibo.com/");
		Keywords.maximizeWindow();
		Log.info("****************Maximise window*******************************");
		Keywords.clickOnElement(PropertiesFile.getLocator("signin")[0] ,PropertiesFile.getLocator("signin")[1]);
		Log.info("****************Click On sigin link****************************");
		Keywords.takeScreenshotOfHalfPage();
		Log.info("*****************Take half page screen shot********************");
	}

	@Test
	public void TestToFail() throws IOException {
		System.out.println("This method to test fail");
		Assert.assertTrue(false);
		Log.error("****************give false msg. if test case failed**************");
	}
	
}
