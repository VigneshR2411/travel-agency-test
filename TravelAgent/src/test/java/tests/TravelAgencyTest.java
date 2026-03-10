package tests;


import pages.*;
import com.aventstack.extentreports.Status;
import utils.ExtentReportNG;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TravelAgencyTest extends BaseTest {

    @Test
    public void testFlightBooking() {
        WebDriver driver = getDriver(); // get driver from base class

        // Navigate and log
        driver.get("https://blazedemo.com/");
        ExtentReportNG.getTest().log(Status.INFO, "Navigated to BlazeDemo");

        // Home Page
        HomePage homePage = new HomePage(driver);
        homePage.selectDeparture("Paris");
        ExtentReportNG.getTest().log(Status.INFO, "Selected departure: Paris");
        homePage.selectDestination("London");
        ExtentReportNG.getTest().log(Status.INFO, "Selected destination: London");
        homePage.clickFindFlights();
        ExtentReportNG.getTest().log(Status.INFO, "Clicked Find Flights");

        // Flights Page
        FlightsPage flightsPage = new FlightsPage(driver);
        int flightCount = flightsPage.getFlightCount();
        Assert.assertTrue(flightCount > 0, "No flights found!");
        flightsPage.selectFirstFlight();
        ExtentReportNG.getTest().log(Status.INFO, "Selected first flight");

        // Purchase Page
        PurchasePage purchasePage = new PurchasePage(driver);
        purchasePage.waitForPageToLoad();
        purchasePage.fillPersonalDetails("John Doe", "123 Main St", "Anytown", "CA", "90210");
        purchasePage.fillPaymentDetails("Visa", "4111111111111111", "12", "2025", "John Doe");
        purchasePage.clickPurchase();
        ExtentReportNG.getTest().log(Status.INFO, "Clicked Purchase Flight");

        // Confirmation Page
        ConfirmationPage confirmationPage = new ConfirmationPage(driver);
        confirmationPage.waitForConfirmation();
        String bookingId = confirmationPage.getBookingId();
        Assert.assertNotNull(bookingId, "Booking ID is null");
        ExtentReportNG.getTest().log(Status.INFO, "Booking confirmed! ID: " + bookingId);
        System.out.println("Booking confirmed! ID: " + bookingId);
        

        // 🚨 FORCE FAILURE HERE
        //Assert.fail("Intentionally failing the test to capture screenshot");
    }
}