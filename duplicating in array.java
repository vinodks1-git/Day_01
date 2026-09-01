class DuplicateElements {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 1};

        System.out.println("Duplicate elements:");

        for (int i = 0; i < arr.length; i++) {

            boolean alreadyPrinted = false;

            // Check if already printed
            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
