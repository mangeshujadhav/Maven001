package PackM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocationAndSize {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		WebElement ele = driver.findElement(By.xpath("//*[@alt=\"Google\"]"));

		// Find location Method 01
		System.out.println("Location of logo (X,Y)=" + ele.getLocation());
		System.out.println("Location of logo (X)=" + ele.getLocation().getX());
		System.out.println("Location of logo (Y)=" + ele.getLocation().getY());

		// Find location Method 02

		System.out.println("Location of logo (X)= " + ele.getRect().getX());
		System.out.println("Location of logo (Y)= " + ele.getRect().getY());

		// Find size of element/logo

		// method 01

		System.out.println("Size of logo(width,Height)=" + ele.getSize());
		System.out.println("Size of logo(width)=" + ele.getSize().getWidth());
		System.out.println("Size of logo(Height)=" + ele.getSize().getHeight());

		// method 02
		System.out.println(" Size of logo(width)=" + ele.getRect().getDimension().getWidth());
		System.out.println(" Size of logo(height)=" + ele.getRect().getDimension().getHeight());

	}

}
