package com.goibibo.tests;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.jsoup.Connection.Method;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.goibibo.keywords.Keywords;
import com.keywordframework.goibibo.Constants;
import com.utilities.Log;

import junit.framework.Assert;

public class OpenHomepage_Testscript {
	
	@Test(description = "VerifyBrowser : Chrome")
	public void openhomepage() {
		Log.info("******************* Starting test cases execution **********************");
		Keywords.openBrowser("Chrome");
		Log.info("Browser Open");
		// Keywords.openUrl("https://www.goibibo.com/");
		Constants.driver.get(Constants.baseUrl);
		Log.info("Opening required url");
		Keywords.maximizeWindow();
        Log.info("Maiximize Window");
        Keywords.fullpagescreenshot("openhomepage");
	}

	@Test
	public void verifyLogo() throws IOException {
		
		Log.info("******************* Verify Logo **********************");
		Log.startLog("Test case start for logo");
		String expectedTitle = "goibibo.com";
    	String actualTitle=Keywords.getWebelement("CSS", "a.hdrLogo>img").getText();
		Assert.assertEquals(expectedTitle, actualTitle);
		Log.info("Comparing two strings");
		Keywords.terminateBrowser();
		Log.info("Terminating Browser");
	}
}
