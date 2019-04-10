/**
 * program
 */
public class program {

    public static void main(String[] args) {
        Account abdul = new Account("Abd", 1234,20);
        abdul.deposit(4000);
        abdul.deposit(3000);
        abdul.deposit(4400);
        abdul.withdraw(15000);
        abdul.withdraw(3000);
        abdul.deposit(100);
    }
}