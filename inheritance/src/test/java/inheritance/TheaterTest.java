package inheritance;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheaterTest {

    @Test
    public void testTheaterToString() {
        Theater theater = new Theater("AMC");
        assertEquals("Theater: AMC, Movies: []\n", "Theater: AMC, Movies: []\n", theater.toString();

        theater.addMovie("Lion king: star war");
        assertEquals("Theater: Movies: [Lion king: star war]\n", "Theater: AMC, Movies: [Lion king: star war]\n", theater.toString());
    }


    }


