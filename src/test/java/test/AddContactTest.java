package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddContactPage;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddContactTest {
	WebDriver driver;
	@Test
	public void ValidUserShouldAbleToAddContact() {
		BrowserFactory bf = PageFactory.initElements(driver, BrowserFactory.class);
		driver = bf.init();

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.insertusername("demo@techfios.com");
		loginpage.insertpassword("abc123");
		loginpage.clicksigninbutton();

		DashBoardPage dashboard = PageFactory.initElements(driver, DashBoardPage.class);
		dashboard.verifydashboardpage();
		dashboard.clickcustomermenu();
		dashboard.clickaddcustomer();
		
			
		AddContactPage addcontactpage =PageFactory.initElements(driver, AddContactPage.class);
		addcontactpage.Explicitwaitforaddcontactpage(10);
		addcontactpage.verifyaddcontactpage();
		addcontactpage.insertfullname("Rajini Kanth");
		addcontactpage.selectcompanydropdown("Techfios");
		addcontactpage.insertemail("Rajini@techfios.com");
		addcontactpage.insertphonenumber("132132");
		addcontactpage.insertaddress("montith dr");
		addcontactpage.insertcity("shaumburgh");
		addcontactpage.insertstate("Texas");
		addcontactpage.insertzip("232232");
		addcontactpage.selectcountrydropdown("India");
		addcontactpage.selectcurrencydropdown("USD");
		addcontactpage.insertpassword("123456");
		addcontactpage.inserconfirmtpassword("123456");
		addcontactpage.clicksubmit();
		
		
		
	}

}
