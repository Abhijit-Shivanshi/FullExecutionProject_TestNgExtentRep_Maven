package com.shiva.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shiva.qa.base.TestBase;
import com.shiva.qa.pages.mercuryRegistrationPage;

public class mercuryRegistrationPageTest extends TestBase{

	public mercuryRegistrationPageTest(){
		super();
	}
	
	/***************************************************************************************
	 * object we have to use in all test so defining out side method
	 *************************************************************************************/
	mercuryRegistrationPage objectRegistractionPage;
	String url="urlMercuryRegistration"; //We are specifying URL we want to launch from here
	
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
		objectRegistractionPage = new mercuryRegistrationPage();
	}
	
	@Test(priority=3)
	public void checkEnterFirstNameLastNamePhone(){
		objectRegistractionPage.entFirstName("FirstNameShiva");
		objectRegistractionPage.entLastName("LastShiva");
		objectRegistractionPage.entPhoneNumber("999999999");
		String RegestButtonTest = objectRegistractionPage.validateContact();
		System.out.println("Text for validate Contact = " + RegestButtonTest);
		Assert.assertEquals(RegestButtonTest, "Contact Information");
	}
	
	@Test(priority=4)
	public void checkEnterEmailAddressCity(){
		objectRegistractionPage.entEmail("shiva@abcd.com");
		objectRegistractionPage.entAddress("Himalya at Himachal pradesh near kelasaa");
		objectRegistractionPage.entCity("KELAHA");
		String RegestButtonTest = objectRegistractionPage.validateMailing();
		System.out.println("Text for validate Mailing = " + RegestButtonTest);
		Assert.assertEquals(RegestButtonTest, "Mailing Information");
	}
	
	@Test(priority=5)
	public void checkEnterStatePCUserName(){
		objectRegistractionPage.entState("HIMACHAL");
		objectRegistractionPage.entPostalCode("123456");
		objectRegistractionPage.entUserName("SHIVASHMABHU");
		String RegestButtonTest = objectRegistractionPage.validateUser();
		System.out.println("Text third check = " + RegestButtonTest);
		Assert.assertEquals(RegestButtonTest, "User Information");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
	
	
}


























