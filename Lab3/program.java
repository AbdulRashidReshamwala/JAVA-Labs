import java.util.Scanner;

/**
 * program
 */
public class program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee abdul = new Employee();
        System.out.println("Enter id");
        abdul.setId(sc.nextInt());
        System.out.println("Enter name");
        abdul.setName(sc.next());
        System.out.println(abdul.getName());
        System.out.println(abdul.getId());
    }
}