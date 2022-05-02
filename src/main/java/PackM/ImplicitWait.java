package PackM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("selenium");
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@class=\"jmjoTe\"]/tbody/tr[2]/td/div/h3/a")).click();
		

	}

}
