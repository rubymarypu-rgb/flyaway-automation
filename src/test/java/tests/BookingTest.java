package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.*;

public class BookingTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void openHomePage() throws InterruptedException {
        driver.get("http://localhost:8081/flyaway");
        //Thread.sleep(2000); // wait 2 seconds for page to load
    }

    @Test
    public void testCompleteBooking_NewUser() {

        HomePage home = new HomePage(driver);
        home.clickBookFlight();

        BookFlightPage bookFlight = new BookFlightPage(driver);
        bookFlight.searchFlights("BLR", "HYD", "02/21/2026", "2");

        //SearchResultsPage searchResults = new SearchResultsPage(driver);
       // searchResults.clickBookTickets();
        
        SearchResultsPage searchResults = new SearchResultsPage(driver);
        searchResults.clickBookTickets();
        searchResults.clickBookNow();   // 🔥 THIS WAS MISSING
        
        System.out.println(driver.getCurrentUrl());

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.registerUser(
                "Ruby",
                "John",
                "ruby@john.com",
                "Ruby@123",
                "9876543210"
        );
        

        // 🔥 ADD THIS PART
        ConfirmBookingPage confirmPage = new ConfirmBookingPage(driver);
        confirmPage.clickConfirmBooking();

        PaymentPage paymentPage = new PaymentPage(driver);
        paymentPage.makePayment("RubyJohn", "1234567890123456");

        Assert.assertTrue(paymentPage.isPaymentSuccessful());

        
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}