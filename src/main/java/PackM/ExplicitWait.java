package PackM;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		WebDriverWait spewait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("selenium");

		WebElement webe = spewait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name=\"q\"]")));
		webe.sendKeys(Keys.RETURN);
		WebElement web2 = spewait.until(ExpectedConditions.visibilityOfElementLocated(By
	    .xpath("//*[@class=\"jmjoTe\"]/tbody/tr[2]/td/div/h3/a")));

		web2.click();

	}  

}
