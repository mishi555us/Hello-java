
import java.util.ArrayList;
import java.util.List;

public class RatingSystem {

    private String itemName;
    private List<Integer> ratings;

    // Constructor
    public RatingSystem(String itemName) {
        this.itemName = itemName;
        this.ratings = new ArrayList<>();
    }

    // Add a rating between 1 and 5
    public void addRating(int rating) {
        if (rating < 1 || rating > 5) {
            System.out.println("Invalid rating: " + rating + ". Please enter a value between 1 and 5.");
            return;
        }
        ratings.add(rating);
    }

    // Calculate the average rating
    public double getAverageRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int r : ratings) {
            sum += r;
        }
        return (double) sum / ratings.size();
    }

    // Display a summary
    public void printSummary() {
        System.out.println("Item: " + itemName);
        System.out.println("Total Reviews: " + ratings.size());
        System.out.printf("Average Rating: %.2f / 5.00%n", getAverageRating());
    }

    // Main method to test the system
    public static void main(String[] args) {
        RatingSystem product = new RatingSystem("Wireless Headphones");

        product.addRating(5);
        product.addRating(4);
        product.addRating(5);
        product.addRating(6); // Will trigger validation warning

        product.printSummary();
    }
}
