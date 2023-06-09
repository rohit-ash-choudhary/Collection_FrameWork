/*

 */

import java.util.*;
public class TreeSetMethodandConsructure {
    public static void main(String[] args) {
        LinkedList ls=new LinkedList();
        TreeSet ts=new TreeSet(); /* Normal constructor */
        TreeSet tss=new TreeSet( ls); /* added the other collection */
        TreeSet tsst=new TreeSet(); /* give the reference of set */
        TreeSet test=new TreeSet(); /*Comparator used */

        /* Method in TreeSet */
        ts.add(34);
        ts.add(343);
        ts.add(232);
        ts.add(100);
        ts.add(400);
        System.out.println(ts);
        tss.add("Rohit");
        tss.add("Rahul");
        tss.add("Karan");
        tss.add("Sharam");

        System.out.println(tss);

    }
}
