package com.shiva.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shiva.qa.base.TestBase;
import com.shiva.qa.pages.mercuryLaunchPage;

public class mercuryLaunchPageTest extends TestBase{

	/*****************************************************************************************************************
	 * Abhijit - we are creating the following constructor because from Base class(TestBase) we have to use the 
	 * property files which we have to use after that what ever the annotations like @BeforeMethod and @AfterMethod 
	 ******************************************************************************************************************/
	public mercuryLaunchPageTest(){
		super();
	}
	
	/***************************************************************************************
	 * object we have to use in all test so defining out side method
	 *************************************************************************************/
	mercuryLaunchPage objectMLP;
	String url="urlMercuryLogin"; //We are specifying URL we want to launch from here
	
	@BeforeMethod
	public void setUps(){
		/**
		 * Now we are calling the static methods from base class for Object initialization where we specified the 
		 * browser we want to execute our scripts 
		 */
		initialization();
		launchingApplication(url);
		
		/*****************************************************************************************
		 * We will be creating the object of page class so that to start execution
		 ***************************************************************************************/
		objectMLP = new mercuryLaunchPage();
	}
	
	@Test(priority=1)
	public void checkTitleOfPage(){
		String title = objectMLP.validateLaunchPageTitle();
		System.out.println("Actual Title - "+ title);
		Assert.assertEquals(title, "Welcome: Mercury Tours");
	}
	
	@Test(priority=2)
	public void checkUnserNameEnter(){
		objectMLP.enterUserNameFirstPage(prop.getProperty("userName"));
		objectMLP.enterPasswordFirstPage(prop.getProperty("passWord"));
		objectMLP.moveToRegister();
		String textToVerify = objectMLP.checkLinkOnPage();
		Assert.assertEquals(textToVerify, "REGISTER");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
	
	
}


























