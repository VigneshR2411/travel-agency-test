package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.List;

public class FlightsPage {
    WebDriver driver;
    WebDriverWait wait;

    private By flightRows = By.xpath("//table[@class='table']/tbody/tr");
    private By chooseFlightButton = By.xpath("(//input[@value='Choose This Flight'])[1]");

    public FlightsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public int getFlightCount() {
        List<WebElement> flights = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(flightRows));
        return flights.size();
    }

    public void selectFirstFlight() {
        driver.findElement(chooseFlightButton).click();
    }
}
