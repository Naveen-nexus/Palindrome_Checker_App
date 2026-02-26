
import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        String reversed = "";

        // Reverse the string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed string
        if (original.equals(reversed)) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        // Close scanner
        scanner.close();
    }
}
