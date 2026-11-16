
public class RotateNumber {

    public static int rotateDigits(int num, int k) {
        if (num == 0) {
            return 0;
        }

        // 1. Count total digits
        int digits = (int) Math.log10(Math.abs(num)) + 1;

        // 2. Normalize k to handle rotations larger than digit count or negative (right) rotations
        k = ((k % digits) + digits) % digits;
        if (k == 0) {
            return num;
        }

        // 3. Split and recombine using powers of 10
        int divisor = (int) Math.pow(10, digits - k);
        int leftPart = num / divisor;
        int rightPart = num % divisor;

        return rightPart * (int) Math.pow(10, k) + leftPart;
    }

    public static void main(String[] args) {
        System.out.println(rotateDigits(12345, 2));  // Output: 34512 (Left rotation by 2)
        System.out.println(rotateDigits(12345, -1)); // Output: 51234 (Right rotation by 1)
    }
}
