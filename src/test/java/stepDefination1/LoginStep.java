package stepDefination1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStep {

	WebDriver driver;
	@Given("Chrome is Opened and Login Page is displayed")
	public void chrome_is_Opened_and_Login_Page_is_displayed() {
	    System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://127.0.0.1:8080/htmldb");
	}

	@When("User enters userName and password")
	public void user_enters_userName_and_password() {
	    driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Sys");
	    driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Newuser123");
	}

	@When("Click on Login button")
	public void click_on_Login_button() {
		driver.findElement(By.xpath("//*[@type='BUTTON']")).click();
	}

	@Then("Home Page should display")
	public void home_Page_should_display() {
	    assertEquals("Login Failed","Oracle", driver.getTitle());
	}
	
	
}
