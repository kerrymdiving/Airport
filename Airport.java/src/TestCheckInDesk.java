import org.junit.Test;
import static org.junit.Assert.*;

public class TestCheckInDesk {
    @Test
    public void checkInAPassengerGetABoardingPass() {
        Passenger passenger = new Passenger("Kerry", "A123456", "A1");
        CheckInDesk desk1 = new CheckInDesk(new Airport("LHR"));
        assertNull(passenger.getBoardingPass());
        desk1.checkIn(passenger);
        assertNotNull(passenger.getBoardingPass());
    }

    @Test
    public void checkInAPassengerTheirBagsAreTaken() {
        Bag bag = new Bag(10);
        Passenger passenger = new Passenger("Kerry", "A123456", "A1");
        passenger.setBag(bag);
        CheckInDesk desk1 = new CheckInDesk(new Airport("LHR"));
        desk1.checkIn(passenger);
        assertNull(passenger.getBag());
    }

    @Test
    public void shouldHaveAccessToPlanes() {
        Airport airport = new Airport("LHR");
        Plane plane = new Plane("TE55no");
        airport.landPlane(plane);
        Passenger passenger = new Passenger("Kerry", "A123456", "A1");
        passenger.setFlightNo("TE55no");
        airport.checkInDesks[0].checkIn(passenger);
        assertFalse(plane.seatIsEmpty(passenger.getBoardingPass()));

    }
}
