package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LaunchApplicationPageFacotry;
import Pages.RegistrationPage;
import Pages.openApplicationPageFacotry;

public class PilotRunnerClass {

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
	
	@Test
	public void verifyFirstUserNamePassword() throws Exception{
		
		System.setProperty("webdriver.gecko.driver","D:/ShivaFullProject/DevelopmentTools/Gecko_Driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String url = "http://newtours.demoaut.com/mercuryregister.php?osCsid=b6c2dab197e8a54ae0a3bbd06eea0deb";
		
		// First page - OPEN/CLOSE application 
		openApplicationPageFacotry objOpenApp = PageFactory.initElements(driver, openApplicationPageFacotry.class);
		objOpenApp.openApplication(url);
		
		// Second page - Operation on first page 
		RegistrationPage objRP = PageFactory.initElements(driver, RegistrationPage.class);
		objRP.entFirstName("FirstNameShiva");
		objRP.entLastName("LastShiva");
		objRP.entPhoneNumber("999999999");
		objRP.entEmail("shiva@abcd.com");
		objRP.entAddress("Himalya at Himachal pradesh near kelasaa");
		objRP.entCity("KELAHA");
		objRP.entState("HIMACHAL");
		objRP.entPostalCode("123456");
		objRP.entUserName("SHIVASHMABHU");
		
				
		// First page - CLOSE application
		objOpenApp.closeApplication();
	}
}
