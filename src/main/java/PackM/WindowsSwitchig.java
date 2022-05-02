package PackM;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsSwitchig {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("https://developer.android.com/"); // --------WD1
		driver.manage().window().maximize();

		WebElement webe = driver.findElement(By.xpath("//*[@target=\"_blank\"]")); // --------WD2
		webe.click();
		
		Set<String> setclss = driver.getWindowHandles();
		// 1.st method

		/*
		 Iterator<String> itr =setclss.iterator();
		   String parentW = itr.next(); 
		   String childW = itr.next(); 
		    
		   System.out.println(parentW); 
		   System.out.println(childW);
		 */
		// 2nd method
		List<String> listarray = new ArrayList(setclss);

		String parentW2 = listarray.get(0);
		String childW2 = listarray.get(1);
		System.out.println(parentW2);
		System.out.println(childW2);

		driver.switchTo().window(parentW2);
		System.out.println("1st Windows Title =" + driver.getTitle());

		driver.switchTo().window(childW2);
		System.out.println("2nd Windows Title =" + driver.getTitle());

		for (String option : listarray) {

			String Title = driver.switchTo().window(option).getTitle();

			if (Title.equalsIgnoreCase("Android Developers") || Title.equalsIgnoreCase("Google Play Console | Google Play Console")) {
				
				driver.close();
			}
		}

	}

}
