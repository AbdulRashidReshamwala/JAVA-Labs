/**
 * RecurrentAccount
 */
public class RecurrentAccount extends Account{
    int tenure;
    RecurrentAccount(String name,int number, double balance ,int t){
        super(name, number);
        if (balance<5000)
            accountBalance = 5000;
        else
            accountBalance = balance;
        accountType = "Recurrent";
        if (t <10)
            tenure = 10;
        else
            tenure =t;
        minBalance = 0;
    }

    public void withdraw(double amount) {
        if(tenure>0 || amount<0 || accountBalance-amount <minBalance ||amount%100!=0 ){
            System.out.println("Error");
            return;
        }
        accountBalance = accountBalance-amount;
        System.out.println("new balance is "+accountBalance);
    }
    
    public void deposit(double amount){
        if (amount<0 || amount%100 != 0 ){
            System.out.println("Errorrr");
            return;
        }
        accountBalance = accountBalance + amount;
        System.out.println("New balance is "+accountBalance);
    }

    public void decreaseTenure(int t){
        if (tenure<0){
            System.out.println("tenure over");
        }
        if(t<0)
            System.out.println("err");
        else
            tenure = tenure-t;
            System.out.println("New tenure is "+tenure+" years");

    }
}