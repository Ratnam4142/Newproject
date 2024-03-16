package web.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import web.basepage.baseclass;
import web.utils.waits;

public class Forgotyourpassword extends baseclass{
	 By forget = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p");
	 By forgetText = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form");
	 By username = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/div[1]/div/div[2]/input");
	 By cancel = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/div[2]/button[1]");
	 By submit = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/div[2]/button[2]");
	 
//	 Forget password click
public String verify_forgetPassword() throws InterruptedException {
	waits.presenceOfAllElementsLocatedBy(forget);
	WebElement element = driver.findElement(forget);
	String text = element.getText();
	System.out.println(text);
	Thread.sleep(2000);
	element.click();
	Thread.sleep(3000);
	return text;
	}
// forget password popup home page text
public String verify_forgetPassword_popup() throws InterruptedException {
	waits.presenceOfAllElementsLocatedBy(forgetText);
	WebElement element = driver.findElement(forgetText);
	String text = element.getText();
	System.out.println(text);
	Thread.sleep(3000);
	return text;
	}
//   username
public void verify_Namefield(String na) throws InterruptedException {
	waits.visibilityOfAllElementsLocatedBy(username);
	WebElement element = driver.findElement(username);
	boolean b = element.isDisplayed();
	if(b) {
		System.out.println(b);
	}
	element.click();
	element.clear();
	element.sendKeys(na);
	System.out.println(element.getAttribute("value"));
	System.out.println(element.getAttribute("type"));
	Thread.sleep(3000);
}
// click on cancel button 
public String verify_Cancel_Button() throws InterruptedException {
	waits.presenceOfAllElementsLocatedBy(cancel);
	WebElement element = driver.findElement(cancel);
	String text = element.getText();
	System.out.println(text);
	Thread.sleep(2000);
	element.click();
	Thread.sleep(3000);
	return text;
	}
//click on cancel button 
public String verify_submit_Button() throws InterruptedException {
	waits.presenceOfAllElementsLocatedBy(submit);
	WebElement element = driver.findElement(submit);
	String text = element.getText();
	System.out.println(text);
	Thread.sleep(2000);
	element.click();
	Thread.sleep(3000);
	return text;
	}
}
