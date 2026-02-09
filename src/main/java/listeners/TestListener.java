 package listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import browser.Browser;
import utils.ExtentManager;

public class TestListener implements ITestListener {
    private static ExtentReports extent = ExtentManager.getInstance();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
   
    public static void logStep(String message) {
        if (test.get() != null) {
            test.get().log(Status.INFO, message);
        }
    }

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
        test.set(extentTest);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.get().pass("Test Finished Successfully");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.get().fail("Execution Failed: " + result.getThrowable());
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
//    @Override
//    public void onTestFailure(ITestResult result) {
//        test.get().fail("Test Case Failed: " + result.getName());
//        test.get().fail(result.getThrowable());
//
//        try {
//            // 1. Capture the screenshot
//            String imgPath = Browser.getScreenshot(result.getName());
//            
//            // 2. Attach it to the report
//            test.get().addScreenCaptureFromPath(imgPath);
////            
//        } catch (IOException e) {
//            test.get().info("Failed to capture screenshot: " + e.getMessage());
//        }
//    }
}
