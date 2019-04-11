import java.util.Scanner;

/**
 * Account
 */
public class Account {
    Scanner sc =  new Scanner(System.in);
    protected String accountName;
    protected int accountNumber;
    protected double accountBalance;
    protected String accountType;
    protected double minBalance;

    Account(String name, int number ){
        while(name.length() < 3 || number<999 || number>9999 ){
            System.out.println("Enter correct details");
            name = sc.next();
            number = sc.nextInt();
        }
        this.accountName = name;
        this.accountNumber = number;
    }
    
    protected void deposit (double amount){
        if(amount<0)
            System.out.println("error");
        accountBalance = accountBalance+amount;
        System.out.println("deposit sucessfull new balance is "+accountBalance);
    }

    protected void withdraw (double amount){
        if(amount<0)
            System.out.println("error");
        if (accountBalance-amount >=minBalance){
            accountBalance = accountBalance-amount;
            System.out.println("New balance is "+accountBalance);
        }
        else
            System.out.println("Insufficient Funds");    
    }




}