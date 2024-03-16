package web.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import web.basepage.baseclass;
import web.utils.waits;

public class Error_messages extends baseclass {

	By error = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span");
	By error1 = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/span");
	By error2 = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p");
	By error3 = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/div[1]/div/span");
	//*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p

	//  error message
	public String verify_errortext() throws InterruptedException {
		waits.visibilityOfAllElementsLocatedBy(error);
		WebElement element = driver.findElement(error);
		String text = element.getText();
		System.out.println("text validate as...." + text);
		Thread.sleep(3000);
		return text;

	}
	//error1 message
	public String verify_error1text() throws InterruptedException {
		waits.visibilityOfAllElementsLocatedBy(error1);
		WebElement element = driver.findElement(error1);
		String text = element.getText();
		System.out.println("text validate as...." +text);
		Thread.sleep(3000);
		return text;

	}
	//error2 message
	public String verify_error2text() throws InterruptedException {
		waits.visibilityOfAllElementsLocatedBy(error2);
		WebElement element = driver.findElement(error2);
		String text = element.getText();
		System.out.println("text validate as...." + text);
		Thread.sleep(3000);
		return text;

	}
	//error3 message
	public String verify_error3text() throws InterruptedException {
		waits.visibilityOfAllElementsLocatedBy(error3);
		WebElement element = driver.findElement(error3);
		String text = element.getText();
		System.out.println("text validate as...." + text);
//		Thread.sleep(3000);
		return text;

	}

}
