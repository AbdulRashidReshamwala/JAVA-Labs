import java.util.Scanner;

/**
 * Car
 */
public class Car {

    String model;
    int mfgYear;
    float cost;
    float milage;

    public void setData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter model");
        model = sc.next();
        System.out.println("Enter Manufacture year");
        mfgYear = sc.nextInt();
        System.out.println("Enter cost");
        cost = sc.nextFloat();
        System.out.println("Enter milage");
        milage = sc.nextFloat();
    }

    public void displayData() {
        String string = " costs RS.";
        System.out.println(
                model + " was manufactured in " + mfgYear + string + cost + " gives a milage of " + milage + "km/ltr");
    }
}