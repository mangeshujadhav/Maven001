package PackM;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDropdown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		//driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.get("https://www.facebook.com/");
		
	//	driver.findElement(By.id("//*[@class=\"_6ltg\"]//a")).click();
		}
	
	void show(int x,String... value) {
		
	}

}
