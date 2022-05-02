package PackM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import dev.failsafe.internal.util.Durations;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActionnDragAndDropIMG {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
       driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@class=\"demo-frame lazyloaded\"]")));
		
		WebElement img01 = driver.findElement(By.xpath("//*[@alt=\"The peaks of High Tatras\"]"));
		WebElement img02 = driver.findElement(By.xpath("//*[@alt=\"Planning the ascent\"]"));
		WebElement target =driver.findElement(By.id("trash"));
		Actions act = new Actions(driver);
		
		act.dragAndDrop(img01, target).perform();// image drag-drop
		act.dragAndDrop(img02, target).perform();
		
		
		
		
		
		
		
		
		
		
		
	}

}
