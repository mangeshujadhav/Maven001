package PackM;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCookie {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();

		// how to capture cookies from browser?

		Set<Cookie> Coookies = driver.manage().getCookies();

		System.out.println(Coookies.size());

	   // how to print the cookies from browser?

		for (Cookie option : Coookies) { //

			System.out.println(option.getName() + " : " + option.getValue());
		}

		// How to add cookie to browser?  

		Cookie cookieadd = new Cookie("mycoookie333", "123456789101112131415161718");

		driver.manage().addCookie(cookieadd);

		Set<Cookie> newcokkie = driver.manage().getCookies();

		System.out.println(newcokkie.size());
		
		// How to Dlete perticular Cookies
		
        // driver.manage().deleteCookie(cookieadd);  
		
		//driver.manage().deleteCookieNamed("mycoookie333");
		
		driver.manage().deleteAllCookies();
		
		Set<Cookie> cookies1 = driver.manage().getCookies();
		
		System.out.println(cookies1.size());
		
		

	}

}
