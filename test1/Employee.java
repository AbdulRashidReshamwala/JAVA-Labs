import java.util.Scanner;

/**
 * Employee
 */
public class Employee {

    String name;
    String department;
    double salary;
    int experience;

    public void setData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        name = sc.next();
        System.out.println("Enter department");
        department = sc.next();
        System.out.println("Enter Salary");
        salary = sc.nextDouble();
        System.out.println("Eneter Experience");
        experience = sc.nextInt();
    }

    public void displayData() {
        System.out.println(name + " working in " + department + " has experience of " + experience + " years earns"
                + salary + " per annum");
    }
}