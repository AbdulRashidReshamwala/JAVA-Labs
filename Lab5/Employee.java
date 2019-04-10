import java.util.Scanner;

/**
 * Employee
 */
public class Employee {
    Scanner sc = new Scanner(System.in);
    private String name;
    private int id;

    public void setName(String name) {
        if (name.length() > 3) {
            this.name = name;
        } else {
            System.out.println("enter valid name");
            setName(sc.next());
        }
    }

    public String getName() {
        return this.name;
    }

    public void setId(int id) {
        if (id > 1000 && id < 10000)
            this.id = id;
        else {
            System.out.println("Should be 4 digit");
            setId(sc.nextInt());
        }
    }

    public int getId() {
        return this.id;
    }
}