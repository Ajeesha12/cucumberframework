//package stepDefinition;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
// 
//public class contactstepdefinition {
//	WebDriver driver;
//	WebDriverWait wait;
//	@Given("^User is already in login page$")
//	public void user_is_already_in_login_page() { 
//		System.setProperty("webdriver.chrome.driver", "E:\\Chrome\\chromedriver_win32\\chromedriver.exe");
//		driver= new ChromeDriver();
//        driver.get("https://ui.freecrm.com/");
//	 
//	}
//
//	@When("^Title of login page is freeCRM$")
//	public void title_of_login_page_is_freeCRM()  {
//		String title= driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("Cogmento CRM", title);
//	}
//
//	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void enter_username_and_password(String username, String password)
//	{
//	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
//	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
//	}
//
//	@Then("^user clicks on login page$")
//	public void user_clicks_on_login_page()  {
//	    
//		driver.findElement(By.xpath("//div[text()='Login']")).click();
//	    
//	}
//
//	@Then("^Verify the title of home page$")
//	public void verify_the_title_of_home_page() {
//		String title= driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("Cogmento CRM", title);
//	}
//
//	@Then("^user moves to contacts page$")
//	public void user_moves_to_contacts_page() {
//		wait= new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Contacts']"))).click();
//	
//	
//	}
//
//	@Then("^user navigate to new contacts page$")
//	public void enter_navigate_to_new_contacts_page()  {
//	   driver.findElement(By.xpath("//i[@class='edit icon']")).click();
//	
//	}
//
//	@Then("^enter \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void enter_and(String firstname, String lastname)  {
//    driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstname);
//    driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastname);
//	}
//	@Then("^select save button$")
//	public void select_save_button()  {
//	driver.findElement(By.xpath("//i[@class='save icon']")).click();
//	}
//	@Then("^close the browser$")
//	public void close_the_browser() {
//		driver.quit();
//		
//		
//		
//	}
//	
//	}
