package stepDefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

    WebDriver driver;

    @When("I launch the browser")
    public void i_launch_the_browser() {
        // Set up WebDriver (assuming Chrome; adjust as needed)
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://example.com/login"); // replace with your URL
    }

    @When("I enter valid username and password")
    public void i_enter_valid_username_and_password() {
        // Implement element locating and sending keys
        // driver.findElement(By.id("username")).sendKeys("validUser");
        // driver.findElement(By.id("password")).sendKeys("validPass");
    }

    @When("I click on login button")
    public void i_click_on_login_button() {
        // driver.findElement(By.id("loginBtn")).click();
        // Add assertions or verification steps as needed
    }
}