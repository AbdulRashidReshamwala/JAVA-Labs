/**
 * SavingAccount
 */
public class SavingAccount extends Account {
    private boolean premium;
    SavingAccount(String name,int number,double balance,boolean status){
        super(name, number);
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

    public void display() {
        if (premium){
            System.out.println("Premium Status is true");
        }else{
            System.out.println("Premium Status is false");
        }
    }
    
}