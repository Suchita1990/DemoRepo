package com.destinationdetails.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.goibibo.keywords.Keywords;
import com.keywordframework.goibibo.Constants;

public class Returndate {
    @Test
	public void tc_01() {
		Keywords.openBrowser("Chrome");
    	Constants.driver.get(Constants.baseUrl);
	    Keywords.maximizeWindow();
	    Constants.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    WebElement db=Constants.driver.findElement(By.xpath("//input[@id='returnCalendar']"));
	    Actions action=new Actions(Constants.driver);
	    action.moveToElement(db).doubleClick().build().perform();
	     

	}
}
