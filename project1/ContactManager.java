/**
 * ContactManager
 */
public class ContactManager {
    int pointer;
    Contact[] myContacts;
    ContactManager(){
        pointer = 0 ;
        myContacts = new Contact[100];
    }

    public void addContact(Contact c) {
        myContacts[pointer] = c;
        pointer++;
        System.out.println("added");
    }

    public Contact searchContact(String sname) {
        sname = sname.toLowerCase();
        for(int i = 0; i<pointer;i++){
            if(myContacts[i].sn.equals(sname)){
                System.out.println("found at "+(i+1));
                return myContacts[i];
            }
        }
        System.out.println("not found");
        return null;
    }
    
    public void deleteContact() {
        myContacts[pointer]=null;
        pointer--;
    }
}