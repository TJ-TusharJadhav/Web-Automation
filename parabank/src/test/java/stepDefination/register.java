package stepDefination;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.*;
import parabank.Base;

public class register extends  Base{
	//WebDriver driver = new ChromeDriver();
	String s = RandomStringUtils.randomAlphabetic(8); 
//   @Given("open website1")
//	   public void open_website1(){
//		  driver.manage().window().maximize();
//	      driver.get("https://parabank.parasoft.com/parabank/index.htm");	
   


//}
	
		@Given("click register link")
		public void click_register_link() {
		 driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();  
		}

		@When("enter first name")
		public void enter_first_name() {
			driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]")).sendKeys("Tushar");    
		}

		@When("enter last name")
		public void enter_last_name() {
			driver.findElement(By.xpath("//*[@id=\"customer.lastName\"]")).sendKeys("Jadhav");   
		}

		@When("Enter address")
		public void enter_address() {
			driver.findElement(By.xpath("//*[@id=\"customer.address.street\"]")).sendKeys("Home");   
		}

		@When("Enter City")
		public void enter_city() {
			driver.findElement(By.xpath("//*[@id=\"customer.address.city\"]")).sendKeys("Nashik");    
		}

		@When("Enter State")
		public void enter_state() {
			driver.findElement(By.xpath("//*[@id=\"customer.address.state\"]")).sendKeys("Maharatra");   
		}

		@When("Enter zip code")
		public void enter_zip_code() {
			driver.findElement(By.xpath("//*[@id=\"customer.address.zipCode\"]")).sendKeys("422003");   
		}

		@When("Enter phone no")
		public void enter_phone_no() {
			driver.findElement(By.xpath("//*[@id=\"customer.phoneNumber\"]")).sendKeys("8378845340");     
		}

		@When("Enter SSN")
		public void enter_ssn() {
			driver.findElement(By.xpath("//*[@id=\"customer.ssn\"]")).sendKeys("123456"); 
		}

		@When("Enter username")
		public void enter_username() {
//			System.out.print(s);
			driver.findElement(By.xpath("//*[@id=\"customer.username\"]")).sendKeys("Admin");     
		}

		@When("Enter password")
		public void enter_password() {
			driver.findElement(By.xpath("//*[@id=\"customer.password\"]")).sendKeys("admin");     
		}

		@When("Enter confirm")
		public void enter_confirm() {
			driver.findElement(By.xpath("//*[@id=\"repeatedPassword\"]")).sendKeys("admin");    
		}

		@When("click register")
		public void click_register() {
			driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click(); 
		}

		@Then("sucessfully message")
		public void sucessfully_message() throws InterruptedException {
		
				String expected = "Your account was created successfully. You are now logged in.";
				String Actual = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p")).getText();System.out.println(Actual);
				Assert.assertEquals(Actual,expected);
				System.out.println("pass");
			    
			    driver.quit();
		}

	}


