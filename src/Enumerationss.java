/*
Enumeration:
          This is a cursor used to retrieve one by one collection elements.
          Enumeration was introduced in jdk 1.0.
          Enumeration used in only legacy classes like only vector and stack.
          Enumeration cursor get by Element methods. Enumeration r=v.element();
          Enumeration Method : hasMoreElement() and nextElement()
          Enumeration cursor used to only get element in forward direction.
          Enumeration cursor used for only read purpose.




 */
import java.util.*;
import java.util.Enumeration;
public class Enumerationss {
    public static void main(String[] args) {
        Vector v=new Vector<>();

        v.add(34);
        v.add("rohit");
        v.add("choudhary");
        v.add(334);

        Enumeration er=v.elements();

        while (er.hasMoreElements())
        {
            System.out.println("print vector element " +er.nextElement());
        }

    }
}
