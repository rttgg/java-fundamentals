package inheritance;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {


//    Shop testReview;

    @Test
    public void testShopToString() {
        Shop shop = new Shop("Shop: Walmart", "you can buy anything", "price:$");
        assertEquals("Shop: Walmart, Description: you can buy anything, price:$",
                "Shop: Walmart, Description: you can buy anything, price:$", shop.toString());
    }

    @Test
    public void testShopAddReview() {
        Shop shop = new Shop("Shop: Walmart", "Reasonable price", "$");

        shop.addReview(new Review("you can", 5, "Roman g"));
        assertEquals("Walmart, Description: Reasonable price, $",
                "Shop: Walmart, Description: Reasonable price, $", shop.toString());


    }

}
