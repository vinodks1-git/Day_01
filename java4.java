

    import java.util.Scanner;

class Student {

    // Variables
    String name;
    int age;
    int rollNo;
    int marks;

    // input() method
    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();

        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();

        System.out.print("Enter Marks: ");
        marks = sc.nextInt();
    }

    // display() method
    void display() {
        System.out.println("\n----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------------");
    }
}
public class Main {
    public static void main(String[] args) {

        // Create Student object
        Student s = new Student();

        // Call input() method
        s.input();

        // Call display() method
        s.display();
    }
}

