class Detect_Capital {
    public static void main(String[] args) {
        String word = "Google";

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                count++;
            }
        }

        if (count == word.length() || count == 0 ||
            (count == 1 && Character.isUpperCase(word.charAt(0)))) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}