package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddContactPage extends BasePage {
	WebDriver driver;
	

	public AddContactPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5")
	WebElement ADDCONTACT_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement FULLNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
	WebElement COMPANY_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement PHONE_NUMBER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]")
	WebElement ADDRESS_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"city\"]")
	WebElement CITY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"state\"]")
	WebElement STATE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"zip\"]")
	WebElement ZIP_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]")
	WebElement COUNTRY_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"currency\"]")
	WebElement CURRENCY_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cpassword\"]")
	WebElement CONFIRM_PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]")
	WebElement SUBMIT_BUTTON_ELEMENT;

	
	
	public void Explicitwaitforaddcontactpage(int time) {
		waitForElement(driver, time, ADDCONTACT_HEADER_ELEMENT);
	}

	public void verifyaddcontactpage() {
		Assert.assertEquals(ADDCONTACT_HEADER_ELEMENT.getText(), "Add Contact", "Wrong Page!!");
	}

	public String insertfullname(String name) {
	 String fullname = name + generateRandomNum(999);
		FULLNAME_ELEMENT.sendKeys(fullname);
		return fullname;
	}

	public void selectcompanydropdown(String company) {
		selectFromDropDown(COMPANY_DROPDOWN_ELEMENT, company);
	}

	public void insertemail(String email) {
		String genemail = generateRandomNum(999) + email;
		EMAIL_ELEMENT.sendKeys(genemail);
	}

	public void insertphonenumber(String phonenum) {
		String genphonenum = phonenum + generateRandomNum(999);
		PHONE_NUMBER_ELEMENT.sendKeys(genphonenum);
	}

	public void insertaddress(String address) {
		ADDRESS_ELEMENT.sendKeys(address);
	}

	public void insertcity(String city) {

		CITY_ELEMENT.sendKeys(city);
	}

	public void insertstate(String state) {
		STATE_ELEMENT.sendKeys(state);
	}

	public void insertzip(String zip) {
		ZIP_ELEMENT.sendKeys(zip);
	}

	public void selectcountrydropdown(String country) {
		selectFromDropDown(COUNTRY_DROPDOWN_ELEMENT, country);
	}

	public void selectcurrencydropdown(String currency) {
		selectFromDropDown(CURRENCY_DROPDOWN_ELEMENT, currency);
	}

	public void insertpassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}

	public void inserconfirmtpassword(String confirmpassword) {
		CONFIRM_PASSWORD_ELEMENT.sendKeys(confirmpassword);
	}

	public void clicksubmit() {
		SUBMIT_BUTTON_ELEMENT.click();
	}

}
