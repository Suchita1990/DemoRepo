package com.destinationdetails.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.goibibo.keywords.Keywords;
import com.keywordframework.goibibo.Constants;
import com.utilities.Log;

public class verifytextBoxforSource {

	@Test(description = "VerifyTextBox : for src textbox")
	public void tc_01() throws InterruptedException {
		Log.startLog("**************tc_01 test case start*******************************");
		Keywords.openBrowser("Chrome");
		Constants.driver.get(Constants.baseUrl);
		Log.info("**************goibibo.com open****************************************");
		Keywords.maximizeWindow();
		Log.info("*********************Window maximize************************************");
		
		Log.info("******************* VerifyTextBoxLabel : for src textbox **********************");

		new WebDriverWait(Constants.driver, 20)
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='gosuggest_inputSrc']")))
				.sendKeys("A");
		Thread.sleep(1000);
		List<WebElement> myList = new WebDriverWait(Constants.driver, 20)
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
						By.xpath("//div[@class='dib marginL10 pad0 textOverflow width90']/div/span")));
		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i).getText());
			if (myList.get(i).getText().equals("Ahmedabad")) {
				myList.get(i).click();
				break;
			}
		}
	}

}

/*
 * @Test public void tc_02() { new WebDriverWait(Constants.driver, 20)
 * .until(ExpectedConditions.elementToBeClickable(By.xpath(
 * "//input[@id='gosuggest_inputSrc']"))) .sendKeys("M"); List<WebElement>
 * myList = new WebDriverWait(Constants.driver, 20)
 * .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.
 * xpath("Xpath of the dynamic drop down"))); for (WebElement element : myList)
 * { if (element.getText().contains("Mumbai")) ; element.click(); }
 */
