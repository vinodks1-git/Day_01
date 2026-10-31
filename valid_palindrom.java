class Valid_Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        int left = 0;
        int right = s.length() - 1;

        boolean result = true;

        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            else if (Character.toLowerCase(s.charAt(left)) !=
                     Character.toLowerCase(s.charAt(right))) {
                result = false;
                break;
            }
            else {
                left++;
                right--;
            }
        }

        System.out.println(result);
    }
}