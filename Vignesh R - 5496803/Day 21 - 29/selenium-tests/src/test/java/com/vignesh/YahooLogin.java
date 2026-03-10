package com.vignesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.io.IOException;

public class YahooLogin {
    public static void main(String[] args) {
        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();

            // 1. Go to Yahoo login page
            driver.get("https://login.yahoo.com/");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

            // 2. Enter email
            WebElement emailField = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("login-username"))
            );
            emailField.sendKeys("rvignesh2411@gmail.com");  // your email

            // 3. Click Next
            driver.findElement(By.id("login-signin")).click();

            // 4. Enter password
            WebElement passwordField = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("login-passwd"))
            );
            passwordField.sendKeys("#Vicky2003");           // your password

            // 5. Click Sign in
            driver.findElement(By.id("login-signin")).click();

            // 6. Check if a verification code screen appears (common with Yahoo)
            try {
                // Wait up to 5 seconds for a verification code input field
                WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(60));
                WebElement verifyField = shortWait.until(
                    ExpectedConditions.presenceOfElementLocated(
                        By.cssSelector("input[name='verifyCode'], #verification-code-field")
                    )
                );
                // If we reach here, verification is required
                System.out.println("🔐 Verification code requested. Please enter it in the browser now.");
                System.out.println("After entering the code, press Enter in this console to continue...");
                System.in.read();  // wait for user to press Enter after manual entry
            } catch (Exception e) {
                // No verification prompt – login likely succeeded
                System.out.println("✅ Login successful (no verification).");
            }

            // 7. Keep browser open until you press Enter
            System.out.println("✅ You are logged in. Press Enter in the console to close the browser...");
            System.in.read();

        } catch (IOException e) {
            System.out.println("Input error: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
            System.out.println("Browser closed.");
        }
    }
}
