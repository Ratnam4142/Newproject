package web.utils;

import org.openqa.selenium.JavascriptExecutor;

import web.basepage.baseclass;

public class pagescrooling extends baseclass {
	
	public static void page_one() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 200)");
	}
	public static void page_three() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 500)");
	}
	public static void page_five() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 800)");
	}
	public static void page_two_less() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(800, -200)");
	}
	public static void page_one_less() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(800, -500)");
	}
	public static void page_three_less() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(800, -800)");
	}
}
