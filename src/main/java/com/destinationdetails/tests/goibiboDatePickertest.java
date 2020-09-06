package com.destinationdetails.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.goibibo.keywords.Keywords;
import com.keywordframework.goibibo.Constants;

public class goibiboDatePickertest {
	@Test
	public void datePicker() {
		Keywords.openBrowser("Chrome");
		Constants.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Constants.driver.get(Constants.baseUrl);
		Keywords.maximizeWindow();

		// Click Departure Date
		Constants.driver.findElement(By.id("departureCalendar")).click();

		// Keywords.pickdatefromCalender();

		JavascriptExecutor js = (JavascriptExecutor) Constants.driver;

		// Putting date to the the selected date picker.
		js.executeScript("document.getElementById('departureCalendar').value='Thu, 7 May'");

		Constants.driver.findElement(By.cssSelector("#returnCalendar")).click();

	}

}
