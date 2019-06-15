package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LaunchApplicationPageFacotry;
import Pages.openApplicationPageFacotry;

public class LaunchingApplication {
	
	WebDriver driver;
	
	@Test
	public void verifyApplicationLaunch() throws Exception{
		
		System.setProperty("webdriver.gecko.driver","D:/ShivaFullProject/DevelopmentTools/Gecko_Driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String url = "http://newtours.demoaut.com/mercurywelcome.php";
		
		// First page - OPEN/CLOSE application 
		openApplicationPageFacotry objOpenApp = PageFactory.initElements(driver, openApplicationPageFacotry.class);
		objOpenApp.openApplication(url);
		
		// Second page - Operation on first page 
		LaunchApplicationPageFacotry objLA = PageFactory.initElements(driver, LaunchApplicationPageFacotry.class);
		objLA.enterUserNameFirstPage("Shivshambhu");
		objLA.enterPasswordFirstPage("Shiva123");
		objLA.moveToRegister();
		
		// First page - CLOSE application
		objOpenApp.closeApplication();
	}
	
		
}
