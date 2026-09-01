import java.util.Scanner;

public class traffic{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input details
        System.out.print("Enter vehicle number: ");
        String vehicleNumber = sc.nextLine();

        System.out.print("Enter vehicle speed (km/h): ");
        int speed = sc.nextInt();

        System.out.print("Enter driver's age: ");
        int age = sc.nextInt();

        System.out.print("Is helmet worn? (true/false): ");
        boolean helmet = sc.nextBoolean();

        System.out.print("Is it an emergency vehicle? (Y/N): ");
        char emergency = sc.next().charAt(0);

        int fine = 0;
        boolean violation = false;

            if ((emergency == 'Y' || emergency == 'y')) {

            System.out.println("\nEmergency vehicle - Speed violation ignored.");

            // Helmet and age violations still apply
            if (age < 18 && !helmet) {
                fine = 1500;
                violation = true;
            } 
            else if (age < 18) {
                fine = 1000;
                violation = true;
            } 
            else if (!helmet) {
                fine = 500;
                violation = true;
            }

        } else {

            // Check traffic violations
            if (speed > 80 && age < 18 && !helmet) {
                fine = 3000;
                violation = true;
            }
            else if (speed > 80 && age < 18) {
                fine = 2500;
                violation = true;
            }
            else if (speed > 80 && !helmet) {
                fine = 1500;
                violation = true;
            }
            else if (speed > 80) {
                fine = 1000;
                violation = true;
            }
            else if (age < 18 && !helmet) {
                fine = 1500;
                violation = true;
            }
            else if (age < 18) {
                fine = 1000;
                violation = true;
            }
            else if (!helmet) {
                fine = 500;
                violation = true;
            }
        }

        // Final result
        System.out.println("\n----- Traffic Violation Report -----");
        System.out.println("Vehicle Number : " + vehicleNumber);

        if (violation) {
            System.out.println("Violation      : YES");
            System.out.println("Fine Amount    : Rs. " + fine);
        } else {
            System.out.println("Violation      : NO");
            System.out.println("Fine Amount    : Rs. 0");
        }

        sc.close();
    }
}