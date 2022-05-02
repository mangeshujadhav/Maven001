package PackM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mavenclas001 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		WebElement ele = driver.findElement(By.id("email"));
		ele.sendKeys("mangeshujadhav333@gmail.com");
        
		System.out.println(ele.getAttribute("class")); // Find attribute value of an atteribute
		System.out.println(ele.getAttribute("autofocus"));
		System.out.println(ele.getAttribute("aria-label"));
		System.out.println(ele.getAttribute("value"));
		ele.getText(); // getText method is used for inner text e.g. LOGING button of facebook

		WebElement title = driver.findElement(By.xpath("//*[@class=\"_8eso\"]"));
		System.out.println(title.getText());
		System.out.println(title.getAttribute("class"));
	}

}
