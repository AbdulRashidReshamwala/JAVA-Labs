/**
 * program
 */
public class program {

    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount("Abdul",1234,2000,true);
        CurrentAccount c1 = new CurrentAccount("Abddd",2345,1000);
        RecurrentAccount r1 =  new RecurrentAccount("abzz",1357,5000,12);
        s1.deposit(100);
        s1.deposit(100);
        s1.deposit(100);
        s1.deposit(100);
        s1.deposit(-100);
        s1.display();
        s1.display();
        c1.deposit(100);
        c1.withdraw(1100);
        r1.withdraw(100);
        r1.decreaseTenure(12);
        r1.withdraw(100);

    }
}