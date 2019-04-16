/**
 * program
 */
public class program {

    public static void main(String[] args) {
        ContactManager cm = new ContactManager();
        cm.addContact(new Contact("Abdul","ar1242112@gmail.com","9004800869"));
        cm.addContact(new Contact("bdul","ar1242112@gmail.com","9004800869"));
        cm.addContact(new Contact("dul","ar1242112@gmail.com","9004800869"));
        Contact re = cm.searchContact("AbdUl");
        cm.deleteContact();
        re = cm.searchContact("dul");
        if (re!=null){
            System.out.println("Name: "+re.name);
            System.out.println("Email: "+re.email);
            System.out.println("Number: "+re.number);
        }
    }
}