import java.util.*;
import java.util.ArrayList;

public class ArrayListMethoadAndConstructor {
    public static void main(String[] args) {
       /* Arraylist Constructor  */

        ArrayList ar=new ArrayList();
        ArrayList arr=new ArrayList(8);
        ArrayList test=new ArrayList();
        test.add(34);
        test.add(3434);
        test.add(324);
        test.add(34134);
        test.add("saharan");
        ArrayList arrr=new ArrayList(test);
       /*
       Three type of Constructor as below
       ArrayList ar=new ArrayList() : Create an array list which intial capicity was 10 and size was zero.
       ArrayList ar=new ArrayList(8) you can provide capicity according to you that was his arraylist capicity was 8
       ArrayList arrr=new ArrayList(test); Store element of other collection like here store the element of test arraylist
       */

        /* Important Method Of ArrayList */

        ar.add(34); /* to add the element ,store element based on index */
       /* ar.add(3,45); - can't skip the index postion in sequence need to store */
        ar.add(1,45);
        ar.add(2,"Rohitash");
        ar.add(3,"Rohitash");

        ar.addAll(3,test); /* add all element of a collection */

        ar.remove("Rohitash"); /* remove object using object in case of string */
        ar.remove(1); /* remove index object in case of integer */

        ar.removeAll(test);/* remove all element of test collection from ar arrayLIST */

        ar.clear();  /* remove all the element from ar ArrayList */

        ar.contains(45); /* return boolean valude check element present or not in ArrayList */


        ar.set(3,56); /* store element at particular index  replace the element*/

        ar.indexOf(56); /* provide index of any element */

        Iterator irr=ar.iterator(); /* this used to print element one by one */















    }
}
