package inheritance;

import java.util.ArrayList;

public class Theater implements Reviewable {
    String name;
    ArrayList<String> currentlyShowing;
    ArrayList<Review> reviews;
}

public Theater(String name) {
    this.name = name;
    this.currentlyShowing = new ArrayList<>();
    this.reviews = new ArrayList<>();
}

    @Override
    public void addReview(Review review) {

    }

    public String toString(){
    String listTheater = "Theater: " + this.name + "Movies: " + currentlyShowing + "\n";
    for (Review review : this.reviews) {
        listTheater += "Review: " + review.toString() + "\n";
    }
    return listTheater;

    }

    public void addMovie(String s) {

    }
}
