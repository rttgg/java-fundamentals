package inheritance;


import java.util.ArrayList;


public class Shop implements Reviewable {
    String name;
    String description;
    String price;
    ArrayList<Review> reviews;
    private int stars;

    public Shop(String name, String description, String price){
        this.name = name;
        this.description = description;
        this.price = price;
        this.reviews = new ArrayList<>();
//        System.out.println("walmart");

    }

//instant method
    @Override
    public String toString() {
        return this.name + ", Description: " + this.description + ", " + this.price;
    }

    // this.review.add(review)
    public void addReview(Review review) {
        if (review.shop != this) review.shop(this);
        this.reviews.add(review);
        int newStars = 0;
        for (Review review1 : getReviews()) {
            newStars = newStars + review1 .getStars();
        }
        this.stars = newStars / reviews.size();
    }

//    private int reviews() {
//        return 0;
//    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }


}
