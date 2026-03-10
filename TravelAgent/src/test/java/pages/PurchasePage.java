package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class PurchasePage {
    WebDriver driver;
    WebDriverWait wait;

    private By header = By.xpath("//h2[contains(text(), 'Your flight from')]");
    private By totalCost = By.xpath("//p[contains(text(), 'Total Cost:')]");
    private By inputName = By.id("inputName");
    private By address = By.id("address");
    private By city = By.id("city");
    private By state = By.id("state");
    private By zipCode = By.id("zipCode");
    private By cardType = By.id("cardType");
    private By creditCardNumber = By.id("creditCardNumber");
    private By creditCardMonth = By.id("creditCardMonth");
    private By creditCardYear = By.id("creditCardYear");
    private By nameOnCard = By.id("nameOnCard");
    private By purchaseButton = By.cssSelector("input[type='submit'][value='Purchase Flight']");

    public PurchasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void waitForPageToLoad() {
        wait.until(ExpectedConditions.presenceOfElementLocated(header));
        wait.until(ExpectedConditions.presenceOfElementLocated(totalCost));
    }

    public void fillPersonalDetails(String name, String addr, String cityVal, String stateVal, String zip) {
        driver.findElement(inputName).sendKeys(name);
        driver.findElement(address).sendKeys(addr);
        driver.findElement(this.city).sendKeys(cityVal);
        driver.findElement(this.state).sendKeys(stateVal);
        driver.findElement(zipCode).sendKeys(zip);
    }

    public void fillPaymentDetails(String card, String number, String month, String year, String nameOnCardVal) {
        new Select(driver.findElement(cardType)).selectByVisibleText(card);
        driver.findElement(creditCardNumber).sendKeys(number);
        driver.findElement(creditCardMonth).sendKeys(month);
        driver.findElement(creditCardYear).sendKeys(year);
        driver.findElement(nameOnCard).sendKeys(nameOnCardVal);
    }

    public void clickPurchase() {
        driver.findElement(purchaseButton).click();
    }
}
