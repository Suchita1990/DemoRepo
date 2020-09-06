package com.fileutility.property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.keywordframework.goibibo.Constants;

public class PropertiesFile {
	/**
	 * This methodwill open ObjectRepository.properites and will return value
	 * associated with key.
	 * 
	 * @param key
	 * @return value in form of {@code String}
	 */
	public static String getProperty(String key) {
		String value = null;
		try {
			Constants.fis = new FileInputStream("E:\\Eclipse Workspace\\keywords\\Input\\ObjectRepository.properties");
			Constants.prop = new Properties();
			Constants.prop.load(Constants.fis);
			value = Constants.prop.getProperty(key);
		} catch (FileNotFoundException e) {
			System.out.println("Unable to open Object Repository");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}

	public static String getProperty(String key, String filePath) {
		String value = null;
		try {
			Constants.fis = new FileInputStream(filePath);
			Constants.prop = new Properties();
			Constants.prop.load(Constants.fis);
		} catch (FileNotFoundException e) {
			System.out.println("File" + filePath + "not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Unable to load file:" + filePath);
			e.printStackTrace();
		}

		return value;
	}

	public static String[] getLocator(String key) {
		String[] values = null;
		try {
			Constants.fis = new FileInputStream("E:\\Eclipse Workspace\\keywords\\Input\\ObjectRepository.properties");
			Constants.prop = new Properties();
			Constants.prop.load(Constants.fis);
			String part = Constants.prop.getProperty(key);
			values = part.split("##");
			System.out.println("Locator Type :" + values[0]);
			System.out.println("Locator Value :" + values[1]);
			
		} catch (IOException e) {
			System.out.println("Unable to Open Object Repository");
			e.printStackTrace();
		}
		return values;

	}
	/*public static void main(String[] args) {
		  getLocator("signInwithFB");
	}
*/
}
