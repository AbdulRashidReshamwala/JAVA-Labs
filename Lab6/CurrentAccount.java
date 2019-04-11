/**
 * CurrentAccount
 */
public class CurrentAccount extends Account {
    CurrentAccount(String name,int number,double balance){
        super(name, number);
        accountType = "Current";
        minBalance = 0;
        if(balance<10000)
            this.accountBalance = 1000;
        else
            this.accountBalance = balance;
        
    }
    
}