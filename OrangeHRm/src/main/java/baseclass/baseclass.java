package baseclass;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import locaters.xpath;

public class baseclass {
    public static WebDriver driver;
    public static xpath xpath = new xpath();
    public Random  random= new Random ();
    public int RandomNO = random.nextInt(1000);
    static String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    
    public static void launch() {
        ChromeOptions options = new ChromeOptions();
        // Add any Chrome options here if needed
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(URL);
    }

    public static void quit() throws IOException {
//    	formattedTime
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss"); 
        String formattedTime = currentTime.format(formatter);
 
        // Full Screenshot
        TakesScreenshot screenshot1 = (TakesScreenshot) driver;
        File src2 = screenshot1.getScreenshotAs(OutputType.FILE);
        File dest2 = new File("E:\\abc\\OrangeHRm\\ScreenShot\\Tushar\\screenshot_" + formattedTime + ".png");
        FileUtils.copyFile(src2, dest2);
        // quit Chrome
        driver.quit();
    }
    }
    
