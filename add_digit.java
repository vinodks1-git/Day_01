public class add_digit {
    public static void main(String[] args) {
        int number = 123; // You can change this value to test with different numbers
        int digitToAdd = 5; // You can change this value to add a different digit

        // Convert the number to a string, append the digit, and convert back to an integer
        String newNumberStr = Integer.toString(number) + Integer.toString(digitToAdd);
        int newNumber = Integer.parseInt(newNumberStr);

        System.out.println("Original number: " + number);
        System.out.println("Digit to add: " + digitToAdd);
        System.out.println("New number after adding the digit: " + newNumber);
    }
}
