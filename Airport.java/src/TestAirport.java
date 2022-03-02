import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAirport {
    @Test
    public void aiportHasAName() {
     Airport airport = new Airport ("MAN", "4");
     assertEquals(airport.getName() + airport.getTerminal(), "MAN" +"4");
  }

  @Test
  public void checkInPassengers() {
    Airport liverpool = new Airport("LPL", "4");
    liverpool.checkIn(new Passenger("Kerry", "A123456", "A1"));
    
  }
}
