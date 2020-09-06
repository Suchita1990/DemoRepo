package com.brokenlink.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.goibibo.keywords.Keywords;
import com.keywordframework.goibibo.Constants;

public class BrokenLinks {
	@Test
	public void links() throws IOException, InterruptedException {
		Keywords.openBrowser("Chrome");
		Keywords.openUrl("https://www.goibibo.com/");
		Keywords.maximizeWindow();
		List<WebElement> links = Constants.driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			WebElement element = links.get(i);
			String url=element.getAttribute("href");
			
			URL link=new URL(url);
			HttpURLConnection httpConn=(HttpURLConnection) link.openConnection();
			Thread.sleep(3000);
			httpConn.connect();
			
			int rescode=httpConn.getResponseCode();
			if(rescode>=400)
			{
				System.out.println(url +" --"+"is broken link");
			}
			else
			{
				System.out.println(url +" --"+"is valid link");	
			}
		}
	}

}
