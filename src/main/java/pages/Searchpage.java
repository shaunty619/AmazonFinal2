package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import browser.Browser;
import listeners.TestListener;
import locators.SearchpageObject;


public class Searchpage extends Browser {
	

	public static void searchbar() {
		TestListener.logStep("Page Action: Entering product name in the search bar");
		wait.until(ExpectedConditions.visibilityOf(SearchpageObject.wait2()));
		WebElement click1=SearchpageObject.findsearchbar();
		click1.sendKeys("moto g85 back cover");
		SearchpageObject.buttonclick().click();
		wait.until(ExpectedConditions.visibilityOf(SearchpageObject.waitsearch()));
		List<WebElement> list = SearchpageObject.productlist();
		for(int i=0;i<list.size();i++) {
			WebElement element= list.get(i);
			//System.out.println(element.getText());
			String s=element.getText();
			wait.until(ExpectedConditions.visibilityOf(element));
			if(s.contains("TheGiftKart Liquid Silicone Back Cover Case for Motorola Moto G85 5G | Soft Micro-Fibre Lining Inside | Camera Protection Bump | Shockproof Back Cover Case for Moto G85 5G (Silicone, Olive Green)"))
			{
				System.out.println("sbdhgjhv");
				wait.until(ExpectedConditions.visibilityOf(element));
				element.click();
			}
		}
	
	}

}
//html/body/div[1]/header/div[1]/div[2]/div/div[2]/div/div[1]/div