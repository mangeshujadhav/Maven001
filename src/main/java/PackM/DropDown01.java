package PackM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DropDown01 {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement webele =driver.findElement(By.id("input-country"));
		
		Select scls=new Select(webele);
		
		//scls.selectByVisibleText("Cuba");  ///1 method
		//scls.selectByValue("30");       //Brazil 2nd method
		//scls.selectByIndex(13);          //Australia 3rd method
		
		//without using any method salect drop down by own logic
		
		List<WebElement> Alloptions =scls.getOptions();
		
		for(WebElement option:Alloptions) {
			if(option.getText().equalsIgnoreCase("Brazil")) {
				option.click();
				break;
				
			}
		}
		
		
		
		
	}

}
