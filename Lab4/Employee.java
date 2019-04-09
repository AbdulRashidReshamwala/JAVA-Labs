import java.util.Scanner;

/**
 * Employee
 */
public class Employee {
    Scanner sc = new Scanner(System.in);
    private String name;
    private int id;

    public Employee() {
        System.out.println("Default Constructor");
    }

    public Employee(String name, int id) {
        while (name.length() > 3 || (id > 999 && id < 9999)) {
            System.out.println("Enter Correct Details Name and ID");
            name = sc.next();
            id = sc.nextInt();
        }
        this.name = name;
        this.id = id;
        System.out.println("Name was set to " + this.name + " and id was set to " + this.id);
    }
}