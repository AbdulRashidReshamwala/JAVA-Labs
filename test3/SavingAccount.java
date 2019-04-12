/**
 * SavingAccount
 */
public class SavingAccount implements Account {
    public double minBalance;
    public String accountName;
    public int accountNumber;
    public double accountBalance;
    public String accountType;
    private boolean premium;
    protected int depositLimit;
    protected int withdrawLimit;
    SavingAccount(String name,int number,double balance,boolean status){
        this.accountName = name;
        this.accountNumber = number;
        if(balance<1000){
            balance = 1000;
        }else{
            accountBalance = balance;
        }
        premium = status;
        minBalance = 1000;
        depositLimit = 3;
        withdrawLimit = 3;
        accountType = "Savings";
    }

    public void deposit (double amount){
        if (depositLimit <=0){
            System.out.println("deposit failed");
        }
        else{
            accountBalance = accountBalance+amount;
            System.out.println("deposit sucessfull new balance is "+accountBalance);
            depositLimit--;
        }
    }

    public void withdraw (double amount){
        if (withdrawLimit <= 0||amount <= 0|| accountBalance - amount < minBalance){
            System.out.println("Uncessfull");
        }
        else{
            accountBalance = accountBalance-amount;
            withdrawLimit--;
        }
    }
    public void display() {
        if (premium){
            System.out.println("Premium Status is true");
        }else{
            System.out.println("Premium Status is false");
        }
    }
    
}