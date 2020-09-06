package com.goibibo.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.fileutility.property.PropertiesFile;
import com.goibibo.keywords.Keywords;
import com.keywordframework.goibibo.Constants;

public class CheckheaderBoxMenu_Conent {

	@Test
	public void openhomepage() {
		Keywords.openBrowser("Chrome");
		Keywords.openUrl("https://www.goibibo.com/");
		Keywords.maximizeWindow();
		Keywords.getWebelement(PropertiesFile.getLocator("main-header")[0],PropertiesFile.getLocator("main-header")[1]).isEnabled();
	}
	
	@Test
    public void verifyHeadersubMenu() {
       Keywords.getWebelement(PropertiesFile.getLocator("fligths")[0],PropertiesFile.getLocator("fligths")[1]).getText();
	   Keywords.getWebelement(PropertiesFile.getLocator("Hotels")[0],PropertiesFile.getLocator("Hotels")[1]).getText();
	   Keywords.getWebelement(PropertiesFile.getLocator("Hotels")[0],PropertiesFile.getLocator("Hotels")[1]).getText();
	   Keywords.getWebelement(PropertiesFile.getLocator("Bus")[0],PropertiesFile.getLocator("Bus")[1]).getText();
	   Keywords.getWebelement(PropertiesFile.getLocator("Train")[0], PropertiesFile.getLocator("Train")[1]).getText();
	   Keywords.getWebelement(PropertiesFile.getLocator("Cabs")[0] ,PropertiesFile.getLocator("Cabs")[1]).getText();
	   Keywords.getWebelement(PropertiesFile.getLocator("Visa")[0] ,PropertiesFile.getLocator("Visa")[1]).getText();
	   
       System.out.println("All Header sub-menu items displayed");

	}
	
	@Test
	public void verifycustomerSupportlink()  {
	//	Keywords.clickOnElement("XPATH", "//span[text()=' 24x7 goCare Support']");
		Keywords.clickOnElement(PropertiesFile.getLocator("Spportlink")[0],PropertiesFile.getLocator("Spportlink")[1]);
		System.out.println("24*7 goCare Support link is Displayed on Header");
		Constants.driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
		Keywords.terminateBrowser();

	}
}
