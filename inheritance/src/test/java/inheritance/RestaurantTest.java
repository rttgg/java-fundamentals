package inheritance;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {
    Restaurant testRestaurant;

    @Before
    public void setUp() throws Exception {
        testRestaurant = new Restaurant("CheeseCake", 5, 100);
    }

    @Test
    public void testToString() {
        assertEquals("CheeseCake, star 5, priceCatagory 100",
                    testRestaurant.toString());

    }
}




