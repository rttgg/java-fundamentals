package inheritance;

//import java.*;

import java.util.ArrayList;

public class Restaurant {
    //    private final ArrayList<Object> reviews;
    // should have a name, a number of stars betweeen 0 and 5, and a price category (i.e. number of dollar signs).
    String name;
    int stars;
    int priceCatagory;
    ArrayList<Review> reviews;


    //Implement a Restaurant constructor.
    public Restaurant(String name, int stars, int priceCatagory) {
        this.name = name;
        this.stars = 5;
        this.priceCatagory = priceCatagory;
        this.reviews = new ArrayList<>();
    }


    //instance methods
    public String toString() {
        return this.name + ", star " + this.stars + ", priceCatagory " + this.priceCatagory;
    }

    public ArrayList<Review> getReviews() {
        return this.reviews;
    }

    public void addReview(Review review) {
        if (review.restaurant != this) review.restaurant(this);
        this.reviews.add(review);
        int newStars = 0;
        for (Review review1 : getReviews()) {
            newStars = newStars + review1 .getStars();
        }
        this.stars = newStars / reviews.size();
    }
}


