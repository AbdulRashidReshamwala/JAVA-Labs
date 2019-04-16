/**
 * Contact
 */
public class Contact {

    public String name;
    public String email;
    public String number;
    public String sn;
    Contact(String n,String e, String no){
        name = n;
        email = e;
        number =  no;
        sn = name.toLowerCase();
    }
} 