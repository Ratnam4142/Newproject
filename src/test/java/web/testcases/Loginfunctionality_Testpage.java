package web.testcases;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import web.Screenshot.Screenshot;
import web.basepage.baseclass;
import web.locators.Title_Validation;
import web.locators.verify_Homepage;

public class Loginfunctionality_Testpage extends baseclass{
	
	verify_Homepage home;
	Title_Validation title;
	public Loginfunctionality_Testpage() {
		home = new verify_Homepage();
		title = new Title_Validation();
	}
	@Test(priority = 0)
	public void Verify_printer() {
		System.out.println("All the best");
	}
	
	@Test(priority = 1)
	public void Verify_Title() throws InterruptedException {
		title.verify_title();
		title.verify_URL();
	}
	@Test(priority = 2)
	public void Verify_hometext() throws InterruptedException {
		home.verify_Logintext();
		home.verify_username();
	}
	@Test(priority = 3)
	public void Verify_username() throws InterruptedException {
		home.verify_Namefield(prop.getProperty("Username"));
		home.verify_Passwordfield(prop.getProperty("Password"));
	}
	@Test(priority = 4)
	public void Verify_Submit_click() throws InterruptedException {
		home.verify_Submit_button();
	}
	@AfterMethod
	public void screenshot(ITestResult result) {
		Screenshot.Screenshot_TCF(result);
	}
	@BeforeClass
	public void openwindow() throws InterruptedException {
		instalization();
	}
	@AfterClass
	public void closewindow() throws InterruptedException {
		TearDown();
	}
   
}
