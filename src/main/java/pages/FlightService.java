package pages;

import java.util.ArrayList;
import java.util.List;

public class FlightService {

    // Simulate available flights
    public List<String> getAvailableFlights(String date) {
        List<String> flights = new ArrayList<>();
        // Dummy data for testing
        flights.add("Flight101");
        flights.add("Flight102");
        return flights;
    }

    // Simulate booked seats for a flight
    public List<String> getBookedSeats(int flightId) {
        List<String> bookedSeats = new ArrayList<>();
        // Dummy data for testing
        if(flightId == 1) {
            bookedSeats.add("1A");
            bookedSeats.add("1B");
        }
        return bookedSeats;
    }
}