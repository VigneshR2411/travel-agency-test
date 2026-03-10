package com.vignesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.IOException;

public class GoogleSearchTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.get("https://www.google.com");

            String title = driver.getTitle();
            System.out.println("Google page title: " + title);

            if (title.contains("Google")) {
                System.out.println("Google test passed!");
            } else {
                System.out.println("Google test failed!");
            }

            // Keep browser open until user presses Enter
            System.out.println("Browser will stay open. Press Enter to close...");
            System.in.read();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
            System.out.println("Browser closed.");
        }
    }
}