package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import baseclass.baseclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddUser extends baseclass {
 
@When("Click Admin option on dashboard")
public void click_admin_option_on_dashboard() {
driver.findElement(By.xpath(xpath.ClickAdminOptionOnDashboard)).click(); 
}

@When("Click Add button")
public void click_add_button() throws InterruptedException {
	Thread.sleep(1000);
driver.findElement(By.xpath(xpath.ClickAddButtonOnAdminpage)).click();   
}

@When("Select User role")
public void select_user_role() throws InterruptedException {
	Thread.sleep(1000);
	Select role = new Select(driver.findElement(By.xpath(xpath.UserRole)));
	role.selectByIndex(1);  
}

@When("Select Status")
public void select_status() {
	Select Status = new Select(driver.findElement(By.xpath(xpath.Status)));
	Status.selectByVisibleText("Enabled");   
}

@When("Enter new password")
public void enter_new_password() throws InterruptedException {
	Thread.sleep(1000);
driver.findElement(By.xpath(xpath.Password)).sendKeys("Nancy@123");   
}

@When("Enter confirm password")
public void enter_confirm_password() {
	driver.findElement(By.xpath(xpath.ConfirmPassword)).sendKeys("Nancy@123");       
}

@When("Enter UserName")
public void enter_user_name() {
	driver.findElement(By.xpath(xpath.Username)).sendKeys("NancyPatel");      
}

@When("Enter Employee Name")
public void enter_employee_name() {
	driver.findElement(By.xpath(xpath.EmployeeName)).sendKeys("Nancy Patel");    
}

@When("Click Save button")
public void click_save_button() {
	driver.findElement(By.xpath(xpath.Savebutton)).click();      
}

@Then("New user should be save/add")
public void new_user_should_be_save_add() {
    
}

@When("Click Cancel button")
public void click_cancel_button() {
	driver.findElement(By.xpath(xpath.CancelButton)).click();   
}

@Then("New user should not be save/add")
public void new_user_should_not_be_save_add() {
    
}
}
