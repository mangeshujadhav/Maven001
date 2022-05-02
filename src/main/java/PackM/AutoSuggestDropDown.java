package PackM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		                                                               //AutoSuggestdropdown
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@title=\"Search\"]")).sendKeys("mahadev");
		
		Thread.sleep(3000);
	
		
		List<WebElement> multi = driver.findElements(By.xpath("//*[@class=\"eIPGRd\"]//div[@class=\"wM6W7d\"]/span"));
	
		System.out.println(multi.size());
		
		
		for (WebElement single : multi) {
			
			if (single.getText().contains("wallpaper")) {
				
				single.click();
				break;
			}

		}

	}

}
