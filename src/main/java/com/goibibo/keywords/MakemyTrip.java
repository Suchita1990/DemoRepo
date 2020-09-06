package com.goibibo.keywords;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.keywordframework.goibibo.Constants;

public class MakemyTrip {
	@Test
	public void tc_01() {
     Keywords.openBrowser("Chrome");
     Keywords.openUrl("https://www.makemytrip.com/");
     Keywords.maximizeWindow();
     Constants.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
  //   Constants.driver.findElement(By.xpath("//span[text()='From']")).click();
   //  Constants.driver.findElement(By.cssSelector("#react-autowhatever-1"));
   //  Constants.driver.findElement(By.cssSelector("div.react-autosuggest__section-container.react-autosuggest__section-container--first")).click();
     Constants.driver.findElement(By.cssSelector("ul.react-autosuggest__suggestions-list"));
	}

}
