package StepDefination;

import java.io.IOException;
import org.openqa.selenium.By;
import baseclass.baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginPage extends baseclass{
	
	@Given("open to URL")
	public void open_to_url() throws InterruptedException {
		baseclass.launch();
		Thread.sleep(2000);
	}

	@When("Enter valid Email")
	public void enter_valid_email() throws InterruptedException {
		 driver.findElement(By.xpath(xpath.loginemail)).sendKeys("Admin");
		 
	}

	@When("Enter valid Password")
	public void enter_valid_password() throws InterruptedException {
		 driver.findElement(By.xpath(xpath.loginpassword)).sendKeys("admin123");
		
	}

	@When("Enter Invalid Email")
	public void enter_invalid_email() throws InterruptedException {
		driver.findElement(By.xpath(xpath.loginemail)).sendKeys("Admintj");
		
	}

	@When("Enter Invalid Password")
	public void enter_invalid_password() throws InterruptedException {
		 driver.findElement(By.xpath(xpath.loginpassword)).sendKeys("Admin12345");
		
	}

	@When("Click on login button")
	public void click_on_login_button() throws InterruptedException {
		driver.findElement(By.xpath(xpath.loginbutton)).click();
		Thread.sleep(2000);
	}

	@Then("Dasshboard page should be displayed")
	public void dasshboard_page_should_be_displayed() throws IOException {
	  driver.findElement(By.xpath(xpath.dashboard)).isDisplayed();
	  baseclass.quit();
	 
	  
	}

	
	@Then("Invalid Credentials message should be displayed")
	public void invalid_credentials_message_should_be_displayed() throws IOException {
		driver.findElement(By.xpath(xpath.InvalidCredentials)).isDisplayed();
		 baseclass.quit();
		 
	}

	@Then("Required message should be displayed")
	public void required_message_should_be_displayed() throws IOException {
	    driver.findElement(By.xpath(xpath.Required)).isDisplayed();
	    baseclass.quit();
	  
	}
	

}
 