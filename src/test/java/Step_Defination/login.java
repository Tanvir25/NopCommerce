package Step_Defination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.Customer_searchPOM;
import PageObject.LoginPOM;
import cucumber.api.java.en.*;


public class login {

	public WebDriver driver;
	 LoginPOM lp;
	 Customer_searchPOM cust_Search;
	
	@Given("^user open URL$")
	public void user_open_URL() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://admin-demo.nopcommerce.com");
		
	}

	@When("^user enter valid email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enter_valid_email_as_and_password_as(String email, String password) throws Throwable {
	 
		lp=new LoginPOM(driver);
		lp.Enter_email().clear();
		lp.Enter_password().clear();
		Thread.sleep(5000);
		lp.Enter_email().sendKeys(email);
		lp.Enter_password().sendKeys(password);
	
		
	}

	@When("^user click login button$")
	public void user_click_login_button() throws Throwable {
	    lp.lgn_btn.click();
	}

	@Then("^User should able to see the dashboard page$")
	public void user_should_able_to_see_the_dashboard_page() throws Throwable {
		
		String expt_title="Dashboard / nopCommerce administration";
		String act_title=driver.getTitle();
		
		Assert.assertEquals(act_title, expt_title);
	    
	    System.out.println("TestCase Passed. User logged in");
	    
	    Thread.sleep(5000);
	}
	
	@When("^user click customers menulist$")
	public void user_click_customers_menulist() throws Throwable {
	    lp.Customers_menulist().click();
	    Thread.sleep(2000);
	}

	@When("^click on to customers_role$")
	public void click_on_to_customers_role() throws Throwable {
	    lp.role_Customers().click();
	    Thread.sleep(2000);
	}
	
	@When("^user click logout button$")
	public void user_click_logout_button() throws Throwable {
	   
		lp.logout_btn.click();
	}

	@Then("^user should redirect to login page$")
	public void user_should_redirect_to_login_page() throws Throwable {
	 
		String expt_title="Your store. Login";
		String act_title=driver.getTitle();
		Assert.assertEquals(act_title, expt_title);
	    System.out.println("TestCase Passed. User logged out and redirected to login page");
	}

	@Then("^user close the browser$")
	public void user_close_the_browser() throws Throwable {
	    driver.close();
	}
	
	
	
	//Customer Search steps starts here........
	
	@When("^click on to customers$")
	public void click_on_to_customers() throws Throwable {
		cust_Search = new Customer_searchPOM (driver);
		cust_Search.List_Customers().click();   
	}

	@Then("^user should see the customer page$")
	public void user_should_see_the_customer_page() throws Throwable {
	 
		String expt_title="Customers / nopCommerce administration";
		String act_title=driver.getTitle();
		
		Assert.assertEquals(act_title, expt_title);
	    
	    Thread.sleep(2000);
	}
	
	
	
	@When("^user enter first name as \"([^\"]*)\"$")
	public void user_enter_first_name_as(String fname) throws Throwable {
	    
		cust_Search.Enter_fname().sendKeys(fname);
		 Thread.sleep(2000);
	}

	@When("^click search button$")
	public void click_search_button() throws Throwable {
	 
		cust_Search.click_search_btn.click();
		 Thread.sleep(2000);
	}
}