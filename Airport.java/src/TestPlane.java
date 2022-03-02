import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestPlane {
    @Test
    public void planeHasAName() {
        Plane plane = new Plane ("VS010");
        assertEquals(plane.getName(), "VS010");
    }
}
