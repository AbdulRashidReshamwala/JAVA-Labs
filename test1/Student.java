import java.util.Scanner;

/**
 * Student
 */
public class Student {

    String name;
    int rollNo;
    String school;
    int grade;
    float percentage;

    public void setData() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name ");
        name = sc.next();
        System.out.println("Enter Roll No. ");
        rollNo = sc.nextInt();
        System.out.println("Enter School Name ");
        school = sc.next();
        System.out.println("Enter Standard ");
        grade = sc.nextInt();
        System.out.println("Enter Percentage");
        percentage = sc.nextFloat();

    }

    public void displayData() {

        System.out.println(name + " Roll NO. " + rollNo + " from " + school + " of grade " + grade + " scored "
                + percentage + "%");

    }
}