package web.testcases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import web.Screenshot.Screenshot;
import web.basepage.baseclass;
import web.locators.Error_messages;
import web.locators.Title_Validation;
import web.locators.verify_Homepage;

public class LoginFunctionality_withErrors_Assert extends baseclass{
	
	verify_Homepage home;
	Title_Validation title;
	Error_messages error;
	public LoginFunctionality_withErrors_Assert() {
		home = new verify_Homepage();
		title = new Title_Validation();
		error = new Error_messages();
	}
	@Test(priority = 0)
	public void Verify_printer() {
		System.out.println("Verify printer settings");
	}
	
	@Test(priority = 1)
	public void Verify_Title() throws InterruptedException {
		title.verify_title();
		title.verify_URL();
	}
	@Test(priority = 2)
	public void Verify_HomePageText() throws InterruptedException {
		
		String actu = home.verify_Homepage_text();
		String exp = "Login\n" + "Username : Admin\n" + "Password : admin123\n"+"Username\n" + 
		"Password\n"+ "Login\n"+ "Forgot your password?\n" + "OrangeHRM OS 5.6\n" 
		+ "© 2005 - 2024 OrangeHRM, Inc. All rights reserved.";
		Assert.assertEquals(actu, exp);
	}
	@Test(priority = 3)
	public void Verify_empty_values() throws InterruptedException {
		home.verify_Namefield(prop.getProperty("Username1"));
		home.verify_Passwordfield(prop.getProperty("Password1"));
		home.verify_Submit_button();
		String actu = error.verify_errortext();
		String exp = "Required";
		Assert.assertEquals(actu, exp);
		
	}
	@Test(priority = 4)
    public void Verify_Specialchar_values() throws InterruptedException {
		home.verify_Namefield(prop.getProperty("Username2"));
		home.verify_Passwordfield(prop.getProperty("Password2"));
		home.verify_Submit_button();
		error.verify_error2text();
		String actu = error.verify_error2text();
		String exp = "Invalid credentials";
		Assert.assertEquals(actu, exp);
		
	}                  
	
    @Test(priority = 5)
   public void Verify_vuser_Invalid_Password() throws InterruptedException {
    	home.verify_Namefield(prop.getProperty("Username3"));
		home.verify_Passwordfield(prop.getProperty("Password3"));
		home.verify_Submit_button();
		String actu = error.verify_error2text();
		String exp = "Invalid credentials";
		Assert.assertEquals(actu, exp);
   	}
    @Test(priority = 6)
    public void Verify_user_valid() throws InterruptedException {
     	home.verify_Namefield(prop.getProperty("Username"));
 		home.verify_Passwordfield(prop.getProperty("Password"));
 		Assert.assertEquals(home.verify_Submit_button(), "Login");
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
