package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;
	
	@Test
	public void validUserShouldAbleToLogin() {

		BrowserFactory bf = PageFactory.initElements(driver, BrowserFactory.class);
		driver=bf.init();
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.insertusername("demo@techfios.com");
		loginpage.insertpassword("abc123");
		loginpage.clicksigninbutton();
		
		DashBoardPage dashboard = PageFactory.initElements(driver, DashBoardPage.class);
		dashboard.verifydashboardpage();

	}
	
	
	

}
