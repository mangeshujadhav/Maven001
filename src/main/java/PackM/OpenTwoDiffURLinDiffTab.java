package PackM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenTwoDiffURLinDiffTab {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		//driver.switchTo().newWindow(WindowType.TAB); //For New Tab 
		
		driver.switchTo().newWindow(WindowType.WINDOW); //for New Window
		
		driver.get("https://demo.opencart.com/"); 
		
		

	}

}
