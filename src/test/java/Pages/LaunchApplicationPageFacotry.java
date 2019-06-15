package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.shiva.qa.base.TestBase;

public class LaunchApplicationPageFacotry extends TestBase{
	
	
	WebDriver driver;
	
	public LaunchApplicationPageFacotry(WebDriver driver){
		this.driver = driver;
	}

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

	public void enterUserNameFirstPage(String userNames){
		System.out.println("User name enter - " + userNames);
		userNameFirstPage.sendKeys(userNames);
	}
	
	public void enterPasswordFirstPage(String passwd){
		System.out.println("User Password enter - " + passwd);
		passwordFirstPage.sendKeys(passwd);
	}
	
	public void moveToRegister() {
		linkRegisterd.click();
	}

	
}
