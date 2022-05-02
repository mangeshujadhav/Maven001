package PackM;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PermissionnPopupNotification {

	public static void main(String[] args) throws InterruptedException, Throwable {
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications") ;   // permition popup
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver(options);
		Thread.sleep(3000);
	
		driver.get("https://www.redbus.in/");	
		
		
		
		
		
		// 01 Screenshot of whole page
		
		/*TakesScreenshot ts = driver;
		 File src =ts.getScreenshotAs(OutputType.FILE);
	   //File trg = new File(".\\screenshots\\homepage.png");
	     FileUtils.copyFile(src, new File("E:\\Screennshot100.jpeg"));*/
		
		// 02 Screenshot of perticular portion / element(logo) of  page
		
		WebElement ele =driver.findElement(By.xpath("//*[@class=\"clearfix dib promotions-wrap link-blocks gtm-promotions-trigger\"]"));
		
		File src = ele.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("E:\\Screennshot102.jpeg"));
		
		

	}

}
