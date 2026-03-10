package utils;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import tests.BaseTest;
import java.io.File;
import java.io.IOException;

public class ExtentReportNG implements ITestListener {
    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

    public static ExtentTest getTest() {
        return extentTest.get();
    }

    @Override
    public void onStart(ITestContext context) {
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("test-output/ExtentReport.html");
        sparkReporter.config().setReportName("Flight Booking Report");
        sparkReporter.config().setDocumentTitle("Automation Report");

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        extent.setSystemInfo("OS", System.getProperty("os.name"));
        extent.setSystemInfo("Java Version", System.getProperty("java.version"));
        System.out.println("Report initialized");
        
        // Create screenshots directory if it doesn't exist
        new File("test-output/screenshots").mkdirs();
    }

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest test = extent.createTest(result.getMethod().getMethodName());
        extentTest.set(test);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        getTest().log(Status.PASS, "Test passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // Log failure
        getTest().log(Status.FAIL, "Test failed: " + result.getThrowable());

        // Capture screenshot
        WebDriver driver = BaseTest.getDriver();  // get driver from base class
        if (driver != null) {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);
            String dest = System.getProperty("user.dir") + "/test-output/screenshots/" 
                          + result.getMethod().getMethodName() + "_" 
                          + System.currentTimeMillis() + ".png";
            try {
                FileUtils.copyFile(src, new File(dest));
                // Attach screenshot to report (relative path works because report is in test-output)
                getTest().addScreenCaptureFromPath("screenshots/" + new File(dest).getName());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        getTest().log(Status.SKIP, "Test skipped: " + result.getThrowable());
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
        System.out.println("Report generated at test-output/ExtentReport.html");
    }
}

