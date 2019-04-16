import java.util.Vector;

/**
 * program
 */
public class program {

    public static void main(String[] args) {
        int len;
        //String tclass;
        Vector v1 =  new Vector();
        System.out.println(v1.isEmpty());
        //v1.setSize(10);
        v1.addElement("hello");
        v1.addElement(10);
        v1.addElement(10.1);
        System.out.println(v1);
        len = v1.size();
        for (int i = 0;i <len ; i++){
            if(v1.elementAt(i).getClass() == java.lang.Double.class)
            System.out.println("Double at "+i+" is "+v1.elementAt(i));
            if(v1.elementAt(i).getClass() == java.lang.Integer.class)
            System.out.println("Integer at "+i+" is "+v1.elementAt(i));
            if(v1.elementAt(i).getClass() == java.lang.String.class)
            System.out.println("String at "+i+" is "+v1.elementAt(i));
        }
    }
}