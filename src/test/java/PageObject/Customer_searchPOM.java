package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customer_searchPOM {

public WebDriver driver;
	
	public  Customer_searchPOM(WebDriver rdriver) {
		this.driver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	
	@FindBy (xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]")
	WebElement customers_list;
	
	public WebElement List_Customers() {
		return customers_list;
	}
	
	@FindBy (xpath="//*[@id=\"SearchFirstName\"]")
	WebElement fname;
	
	public WebElement Enter_fname() {
		return fname;
	}
	
	@FindBy(xpath="//*[@id=\"search-customers\"]")
	public WebElement click_search_btn;
}
