package com.signinpage.using_listener_demo;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.fileutility.property.PropertiesFile;
import com.goibibo.keywords.Keywords;
import com.keywordframework.goibibo.Constants;
import com.utilities.Log;

public class SignInwithCredential {
	@Test(priority = 1)
	public void signInwithValid_mobileNumber() throws InterruptedException {

		Keywords.openBrowser("Chrome");
	//	 Keywords.openUrl("https://www.goibibo.com/");
		Constants.driver.get(Constants.baseUrl);
		Log.startLog("*******************signInwithValid_mobileNumber test case start***************** ");
		Keywords.maximizeWindow();
		Log.info("***************Maximize Window************************");
		Keywords.clickOnElement(PropertiesFile.getLocator("signin")[0], PropertiesFile.getLocator("signin")[1]);
		Log.info("***********************Click on sign in Link****************************************");
		Constants.driver.switchTo().frame("authiframe");
		Log.info("***********************Swith On child frame*****************************************");
		Keywords.clickOnElement(PropertiesFile.getLocator("mobileTextbox")[0], PropertiesFile.getLocator("mobileTextbox")[1]);
		Log.info("****************************CLick On Mob.no text Field*******************************");
		Keywords.enterText(PropertiesFile.getLocator("entermob_no")[0], PropertiesFile.getLocator("entermob_no")[1], "9890022239");
		Log.info("************************Enter mobile number******************************************");
		Keywords.clickOnElement(PropertiesFile.getLocator("continue")[0], PropertiesFile.getLocator("continue")[1]);
		Log.info("***********************After entering mobile no. click on continue button***************");
		Thread.sleep(4000);
        Log.info("*****************Apply wait**********************************************************");
		Keywords.terminateBrowser();
		Log.info("*****************Terminating browser***********************************");
	}

	@Test(priority = 2)
	public void loginWithfacebook() {
        Log.startLog("***************loginWithfacebook test case statr****************************");
		Keywords.openBrowser("Chrome");
		Keywords.openUrl("https://www.goibibo.com/");
		Log.info("*************Opening specified site***********************************");
		Keywords.maximizeWindow();
		Log.info("***************Maximize Window************************");
		Keywords.clickOnElement(PropertiesFile.getLocator("signin")[0], PropertiesFile.getLocator("signin")[1]);
		Log.info("***********************Click on sign in Link****************************************");
		Constants.driver.switchTo().frame("authiframe");
		Log.info("****************Switch on sign in frame*******************************");
		Constants.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Log.info("******************Apply implicit wait**********************************");
		Keywords.clickOnElement(PropertiesFile.getLocator("signInwithFB")[0], PropertiesFile.getLocator("signInwithFB")[1]);
        Log.info("************************Sign in with facebook link***********************");
		Keywords.terminateBrowser();
		Log.info("*****************Terminating browser***********************************");

	}

}
