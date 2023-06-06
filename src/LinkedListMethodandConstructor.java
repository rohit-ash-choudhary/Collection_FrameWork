import java.util.*;
public class LinkedListMethodandConstructor {
    public static void main(String[] args) {

        LinkedList ll=new LinkedList();

        ll.add(34);
        ll.add("Rohtitash");
        ll.add("Rohit");
        ll.add("Rohit");
        ll.add(null);
        ll.add(3);



        System.out.println(ll);
/*
        Interface Collection{
            boolean add(Object obj);
            boolean addAll(Collection c);
            boolean remove(Object obj);
            boolean removeAll(Collection c);

            void clear();

            boolean contains(Object obj);
            boolean containsAll(Collection c);

            boolean isEmpty();

            int size();


        }
        as LinkedList inherit this interface all method availabe inside this */
         LinkedList lt=new LinkedList();
         lt.add(34);
        lt.add(344);
        lt.add(3432);


        ll.add(4,5);
        ll.get(4);
        ll.addAll(lt);
        ll.remove(5);/* remove element from particular index */

        ll.set(3,5); /* set element 5 at index 3 */

        ll.indexOf(45);

        ll.lastIndexOf(5); /* in case duplicate element last index of element */


        /* Contain List, Deque, Collection Method */

        ll.addFirst(4);
        ll.addLast(45);

        ll.removeFirst();
        ll.removeLast();
        ll.removeFirstOccurrence(4);




    }
}
