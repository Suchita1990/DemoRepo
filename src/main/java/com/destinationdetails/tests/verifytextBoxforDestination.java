package com.destinationdetails.tests;

import java.awt.RenderingHints.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.fileutility.property.PropertiesFile;
import com.goibibo.keywords.Keywords;
import com.keywordframework.goibibo.Constants;
import com.utilities.Log;

public class verifytextBoxforDestination {
	@Test
	public void searchDestination() {
		Log.info("************************* searchDestination test case start*********************");
		Keywords.openBrowser("Chrome");
		Constants.driver.get(Constants.baseUrl);
		Log.info("***************given URL Opening***************************");
		Keywords.maximizeWindow();
		
		Log.info("******************* VerifyTextBoxLabel : for dest textbox **********************");

		Keywords.moveToElement(PropertiesFile.getLocator("destination")[0] ,PropertiesFile.getLocator("destination")[1]);
		Log.info("***************move cursor on destination text box*******************************");
        Keywords.clickOnAutopopulatetextbox(PropertiesFile.getLocator("destination")[0],PropertiesFile.getLocator("destination")[1] ,"P");
        Log.info("*****************************************Click on text box******************************");
        Keywords.clickOnVisibleElement(PropertiesFile.getLocator("visibleElement")[0], PropertiesFile.getLocator("visibleElement")[1],  "Pune");
        Log.info("****************************Click on visible element*************************************");
        Keywords.terminateBrowser();
	}
}

/*	new WebDriverWait(Constants.driver,20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#gosuggest_inputDest"))).sendKeys("Mum");

	List<WebElement> myList = new WebDriverWait(Constants.driver, 20).until(
			ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"react-autosuggest-1\"]")));
			for(WebElement element:myList)
	{
    if (element.getText().contains("Mumbai"))
     ;
     element.click();
}*/