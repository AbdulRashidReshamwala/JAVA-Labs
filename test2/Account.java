import java.util.Scanner;

/**
 * Account
 */
public class Account {

    Scanner sc = new Scanner(System.in);

    private String accountName;
    private int accountNumber;
    private double accountBalance;
    private String accountType;
    private int withdrawls;
    private int deposits;

    public Account(String name, int number, int balance) {
        while (name.length() < 4 && (number > 10000 || number < 9999) && balance < 1000 ) {
            System.out.println("Enter correct name and account number and balance");
            name = sc.next();
            number = sc.nextInt();
            balance = sc.nextInt();
        }
        this.accountName = name;
        this.accountNumber = number;
        this.accountBalance = balance;
        this.accountType = "Savings";
        this.withdrawls = 0;
        this.deposits = 0;
        System.out.println("Account Created with name " + this.accountName + " of type " + this.accountType
                + " with Account number " + this.accountNumber);
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Enter positive ammount");
            return;
        }
        if (this.accountBalance - amount < 1000) {
            System.out.println("Not Enough Funds");
            return;
        }
        if (this.withdrawls >= 3) {
            System.out.println("Withdrawal limit reached");
            return;
        }
        this.accountBalance = this.accountBalance - amount;
        System.out.println("New balance is " + this.accountBalance + " after withdrawal of " + amount);
        withdrawls++;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Enter positive ammount");
            return;
        }
        if (this.deposits >= 3) {
            System.out.println("Deposits limit reached");
            return;
        }
        this.accountBalance = this.accountBalance + amount;
        System.out.println("New balance is " + this.accountBalance + " after deposit of " + amount);
        deposits++;
    }
}