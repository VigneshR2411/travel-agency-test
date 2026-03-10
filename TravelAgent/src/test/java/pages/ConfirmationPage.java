package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class ConfirmationPage {
    WebDriver driver;
    WebDriverWait wait;

    private By header = By.xpath("//h1[contains(text(), 'Thank you for your purchase today!')]");
    private By idElement = By.xpath("//td[contains(text(), 'Id')]/following-sibling::td");

    public ConfirmationPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void waitForConfirmation() {
        wait.until(ExpectedConditions.presenceOfElementLocated(header));
    }

    public String getBookingId() {
        return driver.findElement(idElement).getText();
    }
}
