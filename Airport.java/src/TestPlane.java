import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestPlane {
    @Test
    public void planeHasAName() {
        Plane plane = new Plane ("VS010");
        assertEquals(plane.getName(), "VS010");
    }

    @Test
    public void passengerCanBoardPlane() {
        Passenger passenger = new Passenger("Kerry", "A123456", "A1");
        BoardingPass bp = new BoardingPass(1, 1);
        passenger.setBoardingPass(bp);
        Plane plane = new Plane("VS121");
        assertEquals(plane.seatIsEmpty(bp), true);
        plane.boardPassenger(passenger);
        assertEquals(plane.seatIsEmpty(bp), false);
    }
}
