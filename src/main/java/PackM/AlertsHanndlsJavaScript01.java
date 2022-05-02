package PackM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsHanndlsJavaScript01 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();

//1. Alerts Window with ok button
		driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();

		driver.switchTo().alert().accept();

// 2. Alerts Window with ok and cancel button

		driver.findElement(By.xpath("//*[@onclick=\"jsConfirm()\"]")).click();
		// driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();

//3. Alert Window with input Box and print the text msg.

		driver.findElement(By.xpath("//*[@onclick=\"jsPrompt()\"]")).click();

		Alert alretmsgbox = driver.switchTo().alert();
		System.out.println(alretmsgbox.getText());
		alretmsgbox.sendKeys("Welcome");
		alretmsgbox.accept();
		// alretmsgbox.dismiss();

	}

}
