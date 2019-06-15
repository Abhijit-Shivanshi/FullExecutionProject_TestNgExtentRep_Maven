package com.shiva.qa.util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.shiva.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	public static long PAGE_LOAD_TIMEOUT = 31;
	public static long IMPLICIT_WAIT = 31;
	
	
	public void switchToFrame(String fName){
		driver.switchTo().frame(fName);
	}
	
	public static void takeScreenshotAtEndOfTest() throws IOException{
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentDir = "C:/ShivaFullProj_Maven_WorkSpace/Maven_Intigration_Jenkins_Execution/src/main/java/com/shiva/qa";
		FileHandler.copy(scrFile, new File("C:/ShivaFullProj_Maven_WorkSpace/Maven_Intigration_Jenkins_Execution/src/main/java/com/shiva/qa/"+System.currentTimeMillis()+".png"));
		//FileHandler.copy(scrFile, new File("D:/screenshotCheck.png"));
	}
}
