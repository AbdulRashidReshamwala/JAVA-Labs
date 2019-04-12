/**
 * CurrentAccount
 */
public class CurrentAccount implements Account {
    public String accountName;
    public int accountNumber;
    public double accountBalance;
    public String accountType;
    public double minBalance;
    CurrentAccount(String name,int number,double balance){
        this.accountName = name;
        this.accountNumber = number;
        accountType = "Current";
        minBalance = 0;
        if(balance<10000)
            this.accountBalance = 1000;
        else
            this.accountBalance = balance;
        
    }

    public void deposit (double amount){
        if(amount<0)
            System.out.println("error");
        accountBalance = accountBalance+amount;
        System.out.println("deposit sucessfull new balance is "+accountBalance);
    }

    public void withdraw (double amount){
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