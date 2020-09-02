package com.datepicker.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.goibibo.keywords.Keywords;
import com.keywordframework.goibibo.Constants;

public class Datepicker_Departure_ReturnDate {
	@Test
	public void roundTrip() throws InterruptedException {
		Keywords.openBrowser("Chrome");
		Keywords.openUrl("https://www.goibibo.com/");
		Keywords.maximizeWindow();
	//	Keywords.moveToElement("XPATH", "//div[@class='dF justifyCenter padTB20']");
		Keywords.clickOnElement("XPATH", "//span[text()='Round trip']");
		Thread.sleep(3000);
	//	Keywords.moveToElement("XPATH", "//div[@class='dF justifyBetween flexWrap']");
		Keywords.clickOnElement("XPATH", "//div[@class='dF whiteBg col-md-3 col-sm-5 alignItemsCenter brdrTpBtmLft width23']");
		Thread.sleep(3000);
		WebElement element= Keywords.enterText1("XPATH", "//input[@id='gosuggest_inputSrc']", "PNQ");
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Keywords.clickOnElement("XPATH", "//input[@id='gosuggest_inputDest']");
		WebElement element1= Keywords.enterText1("XPATH", "//input[@id='gosuggest_inputDest']", "NAG");
		Thread.sleep(3000);
		element1.sendKeys(Keys.ARROW_DOWN);
		element1.sendKeys(Keys.ENTER);
		Keywords.clickOnElement("XPATH", "//input[@id='departureCalendar']");
		int totalWeekdays=7;
		JavascriptExecutor js=(JavascriptExecutor)Constants.driver;
		js.executeScript("document.getElementById('fare_20200516').click()");
		js.executeScript("document.getElementById('fare_20200524').click()");
		Keywords.clickOnElement("XPATH", "//span[@class='dF alignItemsCenter ico14 textOverflow blueGrey']");
		Keywords.moveToElement("XPATH", "//div[@class='paxMobile paxContainer']");
		Keywords.clickOnElement("XPATH", "//button[@id='adultPaxPlus']");
		Keywords.clickOnElement("XPATH", "//a[@class='icon-cancel-circle fr marginT10 marginR10 fr greyDr mobdn']");
		Thread.sleep(3000);
		Keywords.clickOnElement("XPATH", "//button[@class='fb button orange large ht55 fltHpySrchBtn']");
		
	}

}
