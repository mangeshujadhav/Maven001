package PackM;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	private static final String FileUtil = null;

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); // screenshot01
		FileUtils.copyFile(src1, new File("E:\\Screenshot333.jpeg"));

		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("selenium");

		File src2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);// screenshot02
		FileUtils.copyFile(src2, new File("E:\\Screennshot123.jpeg"));

		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@class=\"jmjoTe\"]/tbody/tr[2]/td/div/h3/a")).click();
        
		File src3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);// screenshot03
		FileUtils.copyFile(src3, new File("E:\\Screennshot124.jpeg"));

	}

}
