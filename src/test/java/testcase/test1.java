package testcase;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import ScreenShot.capture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import browser.Browser;
import pages.Cartpage;
import pages.Filterpage;
import pages.Searchpage;
import pages.loginpage;
import utils.ExtentManager;
import listeners.TestListener;

@Listeners(listeners.TestListener.class)
public class test1 {

	


	
	@Test
    public void init() throws Exception {
//    	ExtentTest extentTest;
//    	ExtentReports extentReports = null;
//    	extentTest = extentReports.createTest("amazonreport");
        TestListener.logStep("Opening Browser and navigating to Amazon");
        Browser.openBrowser();
        Browser.navigate("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
        
        //Browser.driver.wait(ExpectedConditions(Browser.driver.findElement(By.xpath(""))));
    //Thread.sleep(3000);
        capture.screenShot("HomePage");
        
        TestListener.logStep("Navigating to Login Page Link");
//        extentTest.info("Home Page");
//        extentTest.addScreenCaptureFromPath("../ScreenShot.png");
        capture.screenShot("Login Page");
        loginpage.link();
       

        TestListener.logStep("Entering product name in Search Bar");
        capture.screenShot("Searchbar");
        Searchpage.searchbar();
        
        TestListener.logStep("Applying Category Filters");
        
        Filterpage.filter();
        
        TestListener.logStep("Adding item to Cart");
        Cartpage.cartadd();
        
        TestListener.logStep("Verifying Cart Price");
        capture.screenShot("Cart");
        Cartpage.cartprice();
        
//        TestListener.logStep("All page tasks completed successfully.");
//        Browser.closeBrowser();
    }
}





