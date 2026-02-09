package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import browser.Browser;
import listeners.TestListener;
import locators.CartpageObject;

public class Cartpage extends Browser{
	
	public static void cartadd() {
		TestListener.logStep("Page Action: Applying category and price filters");
		wait.until(ExpectedConditions.visibilityOf(CartpageObject.cartselect()));
		WebElement clickcart=CartpageObject.cartselect();
		clickcart.click();
		
	}
	public static void cartprice() {
		TestListener.logStep("Page Action: Verifying the total price in the cart");
		wait.until(ExpectedConditions.visibilityOf(CartpageObject.price()));
		WebElement clickprice=CartpageObject.price();
		System.out.println(clickprice.getText());
	}

}
