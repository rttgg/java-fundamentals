package inheritance;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {

    Review testReview;

    @Before
    public void setUp() throws Exception {
        Restaurant restaurant = new Restaurant("Restaurant: CheeseCake",  5 , 100);
        testReview = new Review("Excellent!", "Roman", 5, restaurant);
    }
    @Test public void testToString() {
        assertEquals("Restaurant: CheeseCake, Stars: 5 \n" +
                "Author:Roman, Body: Excellent!", testReview.toString());
    }
}