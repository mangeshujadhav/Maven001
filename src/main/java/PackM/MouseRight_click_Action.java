package PackM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseRight_click_Action {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("https://swisnl.github.io/jQuery-contextMenu//demo/input.html");

		WebElement rightclk = driver.findElement(By.xpath("//*[@class=\"context-menu-one btn btn-neutral\"]"));

		Actions act = new Actions(driver);

		act.contextClick(rightclk).perform(); // For right Click
		
		
		
		
		
		
		
		//------------------------------------------------------------------------------
		
		//Find no.of links on web page

		List<WebElement> alllinksfind = driver.findElements(By.tagName("a"));

		System.out.println("No. of links on this page = " + alllinksfind.size());  

		for (WebElement option : alllinksfind) {
			
			System.out.println(option.getText());
			
			System.out.println(option.getAttribute("href"));

		}

	}
}
