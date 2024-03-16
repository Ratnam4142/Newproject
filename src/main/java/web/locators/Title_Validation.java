package web.locators;

import web.basepage.baseclass;

public class Title_Validation extends baseclass{

	public void verify_title() {
		System.out.println(driver.getTitle());
	}
	public void verify_title_one() {

		String title = "OrangeHRM";
		if(driver.getTitle().equals(title)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}	
	}
	public void verify_URL() {
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		if(driver.getCurrentUrl().equals(url)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}	
	}
}
