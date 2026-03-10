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

public class SauceDemoLogin {
    public static void main(String[] args) {
        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // Maximize window
            driver.manage().window().maximize();
            
            // Navigate to the login page
            driver.get("https://www.saucedemo.com/");

            // Wait for elements to be present (optional but good practice)
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Locate username field and enter username
            WebElement usernameField = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("user-name"))
            );
            usernameField.sendKeys("standard_user");

            // Locate password field and enter password
            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("secret_sauce");

            // Locate and click login button
            WebElement loginButton = driver.findElement(By.id("login-button"));
            loginButton.click();

            // Wait for the inventory page to load (successful login redirects to /inventory.html)
            wait.until(ExpectedConditions.urlContains("inventory.html"));

            // Get current URL to confirm login success
            String currentUrl = driver.getCurrentUrl();
            System.out.println("Current URL after login: " + currentUrl);

            if (currentUrl.contains("inventory.html")) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Login failed.");
            }

            // Keep browser open until user presses Enter
            System.out.println("\n Browser will stay open. Press Enter in the console to close...");
            System.in.read();

        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
            System.out.println("Browser closed.");
        }
    }
}
