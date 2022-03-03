import static org.junit.Assert.*;

import org.junit.Test;

public class TestBag {
    @Test
    public void test_weight() {
        Bag bag = new Bag(13);
        assertEquals(bag.getWeight(), 13);
    }

    @Test
    public void test_weight_errors() {
        Bag bag = new Bag(12);
        assertTrue(bag instanceof Bag);
    }

    // @Test
    // public void test_with_no_weight_throws() throws Exception {
    //     assertThrows(Exception.class, () -> new Bag(0));
    // }

    // @Test
    // public void test_error_message() throws Exception {
    //     try {
    //         new Bag(0);
    //     } catch (Exception error) {
    //         assertEquals(error.getMessage(), "Bag must have a positive weight");
    //     }
    // }
}
