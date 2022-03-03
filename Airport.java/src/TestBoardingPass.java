import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestBoardingPass {
    @Test
    public void hasASeatNumber() {
        BoardingPass pass = new BoardingPass(1, 1);
        int row = pass.createBoardingPass()[0];
        assertEquals(row, 1);
    }
}
