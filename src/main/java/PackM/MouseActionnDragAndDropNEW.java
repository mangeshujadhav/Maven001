package PackM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import dev.failsafe.internal.util.Durations;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActionnDragAndDropNEW {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("Droppable")).click();
       
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class=\"demo-frame\"]")));
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@class=\"demo-frame\"]")));
		Actions actcls = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
        WebElement targate =driver.findElement(By.id("droppable"));
		
		//actcls.dragAndDrop(source, targate).perform();
		
        actcls.dragAndDropBy(source, 475, 185).perform(); // for drag-drop
		
		
		
	}

}
