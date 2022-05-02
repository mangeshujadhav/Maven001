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

public class Windowshandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://brand.linkedin.com/policies?trk=seo-authwall-base_footer-brand-policy");
		driver.manage().window().maximize();
		// System.out.println(driver.getWindowHandle());
		// //CDwindow-52FECC2E3ECD0A738D974A8843DB3731
		driver.findElement(By.linkText("Join our team")).click();

		// driver.findElement(By.partialLinkText("Join")).click();
		// driver.findElement(By.xpath("//*[@title=\"Join our team\"]"));

		// System.out.println(driver.getWindowHandles());
		// //[CDwindow-52FECC2E3ECD0A738D974A8843DB3731,
		// CDwindow-4DBF71F26B4BB100F23F990EE9287C69]

		Set<String> windIds = driver.getWindowHandles();

		// 1 iterator method

		
	/*  Iterator<String>itr = windIds.iterator();
		  
		  String parentwidn =itr.next();
		  
		  String childtwidn =itr.next();
		  
		  System.out.println("paret window id "+parentwidn); //paret window id  CDwindow-52FECC2E3ECD0A738D974A8843DB3731
		  
		  System.out.println("child widow id "+childtwidn); //child widow id  CDwindow-4DBF71F26B4BB100F23F990EE9287C69
	*/	 
		  

		// 2 Using List/Array list

		List<String> listarray = new ArrayList(windIds); // converting set collection --> List collection
		
/*       String parent2 = listarray.get(0);
		String child2 = listarray.get(1);

		System.out.println("parent id="+listarray);
		System.out.println("child id= "+child2);
    
		  
		 // Q How use windows id for swithing 
		  driver.switchTo().window(parentwidn);
		  
		  System.out.println("parent window title="+driver.getTitle());
		  
		  driver.switchTo().window(childtwidn);
		  
		  System.out.println("child window title="+driver.getTitle());
		  
		  */
		   
		/*  for(String option :listarray) {                      // find the title and id also
			  
			  //System.out.println(option);
			  String Title = driver.switchTo().window(option).getTitle();
			  
			  System.out.println(Title);
		  }
		  */
		  // Q How to close as per your Choice window?
		  
			for (String option1 : listarray) {

				String Title = driver.switchTo().window(option1).getTitle();
				//System.out.println(Title);
				Thread.sleep(3000);
				if (Title.equalsIgnoreCase("LinkedIn Brand Guidelines | Policies")
						|| Title.contains("Jobs in United States")) {

					driver.close();

			  }
		  }
		  
		    
		  
	}

}
