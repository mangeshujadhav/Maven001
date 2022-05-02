package PackM;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWait2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Waiting 9 seconds for an element to be present on the page, checking
		// for its presence once every 3 seconds.
		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("selenium");
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys(Keys.RETURN);

		WebElement wwbbbee = mywait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//*[@class=\"jmjoTe\"]/tbody/tr[2]/td/div/h3/a"));
			}
		});
		
		wwbbbee.click();

	}
}
