import java.util.Scanner;


/**
 * program3
 */
public class program3 {

    public static void main(String[] args) {
        try {
        int i;
        int j;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter 2 ");
        i = sc.nextInt();
        j = sc.nextInt();
        System.out.println(i/j);
        }
        catch(ArithmeticException e){
            System.out.println("bada topa");
        }
        catch(Exception e){ 
            System.out.println("topa");
        }
    }

}