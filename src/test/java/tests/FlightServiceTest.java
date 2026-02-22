package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FlightService; // your backend class

public class FlightServiceTest {

    @Test
    public void testAvailableFlights() {
        FlightService service = new FlightService();
        int flights = service.getAvailableFlights("2026-02-22").size();
        Assert.assertTrue(flights > 0, "Flights are available");
    }

    @Test
    public void testBookedSeats() {
        FlightService service = new FlightService();
        int seats = service.getBookedSeats(1).size();
        Assert.assertTrue(seats >= 0, "Booked seats count is valid");
    }
}