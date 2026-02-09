package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import browser.Browser;

public class loginpageobject {
//	public static WebDriver driver;
	public static WebElement findlogin() {
		return Browser.driver.findElement(By.xpath("//div[@class='a-section a-spacing-medium']"));
		
	}public static WebElement findpassword() {
		return Browser.driver.findElement(By.xpath("//i[@class='a-icon a-icon-logo']"));
		
	}
	public static WebElement wait1() {
		return Browser.driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	}
	public static WebElement clickable1() {
		return Browser.driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	}
	public static WebElement id() {
		return Browser.driver.findElement(By.xpath("//input[@id='ap_email_login']"));
	}
	public static WebElement clickable2() {
		return Browser.driver.findElement(By.xpath("//input[@class='a-button-input']"));
	}
	public static WebElement password() {
		return Browser.driver.findElement(By.xpath("//input[@id='ap_password']"));
	}
	public static WebElement clickable3() {
		return Browser.driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	}

}
