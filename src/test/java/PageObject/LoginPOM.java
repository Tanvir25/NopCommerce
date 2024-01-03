package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	
	public WebDriver driver;
	
	public  LoginPOM(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	@FindBy (xpath="//*[@id=\"Email\"]")
	WebElement email;
	
	public WebElement Enter_email() {
		return email;
	}

	@FindBy (id="Password")
	WebElement password;
	
	public WebElement  Enter_password() {
		return password;
	}


	@FindBy (xpath="/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]")
	public WebElement lgn_btn;
	
	@FindBy (xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a")
	WebElement customers;
	
	public WebElement Customers_menulist() {
		return customers;
	}
	
	@FindBy (xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[2]")
	WebElement customers_role;
	
	public WebElement role_Customers() {
		return customers_role;
	}
	
	
	@FindBy (xpath="//*[@id=\"navbarText\"]/ul/li[3]")
	public WebElement logout_btn;
	
	
}


