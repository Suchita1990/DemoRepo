package com.signinpage.using_listener_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.goibibo.keywords.Keywords;
import com.keywordframework.goibibo.Constants;
import com.utilities.Log;

public class UserDetails {
	@Test
	public void informationDetailsOfuser() {
		Log.startLog("*****************Test case starting************************");
		Keywords.openBrowser("Chrome");
		Constants.driver.get(Constants.baseUrl);
		Keywords.maximizeWindow();
		Log.info("***************maximise window***********************************");
		Keywords.mouseHoverOnElement("CSS","#hd_user_widdget");
		Log.info("******************mouse hover on user profile**********************");
		Constants.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Log.info("******************* Close Browser **********************");
		Keywords.terminateBrowser();
	}

	@Test(dependsOnMethods = "informationDetailsOfuser")
	public void VerifyMenuItems() {
		Log.info("*************test case start************************************");
		String[] expectedSubNavItems = { "My Trips", "View Ticket", "Cancel Ticket", "Make Payment",
				"Check Refund Status", "Write to us" };
		Keywords.openBrowser("Chrome");
		Constants.driver.get(Constants.baseUrl);
		Log.startLog("************Start browser opening with specified url*************");
		List<WebElement> subNavItems = Constants.driver.findElements(By.cssSelector("#hd_user_widdget"));
		Log.info("***********List of all the navbar-menu items*************************");
		ArrayList actualsubNavItems = new ArrayList<String>();
		Iterator<WebElement> itr = ((ArrayList) subNavItems).iterator();
		while (itr.hasNext()) {
			actualsubNavItems.add(itr.next().getText());
		}
		for (String item : expectedSubNavItems) {
			Assert.assertTrue(actualsubNavItems.contains(item));
		}
		Log.info("******************* Close Browser **********************");
		Keywords.terminateBrowser();

	}
}
