package stepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

	public class dealstepdefinition {
		WebDriver driver;
		WebDriverWait wait;
		@Given("^User is already in login page$")
		public void user_is_already_in_login_page() { 
			System.setProperty("webdriver.chrome.driver", "E:\\Chrome\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
	        driver.get("https://ui.freecrm.com/");
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
		 
		}

		@When("^Title of login page is freeCRM$")
		public void title_of_login_page_is_freeCRM()  {
			String title= driver.getTitle();
			System.out.println(title);
			Assert.assertEquals("Cogmento CRM", title);
		}

		@When("^user enter username and password$")
		public void enter_username_and_password(DataTable credentials)
		{
			List<List<String>> data =credentials.raw();  //initialize data table, will give complete data table access
		    driver.findElement(By.xpath("//input[@name='email']")).sendKeys(data.get(0).get(0));// to get first raw data
		    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get(0).get(1));// to get second raw data
		}

		@Then("^user clicks on login page$")
		public void user_clicks_on_login_page()  {
		    
			driver.findElement(By.xpath("//div[text()='Login']")).click();
		    
		}

		@Then("^Verify the title of home page$")
		public void verify_the_title_of_home_page() {
			String title= driver.getTitle();
			System.out.println(title);
			Assert.assertEquals("Cogmento CRM", title);
		}

		@Then("^user moves to deals page$")
		public void user_moves_to_deals_page() {
			wait= new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Deals']"))).click();
			driver.navigate().refresh();
		}

		@Then("^user navigate to new deals page$")
		public void user_navigate_to_new_deals_page()  {
		   driver.findElement(By.xpath("//i[@class='edit icon']")).click();
		
		}

		@Then("^enter data details$")
		public void enter_and(DataTable dealdata)  {
		List<List<String>> data =dealdata.raw();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='title']"))).sendKeys(data.get(0).get(0));
	    driver.findElement(By.xpath("(//input[@class='search'])[1]")).sendKeys(data.get(0).get(1));

	    WebElement ele = driver.findElement(By.xpath("//div[@name='products']"));
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].value= 'data.get(0).get(1)'", ele);
	    
    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@name='products']"))).sendKeys(data.get(0).get(2));
	    driver.findElement(By.xpath("(//input[@class='search'])[2]")).sendKeys(data.get(0).get(3));
	    driver.findElement(By.xpath("(//input[@class='search'])[4]")).sendKeys(data.get(0).get(4));
		}
		@Then("^select save button$")
		public void select_save_button() 
		{
		driver.findElement(By.xpath("//i[@class='save icon']")).click();
		}
		@Then("^close the browser$")
		public void close_the_browser() {
			driver.quit();
			
			
			
		}
		
		}

	
	
	
	

