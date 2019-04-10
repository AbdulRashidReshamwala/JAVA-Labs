/**
 * program
 */
public class program {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        e1.setId(1234);
        e2=e1;
        e3=e1;
        System.out.println(e3.getId());
    }
}