package locators;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import browser.Browser;

public class FilterpageObject extends Browser{
	
	//static By addCartEle = By.xpath("//input[@id='add-to-cart-button']");
	//static By mainContainer = By.xpath("//span[@class='a-price-whole']");
			
	public static WebElement addCart() {
		return driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	}
	
//	public static WebElement mainCont() {
//		return driver.findElement(mainContainer);
//	}

			
}
