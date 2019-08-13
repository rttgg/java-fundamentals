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
        this.priceCatagory= priceCatagory;
        this.reviews = new ArrayList<>();
    }


    //instance methods
    public String toString(){
        return this.name + ", star " + this.stars + ", priceCatagory " + this.priceCatagory;
    }

    public ArrayList<Review>getReviews(){
        return this.reviews;
    }

    public void addReview(Review review){
        if(review.restaurant != this) review.restaurant(this);
        this.reviews.add(review);
        int newStars = 0;
        for(Review r : getReviews()){
            newStars = newStars + r.getStars();
        }
        this.stars = newStars / reviews.size();
    }

    //Create a class to represent a Review. Each Review should have a body, an author, and a number of stars.


}

//
//        RevRestaurant newReview = (RevRestaurant) incomingReview;
//
//        //Don't add if review is already in list
//        if(this.reviewList != null && this.reviewList.contains(newReview)){
//        System.out.println("Unable to add review. Already exists.");
//        }else {
//
//        this.reviewList.add(newReview);
//
//        // calculate new restaurant star rating
//        // initialize starSum at 3 so new restaurants don't default to 0 stars
//        // Don't use this.stars because we
//        // want to iterate through reviews every time for best accuracy since we are using ints
//        int starSum = 3;
//        for (RevRestaurant review : this.reviewList){
//        starSum += review.getStars();
//        }
//
//        int starAverage = starSum / (this.reviewList.size() + 1);
//        this.stars = starAverage;
//        }
//        }
//
//
//public String toString(){
//        return String.format("Restaurant name: %s, stars: %d, priceCategory: %d",
//        this.name, this.stars, this.priceCategory);
//        }
