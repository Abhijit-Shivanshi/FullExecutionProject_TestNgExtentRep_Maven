package com.shiva.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shiva.qa.base.TestBase;

public class mercuryLaunchPage extends TestBase{
	/*************************************************************************
	 ***********************   Locating Elements *****************************
	 *************************************************************************/
	@FindBy(name="userName")
	@CacheLookup
	WebElement userNameFirstPage;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement passwordFirstPage;
	
	@FindBy(xpath="//a[contains(text(),'REGISTER')]")
	@CacheLookup
	WebElement linkRegisterd;
	
	@FindBy(xpath="//a[contains(text(),'REGISTER')]")
	@CacheLookup
	WebElement linkOnPageToVerify;

	/****************************************************************************************************************
	 * Now we are initiating the elements using the Page Factory Method 
	 * For that we will create the constructor - now in interview we will be ask
	 * how you initialize the element with page factory method so this is way by using the 
	 * initElements - which is nothing but initialize elements- now all elements are initialize with this -
	 * instead of this we can use mercuryLaunchPage class name - but this will indicates the currant class methods 
	 ************************************************************************************************************/
	public mercuryLaunchPage(){
		PageFactory.initElements(driver, this);
	}
	
	/**********************************************************************************************
	 * -------------------- Actions we do on the page --------------------------------------
	 **********************************************************************************************/
	public String validateLaunchPageTitle(){
		return driver.getTitle();
	}
	
	public void enterUserNameFirstPage(String userNames){
		System.out.println("User name enter - " + userNames);
		userNameFirstPage.sendKeys(userNames);
	}
	
	public void enterPasswordFirstPage(String passwd){
		System.out.println("User Password enter - " + passwd);
		passwordFirstPage.sendKeys(passwd);
	}
	
	public String checkLinkOnPage(){
		return linkOnPageToVerify.getText();
	}
	
	
	public void moveToRegister() {
		linkRegisterd.click();
	}
}
