/*
What was difference between List and Set (Important interview Question )
Both are interface  and extend collection Interface
1. List is index based data structure vs Set was not index based data structure (its stored data according
    to hashcode value
    what is hashcode value: A unique value for every object)
2. List can store duplicate value but set can't store duplicate value.
3. List can store multiple null value but set store on null value.
4. List follow the insertation order (first insert - first reterive ) (jis sequence mein add uss sequence reterive)
   but set can't follow the insertation order
5. In LIST we can iterate(get) get the list elements by Iterator and ListItertor but in set iterate(get)
   through Iterator.

   -- difference in Iterator and ListItertor
     Iterator - iterate(get) value in only forward direction
     ListItertor - iterate(get) value in only forward  and backward both direction

6. Implemented Class of List : ArrayList ,LinkedList, Vector , Stack
   Implemented Class of Set : Hashset, LinkedHashSet, Treeset

 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.*;

public class ListVsSet {
    public static void main(String[] args) {

        List l= new ArrayList();
        l.add(0,10);
        l.add(1, "Rohit");
        /* if you put
        l.add(3, "Saharan" ) --give error becuase index based data structure
         */
        l.add(2,"Saharan");
        l.add(3,"Saharan");
        l.add(null);


        System.out.println("print element of list "+l);
        System.out.println("---iterat value through iterator--");
        Iterator al=l.iterator();
        while (al.hasNext())
        {
            System.out.println(al.next());
        }

        Set s=new HashSet();
        s.add(1);
        s.add("Rohitash");
        s.add("Rohitash");
        s.add(null);

        System.out.println("print element of Set "+ s);


        System.out.println("---iterat value through iterator--");
        Iterator all=s.iterator();
        while (all.hasNext())
        {
          System.out.println(all.next());
        }




    }
}
