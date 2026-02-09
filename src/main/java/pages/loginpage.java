package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import browser.Browser;
import listeners.TestListener;
import locators.loginpageobject;

public class loginpage extends Browser {
	
	public static void link() {
		TestListener.logStep("Page Action: Clicking on the Login/Sign-in link");
		wait.until(ExpectedConditions.visibilityOf(loginpageobject.wait1()));
		loginpageobject.clickable1().click();
		wait.until(ExpectedConditions.visibilityOf(loginpageobject.findlogin()));
		loginpageobject.id().sendKeys("8475987858");
		loginpageobject.clickable2().click();
		wait.until(ExpectedConditions.visibilityOf(loginpageobject.findpassword()));
		loginpageobject.password().sendKeys("Shaunty@123");
		loginpageobject.clickable3().click();
		
		
	}

}
