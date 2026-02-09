package browser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Browser {
		public static WebDriver driver;
		public static WebDriverWait wait;
		
		public static void openBrowser() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		public static void navigate(String title) {
			driver.get("https://www.amazon.in/");
			wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.titleIs(title));
		}
		public static void closeBrowser() {
			driver.quit();
		}
		//r.findElement(By.xpath("//span[@class='nav-line-2 ']")).click();
//		Thread.sleep(3000);
//		driver.close();
		
	
}
