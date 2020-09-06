package com.homepage.options;

import org.apache.log4j.Priority;
import org.testng.annotations.Test;

import com.fileutility.property.PropertiesFile;
import com.goibibo.keywords.Keywords;
import com.utilities.Log;

public class CheckRegistration_Option {
	@Test(priority=1 ,description="VerifyTextBoxLabel : for src textbox")
	public void tc_01() {
		Log.info("****************test case start for source field ***************");
		Keywords.openBrowser("Chrome");
		Keywords.openUrl("https://www.goibibo.com/");
		Keywords.maximizeWindow();
		Keywords.clickOnElement(PropertiesFile.getLocator("source")[0] ,PropertiesFile.getLocator("source")[1]);
		Keywords.enterText(PropertiesFile.getLocator("source")[0] ,PropertiesFile.getLocator("source")[1], "Pune");
	}
	@Test(priority=2 ,dependsOnMethods= {"tc_01"} ,description="VerifyTextBoxLabel : for dest textbox")
	public void tc_02() {
		Log.info("****************test case start for destination field ***************");
		Keywords.clickOnElement(PropertiesFile.getLocator("destination")[0] ,PropertiesFile.getLocator("destination")[1]);
		Keywords.enterText(PropertiesFile.getLocator("destination")[0] ,PropertiesFile.getLocator("destination")[1], "Mumbai");

	}
	@Test(priority=3 ,dependsOnMethods= {"tc_01" ,"tc_02"},description="VerifyTextBoxLabel : for departure textbox")
	public void tc_03() {
		Log.info("****************test case start for departure field ***************");
        Keywords.clickOnElement(PropertiesFile.getLocator("departuretextbox")[0] ,PropertiesFile.getLocator("departuretextbox")[1]);
	}
	
    @Test(priority=4 ,dependsOnMethods= {"tc_03"} ,description="VerifyTextBoxLabel : for rturn textbox" )
	public void tc_04() {
    	Log.info("****************test case start for return field ***************");
       Keywords.clickOnElement(PropertiesFile.getLocator("returndate")[0] ,PropertiesFile.getLocator("returndate")[1]);
	}   
    
    @Test(priority=5 ,description="VerifyTextBoxLabel : for Traveller,economy textbox")
    public void tc_05() {
      Log.info("****************test case start for Traveller field ***************");
      Keywords.clickOnElement(PropertiesFile.getLocator("travellertextbox")[0],PropertiesFile.getLocator("travellertextbox")[1]);
	}
    
    @Test(description="Click on search button")
    public void tc_06() {
    	Log.info("****************test case start for search field ***************");
      Keywords.clickOnElement(PropertiesFile.getLocator("searchbutton")[0],PropertiesFile.getLocator("searchbutton")[1]);
	}
}
