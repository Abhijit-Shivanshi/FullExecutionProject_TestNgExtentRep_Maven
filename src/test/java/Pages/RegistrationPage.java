package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {
	
	
	WebDriver driver;
	
	public RegistrationPage(WebDriver driver){
		this.driver = driver;
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
	
}
