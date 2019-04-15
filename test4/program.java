import java.util.Scanner;

/**
 * program
 */
public class program {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String s1;
        s1 = sc.next();
        System.out.println(s1.toUpperCase());
        System.out.println(s1.charAt(1));
        System.out.println(s1.charAt(2));
        System.out.println(s1.length());
        System.out.println(s1.toCharArray());

    }
}