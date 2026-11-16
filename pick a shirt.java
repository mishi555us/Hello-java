
import java.util.Random;

public class ShirtPicker {

    // Define standard shirt sizes
    enum Size {
        SMALL, MEDIUM, LARGE, XL
    }

    // Define available shirt colors
    enum Color {
        RED, BLUE, GREEN, BLACK, WHITE
    }

    // Shirt class to represent each item
    static class Shirt {

        private final Size size;
        private final Color color;

        public Shirt(Size size, Color color) {
            this.size = size;
            this.color = color;
        }

        @Override
        public String toString() {
            return color + " shirt in size " + size;
        }
    }

    public static void main(String[] args) {
        // Create an array of available shirts in the closet
        Shirt[] closet = {
            new Shirt(Size.MEDIUM, Color.BLUE),
            new Shirt(Size.LARGE, Color.BLACK),
            new Shirt(Size.SMALL, Color.RED),
            new Shirt(Size.XL, Color.WHITE),
            new Shirt(Size.MEDIUM, Color.GREEN)
        };

        System.out.println("Looking into the closet...");

        // Pick a random shirt
        Shirt pickedShirt = pickRandomShirt(closet);

        // Display the result
        System.out.println("🎉 You picked a: " + pickedShirt);
    }

    /**
     * Selects a random shirt from the provided array.
     */
    public static Shirt pickRandomShirt(Shirt[] shirts) {
        Random random = new Random();
        int randomIndex = random.nextInt(shirts.length);
        return shirts[randomIndex];
    }
}
