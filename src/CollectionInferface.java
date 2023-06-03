/*
Collection :
        Collection is an interface which is present in java.util package (intialize in java 1.2 )
   Syntax :
         Public interface collection <E> extend interface <E>

   any class can't inherit directly collection interface its inherit List , Set , Queue.
--Legacy classes and interfaces
            Legacy classes and interfaces are the classes and interfaces that formed the collections framework
        in the earlier versions of Java and how now been restructured or re-engineered
-- Method Provide By Collection :
    public boolean add(object obj) - used to added the object in collection object
    Contain  : element present in or not in
    isEmpty : collection was empty or not
    size : number of element in collection
    remove : remove element from particular index
    removeall : remove one collection all element from other collection object
    clear : remove all the elements from the collection
    public boolean addAll(Collection C) - used to added the one collection into another collection object
 */



import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionInferface {
    public static void main(String[] args) {


        ArrayList ar=new ArrayList();

        ar.add(100);
        ar.add("rohit choudhary");
        System.out.println("print the ar"+ar);

        System.out.println("100 present or not in arraylist "+ar.contains(100));
        System.out.println("collection was empty or not"+ar.isEmpty());
        System.out.println("size of the ar"+ar.size());
        System.out.println("remove element from particular index"+ar.remove(1));



        ArrayList arr=new ArrayList<>();
        arr.add("Rohitash");
        arr.add("Choudhary");
        arr.add("Amdocs");
        System.out.println("print the arr before added object"+arr);
        arr.addAll(ar);
        System.out.println("remove all element from ar elments from arr " +arr.removeAll(ar));
        System.out.println("remove all the element of collection"+ arr.clone());
        System.out.println("print the arr  after added ar"+arr);


    }
}
