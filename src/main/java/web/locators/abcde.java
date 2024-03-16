package web.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import web.basepage.baseclass;
import web.utils.waits;

public class abcde extends baseclass {
	

//	WebDriver driver = new ChromeDriver();
//	driver.manage().window().maximize();
	String url = "https://ui.vision/demo/webtest/frames/";
	driver.get(url);
	Thread.sleep(3000);
//	frame1
	driver.switchTo().frame(0);
	WebElement irr = driver.findElement(By.name("mytext1"));
	irr.sendKeys("Rats");
	driver.switchTo().defaultContent();
//	frame 2
	Thread.sleep(5000);
	driver.switchTo().frame(1);
	WebElement ir = driver.findElement(By.name("mytext2"));
	ir.sendKeys("Rats");
	driver.switchTo().defaultContent();
//	frame 3
	driver.switchTo().frame(2);
	WebElement irrr = driver.findElement(By.name("mytext3"));
	irrr.sendKeys("Ratss");
	driver.switchTo().defaultContent();
//	frame 4
	driver.switchTo().frame(3);
	WebElement irs = driver.findElement(By.name("mytext4"));
	irs.sendKeys("Rats");
	driver.switchTo().defaultContent();
}
}
