
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        // Remove spaces and punctuation
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "")
                            .toLowerCase();

        String reversed = "";

        // Reverse the sentence
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }

        // Check palindrome
        if (cleaned.equals(reversed)) {
            System.out.println("The sentence is a palindrome.");
        } else {
            System.out.println("The sentence is not a palindrome.");
        }

        sc.close();
    }
}
