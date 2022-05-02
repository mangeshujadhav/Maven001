package PackM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Uploadingfile {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.monsterindia.com/");

		driver.manage().window().maximize();

		driver.findElement(
				By.xpath("//*[@id=\"user-signup-actions\"]/div/div/a[@title=\"Click to upload your resume\"]")).click();
		WebElement ele = driver.findElement(By.xpath(
				"/html/body/div[3]/section[1]/div/div/div/div[2]/div/div[2]/div[2]/div[1]/div[1]/div[2]/div/div/section/div/form/div[1]/div[1]/div/div/input[1]"));
Thread.sleep(3000);

JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].click();",ele);
		
		ele.sendKeys("Downloads\\radhakishan (1)");
		
		
	}

}
