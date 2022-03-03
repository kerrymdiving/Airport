import static org.junit.Assert.*;
import org.junit.Test;

public class TestPassenger {
    @Test
    public void passengerHasAName() {
       Passenger passenger = new Passenger("Kerry", "A123456", "A5");
       assertEquals(passenger.getName() + passenger.getPassportNumber() + passenger.getSeatNumber(), "Kerry" + "A123456" + "A5");
    }


    @Test
    public void APassengerCanHaveABag() {
        Passenger passenger = new Passenger("Kerry", "A123456", "A5");
        Bag bag = new Bag(17);
        passenger.setBag(bag);
        assertSame(passenger.getBag(), bag);
    }

    @Test
    public void APassengerChecksInBag() {
        Passenger passenger = new Passenger("Kerry", "A123456", "A5");
        Bag bag = new Bag(17);
        passenger.setBag(bag);
        passenger.getBag();
        assertSame(passenger.getBag(), null);
    }

    @Test
    public void aPassengerCanHaveABoardingPass() {
        Passenger passenger = new Passenger("Kerry", "A123456", "A5");
        BoardingPass pass = new BoardingPass(1, 0);
        assertNull(passenger.getBoardingPass());
        passenger.setBoardingPass(pass);
        assertSame(passenger.getBoardingPass(), pass);

    }
}
