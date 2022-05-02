package PackM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import dev.failsafe.internal.util.Durations;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MousehoverAction {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/");
		
       driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		
		
		WebElement comp = driver.findElement(By.linkText("Components"));
	
		WebElement prit = driver.findElement(By.linkText("Printers (0)"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(comp).moveToElement(prit).click().build().perform();
		
		
		
		
		
		
	}

}
