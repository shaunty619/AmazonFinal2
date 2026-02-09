package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
    public static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
        
            String path = System.getProperty("user.dir") + "/test-output/ExtentReport.html";
            ExtentSparkReporter spark = new ExtentSparkReporter(path);
            
            spark.config().setTheme(Theme.STANDARD);
            spark.config().setDocumentTitle("Amazon Automation Results");
            spark.config().setReportName("Full Regression Report");

            extent = new ExtentReports();
            extent.attachReporter(spark);
            extent.setSystemInfo("Project", "Amazon POM");
            extent.setSystemInfo("OS", System.getProperty("os.name"));
        }
        return extent;
    }
}
