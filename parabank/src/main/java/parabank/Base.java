package parabank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	
	public static WebDriver driver ;
	
	public static  void launch() {
		try {
			driver	= new ChromeDriver();
			driver.manage().window().maximize();
//			driver.get("https://parabank.parasoft.com/parabank/index.htm");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
