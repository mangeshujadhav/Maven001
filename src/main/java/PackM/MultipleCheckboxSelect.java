package PackM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleCheckboxSelect {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
	
		List<WebElement> ele = driver.findElements(By.xpath("//*[@type=\"checkbox\"and contains(@id,\"day\")]"));

		System.out.println(ele.size());
		
	//1st logic using for loop
		
		for (int i = 0; i < 3; i++) {
			ele.get(i).click();
			System.out.println(i);
		}
	/*	
		// 2d logic using for each loop
		for (WebElement option : ele) {

			option.click();}   */
		
		
		/*   //3rd multiple Select as per your choice
		
		for (WebElement chbox : ele) {

                  String chboxnname = chbox.getAttribute("id");
			
			if (chboxnname.equals("tuesday") || chboxnname.equals("sunday")) 
			{
				
				chbox.click();
			}                          */
		
		///4th last 2 or 3 click
		
	/*for(int i=0;i<ele.size();i+=2) {
			
		ele.get(i).click();
		
		}*/
		
		
		
		
		
		
		
		

	}

}
