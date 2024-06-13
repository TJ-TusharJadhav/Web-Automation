package stepdefination;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import parabank.Base;

import org.openqa.selenium.chrome.ChromeDriver;
public class Login  extends Base
{
	
	
	@Given("open website")
	 public void open_website(){
		Base.launch();
	 }
	
	 @When("^user enters the email as (.+)$")
	    public void user_enters_the_email_as(String abc){
		 driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys(abc);	
	    }
	    @And("^user enters the password as (.+)$")
	    public void user_enters_the_password_as(String abc) {
	     driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys(abc);		
	    
	    }
	    @And("user click on login button")
	    public void user_click_on_login_button(){
	     driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click(); 
		 }
	    
	   @Then("user name should be displayed")
	    public void user_name_should_be_displayed() throws InterruptedException  {
		   Thread.sleep(1000);
	    try {
	    	String tj ="//*[@id=\"leftPanel\"]/p";
	    	
	    	System.out.println(driver.findElement(By.xpath(tj)).getText());
	    	Assert.assertTrue(driver.findElement(By.xpath(tj)).isDisplayed());
	    	System.out.println("pass");
	    }catch (Exception q) {
	    	System.out.println("Fail");
	    }
//	    driver.quit();
	    	
	   
	    }
}
