package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ListCustomerPage extends BasePage {
	WebDriver driver;

	public ListCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"application_ajaxrender\"]/table[1]/thead/tr/th")
	WebElement ACCOUNTINGSUMMARY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a")
	WebElement LIST_CUSTOMER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2")
	WebElement CUSTOMER_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"foo_filter\"]")
	WebElement SEARCH_CUSTOMER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//tbody/tr/td[3]")
	WebElement ADDED_CUSTOMER_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"summary\"]")
	WebElement VERIFY_ADDEDCUSTOMER_SUMMARY_ELEMENT;

	public void Explicitwaitforaccountingsummaryelement(int time) {
		waitForElement(driver, time, ACCOUNTINGSUMMARY_ELEMENT);
	}

	public void verifybyaccountingsummary() {
		String text = ACCOUNTINGSUMMARY_ELEMENT.getText();
		System.out.println(text);
		Assert.assertEquals(ACCOUNTINGSUMMARY_ELEMENT.getText(), "Accounting Summary", "wrong Page");

	}

	public void clicklistcustomermenu() {
		LIST_CUSTOMER_ELEMENT.click();
	}

	public void Explicitwaitforcontactpage(int time) {
		waitForElement(driver, time, CUSTOMER_HEADER_ELEMENT);
	}

	public void verifycustomerpage() {
		Assert.assertEquals(CUSTOMER_HEADER_ELEMENT.getText(), "Contacts", "Wrong Page!!");
	}

	public void searchforaddedcustomer(String fullname) {
		SEARCH_CUSTOMER_ELEMENT.sendKeys(fullname);
	}

	public void clickaddedcustomername() {
		ADDED_CUSTOMER_NAME_ELEMENT.click();
	}

	public void verifyaddedcustomerpage() {
		Assert.assertEquals(VERIFY_ADDEDCUSTOMER_SUMMARY_ELEMENT.getText(), "Summary", "Wrong Page!!");
	}

	
	
}
