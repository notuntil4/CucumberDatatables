
package cucumberframework.steps;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUsSteps {

	WebDriver driver;

	@Before()
	public void setup() throws IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	}

	@Given("^I access webdriveruniversity\\.com$")
	public void i_access_webdriveruniversity_com() throws Throwable {
		driver.get("http://www.webdriveruniversity.com");
	}

	@When("^I click on the contact us button$")
	public void i_click_on_the_contact_us_button() throws Throwable {
		driver.findElement(By.id("contact-us")).click();
	}

	@When("^I enter a valid first name$")
	public void i_enter_a_valid_first_name() throws Throwable {
		// store the current window handle
		String winHandleBefore = driver.getWindowHandle();
		// Perform the click operation that opens the new window
		// And switch to new window
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("Chitra");
	}

	@When("^I enter a valid last name$")
	public void i_enter_a_valid_last_name() throws Throwable {
		driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Velayutham");
	}

	@When("^I enter a valid email address$")
	public void i_enter_a_valid_email_address() throws Throwable {
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("abc@abc.com");
	}

	@When("^I enter comments$")
	public void i_enter_comments(DataTable comments) throws Throwable {
		List<List<String>> commentData = comments.raw();
		driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys(commentData.get(0).get(0) + "\n");
		driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys(commentData.get(0).get(1));

		System.out.println("I enter the comments:" + commentData.get(0).get(0));
		System.out.println("I enter the comments:" + commentData.get(0).get(1));
		System.out.println("I enter the comments:" + commentData.get(1).get(0));
		System.out.println("I enter the comments:" + commentData.get(1).get(1));
	}

	@When("^I click on the submit button$")
	public void i_click_on_the_submit_button() throws Throwable {
		driver.findElement(By.cssSelector("input[value='SUBMIT']")).click();
	}

	@Then("^The information should be successfully submitted via contact us form$")
	public void the_information_should_be_successfully_submitted_via_contact_us_form() throws Throwable {
		System.out.println("the_information_should_be_successfully_submitted_via_contact_us_form");
	}

}
