package StepDefination;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import baseclass.baseclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployee extends baseclass {
	

	
	@When("Click PIM option on dashboard")
	public void click_pim_option_on_dashboard() throws InterruptedException {
	 driver.findElement(By.xpath(xpath.ClickPIMOptionOnDashboard)).click(); 
	 Thread.sleep(1000);
	}

	@When("Click Add Employee button")
	public void click_add_employee_button() throws InterruptedException {
	driver.findElement(By.xpath(xpath.clickAddEmployeebutton_PIM)).click();  
	Thread.sleep(1000);
	}

	@When("Enter First name")
	public void enter_first_name() {
	driver.findElement(By.xpath(xpath.FirstName_addEmployee)).sendKeys("Roshan");   
	}

	@When("Enter Middle name")
	public void enter_middle_name() {
	driver.findElement(By.xpath(xpath.MiddleName_addEmployee)).sendKeys("Gorakh");      
	}

	@When("Enter last name")
	public void enter_last_name() {
	driver.findElement(By.xpath(xpath.LastName_addEmployee)).sendKeys("Jadhav");     
	}

	@When("Click login details")
	public void click_login_details() {
	driver.findElement(By.xpath(xpath.LoginDetails_addEmployee)).click();  
	}

	@When("Enter username")
	public void enter_username() throws InterruptedException {
	driver.findElement(By.xpath(xpath.userName_addEmployee)).sendKeys("TJTushar"+ RandomNO);
	
	}

	@When("Enter password")
	public void enter_password() throws InterruptedException {
		driver.findElement(By.xpath(xpath.Passward_addEmployee)).sendKeys("TJTushar123"); 
		Thread.sleep(500);
	}
	@When("Enter confirm password_addEmployee")
	public void Enter_confirm_password_addEmployee() throws InterruptedException {
		driver.findElement(By.xpath(xpath.ConfirmPassword_addEmployee)).sendKeys("TJTushar123"); 
		Thread.sleep(500);
	}

	@When("Click save button on add employee form")
	public void click_save_button_on_add_employee_form() throws InterruptedException {
		driver.findElement(By.xpath(xpath.Savebutton_addEmployee)).click();
		Thread.sleep(500);
	}

	@Then("sucess message should be appear")
	public void sucess_message_should_be_appear() {
	   
	}

	@Then("new employee should be added")
	public void new_employee_should_be_added() throws InterruptedException, IOException {
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a")).click();Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("Roshan"); Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click(); Thread.sleep(1000);   
   
    	String FirstName= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[3]/div")).getText();
        String LastName= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[4]/div")).getText(); 
        String fname = "Roshan Gorakh";
        String lname = "Jadhav";
        Assert.assertEquals(FirstName, fname);
        Assert.assertEquals(LastName, lname);
        System.out.println("Pass");
        baseclass.quit();
    	
    
	}

	
}
