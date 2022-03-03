import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestAirport {
    @Test
    public void AirportHasAName() {
        Airport gatwick = new Airport("Gatwick");
        assertEquals(gatwick.getAirportName(), "Gatwick");
        System.out.println("Welcome to " + gatwick.getAirportName() + " Airport");
    }

    @Test
    public void aPassengerCanHaveABoardingPass() {
        Passenger passenger = new Passenger("Kerry", "A123456", "A5");
        BoardingPass pass = new BoardingPass(1, 0);
        assertNull(passenger.getBoardingPass());
        passenger.setBoardingPass(pass);
        assertSame(passenger.getBoardingPass(), pass);
    }

    @Test
    public void checkInPassenger() {
        Airport Gatwick = new Airport("Gatwick");
        Passenger passenger = new Passenger("Kerry", "A123456", "A5");
        Bag bag = new Bag(17);
        passenger.setBag(bag);
        assertSame(passenger.getBag(), bag);
        assertNull(passenger.getAirportName());
        passenger.setAirportName(Gatwick);
        assertSame(passenger.getAirportName(), Gatwick);
        BoardingPass pass = new BoardingPass(1, 0);
        assertNull(passenger.getBoardingPass());
        passenger.setBoardingPass(pass);
        assertSame(passenger.getBoardingPass(), pass);
    }
    @Test
    public void parkPlanesArAnAirport() {
        Plane plane = new Plane("LA993");
        Airport london = new Airport("LHR");
        london.landPlane(plane);
        assertEquals(london.planeAt("LA993"), plane);
    }

    @Test
    public void hasCheckInDesks() {
        Airport belfast = new Airport("BEL");
        assertTrue(belfast.checkInDesks[0] instanceof CheckInDesk);
    }
}
