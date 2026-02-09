package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import browser.Browser;

public class CartpageObject {
	
	public static WebElement cartselect() {
		return Browser.driver.findElement(By.xpath("//div[@id=\"nav-cart-count-container\"]"));
	}
	public static WebElement price() {
		return Browser.driver.findElement(By.xpath("//span[@id=\"sc-subtotal-amount-buybox\"]"));
	}

}
