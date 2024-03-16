package web.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import web.basepage.baseclass;

public class waits extends baseclass{
	
	public static int wait = 30;
	
	public static void visibilityOfAllElementsLocatedBy(By by) {
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(wait));
		waits.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
	}
	public static void visibilityOfElementLocated(By by) {
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(wait));
		waits.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	public static void visibilityOfElementocated(WebElement element) {
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(wait));
		waits.until(ExpectedConditions.visibilityOfAllElements(element));
	}
	public static void presenceOfAllElementsLocatedBy(By by) {
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(wait));
		waits.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
	}
	public static void elementToBeClickable(By by) {
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(wait));
		waits.until(ExpectedConditions.elementToBeClickable(by));
	}

}
