/**
 * Account
 */
public class Account {

    protected String accountName;
    protected int accountNumber;
    protected double accountBalance;
    protected String accountType;
    protected int depositLimit;
    protected double minBalance;
    protected int withdrawLimit;

    Account(String name, int number ){
        this.accountName = name;
        this.accountNumber = number;
    }
    
    protected void deposit (double amount){
        if (depositLimit <=0){
            System.out.println("deposit failed");
        }
        else{
            accountBalance = accountBalance+amount;
            System.out.println("deposit sucessfull new balance is "+accountBalance);
            depositLimit--;
        }
    }

    protected void withdraw(double amount){
        if (withdrawLimit <= 0||amount<=0||accountBalance-amount<minBalance){
            System.out.println("Uncessfull");
        }
        else{
            accountBalance = accountBalance-amount;
            withdrawLimit--;
        }
    }




}