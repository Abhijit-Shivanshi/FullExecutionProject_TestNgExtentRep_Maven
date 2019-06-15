package com.shiva.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shiva.qa.base.TestBase;

public class mercuryRegistrationPage extends TestBase{

	/****************************************************************************************************************
	 * Now we are initiating the elements using the Page Factory Method and constructor
	 ************************************************************************************************************/
	public mercuryRegistrationPage(){
		PageFactory.initElements(driver, this);
	}
	/*************************************************************************
	 ***********************   Locating Elements *****************************
	 *************************************************************************/
	@FindBy(name="firstName")
	@CacheLookup
	WebElement firstName;
	
	@FindBy(name="lastName")
	@CacheLookup
	WebElement lastName;
	
	@FindBy(name="phone")
	@CacheLookup
	WebElement phoneNumber;
	
	@FindBy(id="userName")
	@CacheLookup
	WebElement email;
	
	@FindBy(name="address1")
	@CacheLookup
	WebElement address;
	
	@FindBy(name="city")
	@CacheLookup
	WebElement city;
	
	@FindBy(name="state")
	@CacheLookup
	WebElement state;
	
	@FindBy(name="postalCode")
	@CacheLookup
	WebElement postalCode;
	
	@FindBy(name="country")
	@CacheLookup
	WebElement countyDropdown;
	
	@FindBy(id="email")
	@CacheLookup
	WebElement UserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement password;
	
	@FindBy(name="confirmPassword")
	@CacheLookup
	WebElement confPassword;
	
	@FindBy(xpath="//input[@name='register']")
	@CacheLookup
	WebElement submitButton;
	
	@FindBy(xpath="//a[contains(text(),'REGISTER')]")
	@CacheLookup
	WebElement linkRegisterd;
	
	@FindBy(xpath="//font[contains(text(),'Contact')]")
	@CacheLookup
	WebElement linkContact;
	
	@FindBy(xpath="//font[contains(text(),'Mailing')]")
	@CacheLookup
	WebElement linkMailing ;

	@FindBy(xpath="//font[contains(text(),'User')]")
	@CacheLookup
	WebElement linkUser;


	/********************************************************************************************************************
	 ************************************       Respective methods   ************************************
	 *******************************************************************************************************************/
	
	public void entFirstName(String userNames){
		System.out.println("User First name enter - " + userNames);
		firstName.sendKeys(userNames);
	}
	
	public void entLastName(String lastNames){
		System.out.println("User First name enter - " + lastNames);
		lastName.sendKeys(lastNames);
	}
	
	public void entPhoneNumber(String phon){
		System.out.println("User First name enter - " + phon);
		phoneNumber.sendKeys(phon);
	}
	
	public void entEmail(String emails){
		System.out.println("User First name enter - " + emails);
		email.sendKeys(emails);
	}
	
	public void entAddress(String addres){
		System.out.println("User First name enter - " + addres);
		address.sendKeys(addres);
	}
	
	public void entCity(String citys){
		System.out.println("User First name enter - " + citys);
		city.sendKeys(citys);
	}


	public void entState(String states){
		System.out.println("User First name enter - " + states);
		state.sendKeys(states);
	}
	
	public void entPostalCode(String postalCodes){
		System.out.println("User First name enter - " + postalCodes);
		postalCode.sendKeys(postalCodes);
	}
	
	public void entUserName(String emails){
		System.out.println("User First name enter - " + emails);
		UserName.sendKeys(emails);
	}
	
	public String validateContact(){
		return linkContact.getText();
	}
	
	public String validateMailing(){
		return linkMailing.getText();
	}
	
	public String validateUser(){
		return linkUser.getText();
	}
	
	
}
