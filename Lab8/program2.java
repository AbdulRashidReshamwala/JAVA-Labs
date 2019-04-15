/**
 * program2
 */
public class program2 {

    public static void main(String[] args) {
        Account.no=100;
        System.out.println(Account.no);
        Account.dance();
        Account a = new Account();
        Account.no = 10;
        System.out.println(Account.no);
        a.dance();
    }
}