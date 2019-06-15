package Pages;

import org.openqa.selenium.WebDriver;

public class openApplicationPageFacotry {
	
	WebDriver driver;
	
	public openApplicationPageFacotry(WebDriver driver){
		this.driver = driver;
	}

	public WebDriver openApplication(String url){
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}

	public void closeApplication(){
		driver.close();
	}


}
