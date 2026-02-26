
import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // Application Name and Version
        System.out.println("====================================");
        System.out.println("     Palindrome Checker App");
        System.out.println("     Version 1.0 - UC2");
        System.out.println("====================================");

        // Hardcoded String
        String word = "madam";

        // Reverse the string
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check palindrome using if-else
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program Ended.");
    }
}
