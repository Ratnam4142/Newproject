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
import web.locators.Forgotyourpassword;
import web.locators.Title_Validation;
import web.locators.verify_Homepage;

public class Forget_password extends baseclass{
	verify_Homepage home;
	Error_messages error;
	Forgotyourpassword forget;
	public Forget_password() {
		home = new verify_Homepage();
		error = new Error_messages();
		forget= new Forgotyourpassword();
	}
	@Test(priority = 0)
	public void Verify_printer() {
		System.out.println("All the best");
	}
	@Test(priority = 1)
	public void Verify_HomePageText() throws InterruptedException {
		
		String actu = home.verify_Homepage_text();
		String exp = "Login\n" + "Username : Admin\n" + "Password : admin123\n"+"Username\n" + 
		"Password\n"+ "Login\n"+ "Forgot your password?\n" + "OrangeHRM OS 5.6\n" 
		+ "© 2005 - 2024 OrangeHRM, Inc. All rights reserved.";
		Assert.assertEquals(actu, exp);
	}
	@Test(priority = 2)
	public void Verify_empty_values() throws InterruptedException {
		home.verify_Namefield(prop.getProperty("Username1"));
		home.verify_Passwordfield(prop.getProperty("Password1"));
		home.verify_Submit_button();
		String actu = error.verify_errortext();
		String exp = "Required";
		Assert.assertEquals(actu, exp);
	}
	@Test(priority = 3)
	public void verify_forgetScreen() throws InterruptedException {
		String actu = forget.verify_forgetPassword();
		String exp = "Forgot your password?";
		Assert.assertEquals(actu, exp);
//		Assert.assertEquals(forget.verify_forgetPassword(), "Forgot your password?");
		String act = forget.verify_forgetPassword_popup();
		String expe = "Reset Password\n" + "Please enter your username to identify your account to reset your password\n"
		+"Username\n" + "Cancel\n" + "Reset Password";
		Assert.assertEquals(act, expe);
	}
	@Test(priority = 4)
	public void verify_username() throws InterruptedException {
		forget.verify_submit_Button();
		Assert.assertEquals(error.verify_error3text(),"Required");
		forget.verify_Namefield(prop.getProperty("Username1"));
		Assert.assertEquals(forget.verify_Cancel_Button(), "Cancel");
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
