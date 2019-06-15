package com.shiva.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.w3c.dom.events.EventException;

import com.shiva.qa.util.TestUtil;
import com.shiva.qa.util.WebEventListener;

public class TestBase {

	public static Properties prop;
	public static WebDriver driver;
	public static EventFiringWebDriver eventDriver;
	public static WebEventListener eventListener;
	/*******************************************************************************
	 * Abhijit - here we are creating constructor and defining the things 
	 * we are reading the property from property file 
	 ******************************************************************************/
	public TestBase(){
		
		try{
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:/ShivaFullProj_Maven_WorkSpace/Maven_Intigration_Jenkins_Execution/src/main/java/com/"
					+ "shiva/qa/config/config.properties");
			prop.load(ip);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch(IOException io){
			io.printStackTrace();
		}
	}

	/*******************************************************************************
	 * creating method so that we will Initialize the driver and use it in the base class -
	 ******************************************************************************/
	
	public static void initialization(){
		// Here we are taking which browser we want to execute from property file
		String browserName = prop.getProperty("browser");
		System.out.println("Name of the Browser - " + browserName);
		// FireFox driver 
		if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver","D:/ShivaFullProject/DevelopmentTools/Gecko_Driver/geckodriver.exe");
			driver = new FirefoxDriver();
		} // Chrome driver
		else if(browserName.equals("chrome")){
					System.setProperty("webdriver.chrome.driver","C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");
					driver = new ChromeDriver();
				}
		
		/***************************************************************************
		 * class implements the WebDriverEventListener which is included under events.
		 ***************************************************************************/
		eventDriver = new EventFiringWebDriver(driver);
		
		// Now we will create the object of EventListenerHandler to register it with EventFiringWebDriver
		
		eventListener = new WebEventListener();
		eventDriver.register(eventListener);
		
		driver = eventDriver;
		
		/******************************************************************************
		 * This are the general things we need 
		 ******************************************************************************/
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		//driver.get(prop.getProperty("urlMercuryLogin"));	
	}
	
	/*********************************************************************************
	 * Launching your URL which we are taking from Property file 
	 ********************************************************************************/
	public static void launchingApplication(String url){
		System.out.println("-------------------> " + url);
		driver.get(prop.getProperty(url));	
	}
}
