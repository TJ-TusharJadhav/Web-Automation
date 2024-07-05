package StepDefination;

import org.openqa.selenium.By;

import baseclass.baseclass;
import io.cucumber.java.en.When;

public class add_employee_personal_Details extends baseclass {

	@When("Search Employee name")
	public void search_employee_name() {
	 driver.findElement(By.xpath(xpath.Enter_Employee_name_EmployeeInformation)).sendKeys("Roshan Gorakh Jadhav");  
	}

	@When("click search button on employee information")
	public void click_search_button_on_employee_information() throws InterruptedException {
	 driver.findElement(By.xpath(xpath.searchbutton_name_EmployeeInformation)).click(); 
	 Thread.sleep(2000);
	}

	@When("click edit icon")
	public void click_edit_icon() throws InterruptedException {
	driver.findElement(By.xpath(xpath.Click_Edit_icon_EmployeeInformation)).click();
	Thread.sleep(3000);
	}

	@When("Enter Other ID")
	public void enter_other_id() {
		driver.findElement(By.xpath(xpath.Other_Id)).sendKeys("abc123");      
	}

	@When("Enter Driver license numbers")
	public void enter_driver_license_numbers() {
		driver.findElement(By.xpath(xpath.Drivers_License_Number)).sendKeys("1234567890");     
	}

	@When("Select license Expiry date")
	public void select_license_expiry_date() {
	    
	}

	@When("Select nationality")
	public void select_nationality() {
	    
	}

	@When("Select marital status")
	public void select_marital_status() throws InterruptedException {
		 
	}

	@When("Select DOB")
	public void select_dob() {
	   
	}

	@When("Select gender")
	public void select_gender() {
	driver.findElement(By.xpath(xpath.Gender_male)).click(); 
	}

	@When("click save button on personal details")
	public void click_save_button_on_personal_details() {
//		driver.findElement(By.xpath(xpath.saveButton_personalDetails)).click();    
	}
}
