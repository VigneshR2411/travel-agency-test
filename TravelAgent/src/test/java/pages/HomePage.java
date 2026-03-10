package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;

    // Locators
    private By departureDropdown = By.name("fromPort");
    private By destinationDropdown = By.name("toPort");
    private By findFlightsButton = By.cssSelector("input[type='submit']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void selectDeparture(String city) {
        new Select(wait.until(ExpectedConditions.presenceOfElementLocated(departureDropdown))).selectByVisibleText(city);
    }

    public void selectDestination(String city) {
        new Select(driver.findElement(destinationDropdown)).selectByVisibleText(city);
    }

    public void clickFindFlights() {
        driver.findElement(findFlightsButton).click();
    }
}
