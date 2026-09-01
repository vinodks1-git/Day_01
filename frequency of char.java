class CharacterFrequency {
    public static void main(String[] args) {

        String str = "programming";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Check whether character was already counted
            boolean alreadyCounted = false;

            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {

                int count = 0;

                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == ch) {
                        count++;
                    }
                }

                System.out.println(ch + " = " + count);
            }
        }
    }
}
