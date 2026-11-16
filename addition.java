
import java.util.Scanner;

public class AdditionDemo {

    public static void main(String[] args) {
        // 1. Basic Addition with Variables
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Basic Addition: " + a + " + " + b + " = " + sum);

        // 2. Floating-Point Addition (Decimals)
        double price1 = 19.99;
        double price2 = 5.50;
        double total = price1 + price2;
        System.out.println("Decimal Addition: " + price1 + " + " + price2 + " = " + total);

        // 3. String Concatenation (The + operator joins strings)
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("String Concatenation: " + fullName);

        // 4. Dynamic User Input Addition
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- User Input Addition ---");

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int totalSum = num1 + num2;
        System.out.println("The sum of your numbers is: " + totalSum);

        scanner.close();
    }
}
