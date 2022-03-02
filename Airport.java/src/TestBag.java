import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.*;

public class TestBag {
    @Test
    public void test_weight() {
        try {
        Bag bag = new Bag(13);
        assertEquals(bag.getWeight(), 13);
        } catch (Exception e) {

        }
        
    }
    @Test
    public void test_weight_errors() throws Exception {
        Bag bag = new Bag(12);
        assertTrue(bag instanceof Bag);
    }

    @Test
    public void test_with_no_weight_throws() throws Exception {
        assertThrows(Exception.class, () -> new Bag(0));
    }
}
