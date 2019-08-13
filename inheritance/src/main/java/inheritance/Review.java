package inheritance;

public class Review {
    String body;
    String author;
    int stars;
    Restaurant restaurant;

    public Review (String body,String author, int stars, Restaurant restaurant){
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.restaurant = restaurant;
        if(this.restaurant !=null) restaurant.addReview(this);
    }
    public int getStars(){
        return stars;
    }

    public String toString(){
        return String.format("%s, Stars: %d \n" + "Author:%s, Body: %s", this.restaurant.name, this.stars, this.author, this.body);
    }

    public void restaurant(Restaurant restaurant) {

    }
}
