package web.Screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import web.basepage.baseclass;

public class Screenshot extends baseclass{
	
	public static void Screenshot_TCF(ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus()) {
			try {
				
				TakesScreenshot scr = (TakesScreenshot)driver;
			    File scr1 = scr.getScreenshotAs(OutputType.FILE);
			    File dest = new File("Screenshots/R-testing" + result.getClass() + "_OFF_" + result.getName() + ".png" );
			    FileUtils.copyFile(scr1, dest);
			    System.out.println("screenshot taken............." + result.getName());
			} catch (Exception e) {
				System.out.println("exception taken as...." + e.getMessage());
				
			}
			
		}
		
	}

}
