import java.util.Scanner;

/**
 * Account
 */
public class Account {
    Scanner sc = new Scanner(System.in);
    int accountNumber = 0;
    String holderName = "DEFAULT";
    double balance = 0;
    String type = "Savings";

    public void setData() {
        System.out.println("Account Number");
        accountNumber = sc.nextInt();
        System.out.println("Account Name");
        holderName = sc.next();
        System.out.println("Account balance");
        balance = sc.nextDouble();
        System.out.println("Account Type");
        type = sc.next();
    }

    public void displayData() {
        System.out.println("Account of " + holderName + " of type " + type + " with account number " + accountNumber
                + " balance is " + balance);
    }
}