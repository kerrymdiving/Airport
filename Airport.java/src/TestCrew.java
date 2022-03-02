import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCrew {
   @Test
   public void crewHasAName() {
    Crew crew = new Crew ("Kerry", "Captain", "A575");
    assertEquals(crew.getName() + crew.getPosition() + crew.getStaffNumber(), "Kerry" + "Captain" + "A575");
 }
}
