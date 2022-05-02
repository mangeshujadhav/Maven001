package PackM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Class {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://brand.linkedin.com/policies?trk=seo-authwall-base_footer-brand-policy");

		driver.manage().window().maximize();

		Actions actcls = new Actions(driver);

		WebElement Webele2 = driver.findElement(By.linkText("Join our team"));

		actcls.moveToElement(Webele2).contextClick().build().perform();

		WebElement Webele3 = driver.findElement(By.xpath("//*[@class=\"banner-headline headline-66\"]"));

		actcls.moveToElement(Webele3).doubleClick().build().perform();
		
		WebElement WEB = driver.findElement(By.linkText("downloaded for use"));

		actcls.moveToElement(WEB).doubleClick(WEB).click().perform();

		driver.navigate().to("https://www.google.co.in/");
		
		WebElement WEB2 = driver.findElement(By.xpath("//*[@title=\"Search\"]"));
		WEB2.click();
		actcls.moveToElement(WEB2).keyDown(Keys.SHIFT).sendKeys("har har").keyUp(Keys.SHIFT)
		.sendKeys(" Mahadev").sendKeys(Keys.RETURN).sendKeys(Keys.ENTER).build().perform();
	
	}

}
