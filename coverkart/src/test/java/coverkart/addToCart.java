package coverkart;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseclass.baseclass;
import locaters.xpath;

public class addToCart extends baseclass {
	xpath xpath=new xpath();
	 @Test
	    public void iP15plusBlack() throws InterruptedException, IOException {
		 
		 driver.findElement(By.xpath(xpath.Catalog)).click();
		 driver.findElement(By.xpath(xpath.iP15plusBlack)).click(); Thread.sleep(2000);
		 driver.findElement(By.xpath(xpath.checkout)).click();
		 driver.findElement(By.xpath(xpath.content)).isDisplayed();
		  
	    }
	 @Test
	    public void iP15plusGrey() throws InterruptedException {
		
		 driver.findElement(By.xpath(xpath.Catalog)).click();
		 driver.findElement(By.xpath(xpath.iP15plusGrey)).click(); Thread.sleep(2000);
		 driver.findElement(By.xpath(xpath.checkout)).click();Thread.sleep(500);
		 driver.findElement(By.xpath(xpath.content)).isDisplayed();

	    }

}
 