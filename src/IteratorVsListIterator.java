/*
Iterator and ListIterator:
If wanna print the element of collection by one by one we did this by Cursor.
Three was three type of cursor
    1.Iterator
    2.ListIterator
    3.Enumeration

Difference between Iterator and ListIterator
1. Iterator itr=l.iterator() vs ListIterator li=l.listIterator\
2. Iterator cursor can used with any collection vs ListIterator used only with list  implimetnted class like
   Linkedlist, ArrayList , Vector and stakc etc.
3. Method in Iterator :  hasNext(), next(), remove()
   ListIterator method : hasNext(), next(), remove(), hasPrevious(), previous(),set()
4.  Iterator : only retrieve only in forward direction.
    ListIterator : we can use in both forward and backward and backward direction.



 */

import java.util.*;
import java.util.List;
public class IteratorVsListIterator {
    public static void main(String[] args) {


        List lrr = new ArrayList();
        lrr.add(45);
        lrr.add("rohit");
        lrr.add(34);
        lrr.add(34);
        lrr.add(34);
        lrr.add(34);

        System.out.println("print the list " + lrr);
        Iterator itr = lrr.iterator();


        while (itr.hasNext()) {  /* this always return check after this any element present in list */
            System.out.println(itr.next()); /* Provide the next elemetns*/
        }


        List lr = new ArrayList();
        lr.add(23);
        lr.add(43);
        lr.add(56);
        lr.add(78);
        lr.add(100);
        lr.add(234);


        System.out.println("print the list lr "+lr);

        ListIterator ltr=lr.listIterator();
        System.out.println("reterieve the element  in forward ");
        while(ltr.hasNext()){
            System.out.println("print the list element "+ ltr.next());
        }

        System.out.println("reterieve the element  in backward ");
        while(ltr.hasPrevious()){
            System.out.println("print the list element "+ ltr.previous());
        }

        ltr.set(100); /* set the object/number where cursor present now its added at first postion
        your cursor in above start from prevois and reach at first palace*/

    }
}
