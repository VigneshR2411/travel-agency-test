package loginTest;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.util.RetryAnalyzerCount;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;

@Listeners(com.example.tests.TestListener.class)  // attach screenshot listener
public class LoginTest {

    WebDriver driver;

    @BeforeClass
    public void setupClass() {
        System.out.println("Global setup: loading configuration...");
        // You can load property files, etc. here
    }

    @BeforeMethod
    public void setupMethod() {
        // Use WebDriverManager to handle driver binary
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        // Run in headless mode (remove if you want to see the browser)
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");  
    }

    @AfterMethod
    public void teardownMethod() {
        if (driver != null) {
            driver.quit();
        }
    }

    @AfterClass
    public void teardownClass() {
        System.out.println("Global teardown: done.");
    }

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][]{
            {"valid_user@example.com", "validPass", true, "Dashboard"},
            {"valid_user@example.com", "wrongPass", false, "Invalid credentials"},
            {"wrong@example.com",      "validPass", false, "Invalid credentials"},
            {"",                       "",          false, "Email is required"}
        };
    }

    @Test(dataProvider = "loginData", retryAnalyzer = RetryAnalyzerCount.class)
    public void testLogin(String username, String password, boolean expectedSuccess, String expectedMessage) {
        // Fill login form – CHANGE LOCATORS TO MATCH YOUR APP
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("loginBtn")).click();

        if (expectedSuccess) {
            // Wait for dashboard – for example, check URL contains "dashboard"
            String currentUrl = driver.getCurrentUrl();
            Assert.assertTrue(currentUrl.contains("dashboard"),
                "Expected dashboard URL, but got: " + currentUrl);
        } else {
            // Check error message
            String actualError = driver.findElement(By.className("error-message")).getText();
            Assert.assertTrue(actualError.contains(expectedMessage),
                "Expected error containing '" + expectedMessage + "', but got: '" + actualError + "'");
        }
    }

    // Helper method to take screenshot
    public void takeScreenshot(String testName) {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String path = "screenshots/" + testName + "_" + timestamp + ".png";
        try {
            FileUtils.copyFile(screenshot, new File(path));
            System.out.println("Screenshot saved: " + path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}