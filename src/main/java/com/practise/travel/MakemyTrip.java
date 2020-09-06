package com.practise.travel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakemyTrip {
       public static WebDriver driver;
    public static void main(String[] args) {
		
	    WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.makemytrip.com/");
        String actualTitle=" ";
        actualTitle=driver.getTitle();
        String url=driver.getCurrentUrl();
        System.out.println(url);
        String expectedTitle=actualTitle;
        if(actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test pass");
        }
        else{
            System.out.println("Test fail");
        }
       /* WebElement roundtrip=driver.findElement(By.xpath("//li[@class='selected']"));
        roundtrip.click();
        System.out.println("Select one way option");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='fromCity']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> dd_menu=driver.findElements(By.xpath("//div[@id='react-autowhatever-1']"));
        for(int i=0;i<dd_menu.size();i++){
            WebElement element=dd_menu.get(i);
            String innerhtml=element.getAttribute("innerHTML");
            if(innerhtml.contentEquals("Hyderabad, India             HYD" )){
                element.click();
                break;
            }
            System.out.println("Values in list " +innerhtml);
            }
        }*/
        WebElement roundtrip=driver.findElement(By.xpath("//li[@class='selected']"));
        roundtrip.click();
        System.out.println("Select one way option");
       WebElement we = driver.findElement(By.xpath("//input[@id='fromCity']"));
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
        we.sendKeys("hyde");
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
        we.sendKeys(Keys.RETURN);

        }
}

