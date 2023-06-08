/*
Hashset :
      - It is implemented class of Set Interface.
      - This present in java.util package
      - Syntax :
         Class HashSet implement Set {
         //Constructor
         //Method
         }

       - HashSet underline data structure of HashTable
       - Hashset Backed by Map.
       - Hashset was introduced in 1.2 JDK

Properties of HashSet :
     1. Hashset was not index based data Structure
        Its store value based on hashcode (when we create object then JVM generate unique value with
        respect Object called Hashcode)
     2. HashSet was backed by Map , when we store or add value in Hashset its stored in Map as Key.
     3. HashSet can't store duplicate value because key in map was always unique.
     4. HashSet can't store multiple null value.
     5. HashSet can store heterogeneous data Structure.
     6. HashSet can't follow Insertion order because its stored based on Hashcode value.
     7. HashSet doesn't follow sorting order.
     8. HashSet are non-synchronized data Structure so Fast but not guarantee data consistent






 */

import java.util.*;
public class HashSetOverview {
    public static void main(String[] args) {

        HashSet hs=new HashSet();
        hs.add(10);
        hs.add("Rohitash");
        hs.add("saharan");
        hs.add(true);
        hs.add(false);
        hs.add(true); /* not allowed duplicate value but don't give error  */
        hs.add(null);
        hs.add(34);
        hs.add(300);

        System.out.println(hs);

        Iterator it=hs.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next());
        }

       LinkedList lss=new LinkedList();
        lss.add(34);
        lss.add(342);


        /* Constructor of HashSet */
        HashSet hds=new HashSet(); /* Normal  */
        HashSet hss=new HashSet(lss); /* added other collection  */
        HashSet hsss=new HashSet(300); /* provide intail capicity */
        HashSet hsh= new HashSet(100, 4); /* load factor */


    }
}
