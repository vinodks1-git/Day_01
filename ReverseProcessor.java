import java.util.Scanner;

public class ReverseProcessor {
    public static void main(String[] args) {
        // Create scanner instance for user input
        Scanner scanner = new Scanner(System.in);
        
        // ---------------------------------------------------------
        // PART 1: REVERSE A NUMBER
        // ---------------------------------------------------------
        System.out.print("Enter an integer to reverse: ");
        int number = scanner.nextInt();
        
        // Store original for display, handle negative numbers logic cleanly
        int tempNumber = number; 
        int reversedNumber = 0;
        
        while (tempNumber != 0) {
            int lastDigit = tempNumber % 10; // Extract the last digit
            reversedNumber = (reversedNumber * 10) + lastDigit; // Build reversed number
            tempNumber = tempNumber / 10; // Remove the last digit
        }
        
        // Consume the leftover newline character from nextInt()
        scanner.nextLine(); 
        
        // ---------------------------------------------------------
        // PART 2: REVERSE A STRING
        // ---------------------------------------------------------
        System.out.print("Enter a string to reverse: ");
        String text = scanner.nextLine();
        
        // Using built-in StringBuilder class for high efficiency
        StringBuilder stringBuilder = new StringBuilder(text);
        String reversedText = stringBuilder.reverse().toString();
        
        // ---------------------------------------------------------
        // OUTPUT RESULTS
        // ---------------------------------------------------------
        System.out.println("\n--- RESULTS ---");
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversedNumber);
        System.out.println("Original String: " + text);
        System.out.println("Reversed String: " + reversedText);
        
        // Close scanner reference
        scanner.close();
    }
}
