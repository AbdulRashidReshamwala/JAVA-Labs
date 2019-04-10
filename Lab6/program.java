/**
 * program
 */
public class program {

    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount("Abdul",1234,2000,true);
        s1.deposit(100);
        s1.deposit(100);
        s1.deposit(100);
        s1.deposit(100);
        s1.display();
    }
}