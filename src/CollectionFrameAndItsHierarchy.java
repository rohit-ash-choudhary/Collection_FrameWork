/*
Collection FrameWork :
Collection framework was an set of predefine class and interface which is used to store multiple data.

Collection : It is a single entity or object that store multiple data
FrameWork : set of  libraries.
Difference between Library and FrameWork :
Library provide any one thing in MVC (Model-View-Controller)
Framework provide all three  MVC (Model-View-Controller)

Collection framework contain two main part :
1. java.util.Collection : store directly value
2. java.util.Map : store data in key-value pair


Hierarchy of Collection Framework
Let us see the hierarchy of Collection framework. The java.util package contains all the classes and interfaces for the Collection framework.

Hierarchy of Java Collection framework


 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CollectionFrameAndItsHierarchy {
    public static void main(String[] args) {

        ArrayList al=new ArrayList();
        al.add(10);
        al.add("rohit");
        al.add("mansih");
        al.add('c');
        al.add(34.2);

        HashSet hs=new HashSet();
        hs.add(10);
        hs.add("rohit");
        hs.add("mansih");
        hs.add('c');
        hs.add(34.2);
        /*
        Here al is collection object(ArrayList/HashSet object) contain multiple objects 10,rohit, manish, 23.2
         */

        /*
        We can't able to create object of interface but we create reference variable and store other object like below
         */
        List l=new ArrayList();


    }
}
