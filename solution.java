public class Solution {
    public static void main(String[] args) {
        int number = 120;
        int originalNumber = number;
        int count = 0;

        while (number != 0) {
            int digit = number % 10;

            if (digit != 0 && originalNumber % digit == 0) {
                count++;
            }

            number /= 10;
        }

        System.out.println(
            "The count of digits that divide "
            + originalNumber + " is: " + count
        );
    }
}