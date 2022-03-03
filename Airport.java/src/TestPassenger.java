import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestPassenger {
    @Test
    public void passengerHasAName() {
       Passenger passenger = new Passenger("Kerry", "A123456", "A5");
       assertEquals(passenger.getName() + passenger.getPassportNumber() + passenger.getSeatNumber(), "Kerry" + "A123456" + "A5");
    }
}
