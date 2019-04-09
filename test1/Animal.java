import java.util.Scanner;

/**
 * animal
 */
public class Animal {

    String species;
    String habitat;
    int age;
    float height;
    String food;

    public void setData() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Specie ");
        species = sc.next();
        System.out.println("Enter Habitat ");
        habitat = sc.next();
        System.out.println("Enter Age ");
        age = sc.nextInt();
        System.out.println("Enter height ");
        height = sc.nextFloat();
        System.out.println("Enter food ");
        food = sc.next();

    }

    public void displayData() {

        System.out.print("The animal is of " + species + " specie lives in " + habitat + " has age " + age
                + " who is " + height + " metre's tall and eats " + food);

    }
}