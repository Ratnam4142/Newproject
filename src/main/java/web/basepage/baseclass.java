package web.basepage;


import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
	public static WebDriver driver;
	public static Properties prop;
	
	public baseclass() {
		
		try {
		    prop = new Properties();
		    FileInputStream io = new FileInputStream("./Config/configs.properties");
		    prop.load(io);
			io.close();
		} catch (Exception e) {
			System.out.println("The exception taken as.." + e.getMessage());
			
		}
				
	}
	public void instalization() throws InterruptedException {
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("the browser was mathced");
		}else {
			System.out.println("the browser was not mathced");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("URL"));
		System.out.println("the browser open as...." + driver.getClass());
		Thread.sleep(5000);
	}
	public void TearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		System.out.println("the window was closed");
	}

}
