package PackM;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindosH001 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://brand.linkedin.com/policies?trk=seo-authwall-base_footer-brand-policy");
		driver.manage().window().maximize();

		driver.findElement(By.linkText("Join our team")).click();

		Set<String> windIds = driver.getWindowHandles();

		// 1 iterator method

		Iterator<String> itr = windIds.iterator();

		String parentwidn = itr.next();

		String childtwidn = itr.next();

		System.out.println("paret window id " + parentwidn); 

		System.out.println("child widow id " + childtwidn); 

		
		driver.switchTo().window(parentwidn);

		System.out.println("parent window title=" + driver.getTitle());

		driver.switchTo().window(childtwidn);

		System.out.println("child window title=" + driver.getTitle());

		List<String> listarray = new ArrayList(windIds);
		
		for (String option1 : listarray) {

			String Title = driver.switchTo().window(option1).getTitle();

			Thread.sleep(3000);
			if (Title.equalsIgnoreCase("LinkedIn Brand Guidelines | Policies")) {

				driver.close();

			}
		}

	}

}
