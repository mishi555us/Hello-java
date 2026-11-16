
import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    public static List<Integer> getPrimeFactors(int n) {
        List<Integer> factors = new ArrayList<>();

        // 1. Extract all factors of 2
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }

        // 2. Check odd numbers from 3 up to sqrt(n)
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        // 3. If n is still greater than 2, the remaining n is prime
        if (n > 2) {
            factors.add(n);
        }

        return factors;
    }

    public static void main(String[] args) {
        int number = 90;
        System.out.println("Prime factors of " + number + ": " + getPrimeFactors(number));
        // Output: Prime factors of 90: [2, 3, 3, 5]
    }
}
