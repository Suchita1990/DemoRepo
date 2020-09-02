package com.keywordframework.goibibo;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.Screenshot;

public class Constants {
	
	public static WebDriver driver;
	
	public static Actions action;
	
	public static String baseUrl = "https://www.goibibo.com/";
	
	public static Properties prop;
	
	public static FileInputStream fis;

	public static Screenshot screenshot;
	
	public static WebDriverWait wait;

}
