package web.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import web.basepage.baseclass;
import web.utils.waits;

public class verify_Homepage extends baseclass{
	
	
	By log = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/h5");
	By uname = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div");
	By name = By.name("username");
	By pass = By.name("password");
	By submit = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
    By hometext = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]");
    
//    login text
    public String verify_Logintext() throws InterruptedException {
    	waits.visibilityOfAllElementsLocatedBy(log);
    	WebElement element = driver.findElement(log);
    	boolean b = element.isDisplayed();
    	if(b) {
    		System.out.println(b);
    	}
    	String text = element.getText();
    	System.out.println(text);
    	Thread.sleep(3000);
		return text;
    }
//    username and password text
    public String verify_username() throws InterruptedException {
    	waits.visibilityOfAllElementsLocatedBy(uname);
    	WebElement element = driver.findElement(uname);
    	boolean b = element.isDisplayed();
    	if(b) {
    		System.out.println(b);
    	}
    	String text = element.getText();
    	System.out.println(text);
    	Thread.sleep(3000);
		return text;
    }
//    username
    public void verify_Namefield(String na) throws InterruptedException {
    	waits.visibilityOfAllElementsLocatedBy(name);
    	WebElement element = driver.findElement(name);
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
//    password
    public void verify_Passwordfield(String naa) throws InterruptedException {
    	waits.presenceOfAllElementsLocatedBy(pass);
    	WebElement element = driver.findElement(pass);
    	boolean b = element.isDisplayed();
    	if(b) {
    		System.out.println(b);
    	}
    	element.click();
    	element.clear();
    	element.sendKeys(naa);
    	System.out.println(element.getAttribute("value"));
    	System.out.println(element.getAttribute("type"));
    	Thread.sleep(5000);
    }
//    submit click
    public String verify_Submit_button() throws InterruptedException {
    	waits.presenceOfAllElementsLocatedBy(submit);
    	WebElement element = driver.findElement(submit);
    	String text = element.getText();
    	System.out.println(text);
    	Thread.sleep(3000);
    	element.click();
		return text;
    	
    }
//    home total text
    public String verify_Homepage_text() throws InterruptedException {
    	waits.presenceOfAllElementsLocatedBy(hometext);
    	WebElement element = driver.findElement(hometext);
    	boolean b = element.isDisplayed();
    	if(b) {
    		System.out.println(b);
    	}
    	String text = element.getText();
    	System.out.println(text);
    	Thread.sleep(3000);
		return text;
    }
}
