package stepDefination2;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewUserStep {

	WebDriver driver;
	@Given("Chrome is Opened and Login Page is displayed")
	public void chrome_is_Opened_and_Login_Page_is_displayed() {
	    System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://127.0.0.1:8080/htmldb");
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String s1, String s2) {
		  driver.findElement(By.xpath("//*[@type='text']")).sendKeys(s1);
		    driver.findElement(By.xpath("//*[@type='password']")).sendKeys(s2);
	}
	@When("Click on Login button")
	public void click_on_Login_button() {
		driver.findElement(By.xpath("//*[@type='BUTTON']")).click();
	}

	@Then("Home Page should display")
	public void home_Page_should_display() {
	    assertEquals("Login Failed","Oracle", driver.getTitle());
	}
	
	@Then("Click On Administration Link")
	public void click_On_Administration_Link() {
	    driver.findElement(By.xpath("//*[@id=\"wwvFlowForm\"]/div[7]/table/tbody/tr/td[1]/div/div[1]/a[2]")).click();
	}

	@Then("Click On Database User")
	public void click_On_Database_User() {
	    driver.findElement(By.xpath("//*[@id=\"wwvFlowForm\"]/div[7]/table/tbody/tr/td[1]/div/div[3]/a[2]")).click();
	}

	@Then("Database Page should Open")
	public void database_Page_should_Open() {
		assertEquals("You dont have admin rights","Database Users", driver.getTitle());
	}

	@Then("Click on create")
	public void click_on_create() {
	    driver.findElement(By.xpath("//*[@id=\"R162627621263759065\"]/tbody/tr/td[2]/input")).click();
	}

	@And("Enter User Details")
	public void enter_User_Details() {
		driver.findElement(By.id("P2611_USERNAME")).sendKeys("gifuser");
		driver.findElement(By.id("P2611_PASSWORD")).sendKeys("gifuser123");
		driver.findElement(By.id("P2611_CONFIRM_PASSWORD")).sendKeys("gifuser123");
		driver.findElement(By.xpath("//*[@id=\"R162638405127839537\"]/thead/tr/th[2]/input[2]")).click();
	}

	@Then("User should be Created")
	public void user_should_be_Created() {
		assertEquals("User Created.", driver.findElement(By.xpath("//*[@id=\"htmldbMessageHolder\"]/div")).getText());
	}
	
	@After
	public void after()
	{
		driver.quit();
	}
	
	@AfterStep
	public void afterStep()
	{
		System.out.println("After Step");
	}
}
