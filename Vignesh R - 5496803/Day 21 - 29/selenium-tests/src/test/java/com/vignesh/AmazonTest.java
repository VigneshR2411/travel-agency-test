package com.vignesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.IOException;

public class AmazonTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.get("https://www.amazon.com");

            String title = driver.getTitle();
            System.out.println("Amazon page title: " + title);

            if (title.contains("Amazon")) {
                System.out.println("Amazon test passed!");
            } else {
                System.out.println("Amazon test failed!");
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