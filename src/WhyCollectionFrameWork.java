/*
Link : https://www.javatpoint.com/collections-in-java


Data Structure  : It is way in by which we can store data in efficent way

Primitive Data Structure : bit, byte, short, int,long, float,double , boolean,Char
No-Primitive Data Structure :
Linear Data Structure : String , Array, Stack , Queue, LinkedList
Non-Linear Data Structure : Tree, SET , Graph

We can use primitive data type for small application but for enterprise level we need No-Primitive Data Structure

Why  Collection FrameWork :
The Collection in Java is a framework that provides an architecture to store and manipulate the
group of objects.
Java Collections can achieve all the operations that you perform on a data such as searching,
sorting, insertion, manipulation, and deletion.
Java Collection means a single unit of objects. Java Collection framework provides many interfaces
(Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet)

What is Collection in Java
A Collection represents a single unit of objects, i.e., a group.

What is a framework in Java
It provides readymade architecture.
It represents a set of classes and interfaces.
It is optional.
What is Collection framework
The Collection framework represents a unified architecture for storing and manipulating a group of objects. It has:

Interfaces and its implementations, i.e., classes
Algorithm

The java.util package contains all the classes and interfaces for the Collection framework.

TheIterable interface :
It is the root interface for all the collection classes. The Collection interface extends the Iterable interface and
therefore all the subclasses of Collection interface also implement the Iterable interface.

It contains only one abstract method. i.e.,

Iterator<T> iterator()
It returns the iterator over the elements of type T.

Collection Interface
The Collection interface is the interface which is implemented by all the classes in the collection framework.
It declares the methods that every collection will have. In other words, we can say that the Collection interface
builds the foundation on which the collection framework depends.

Some of the methods of Collection interface are Boolean add ( Object obj), Boolean addAll ( Collection c), void clear(),
etc. which are implemented by all the subclasses of Collection interface.

There was array already then Why Collection Required :
1. Array can store both primitive and non-primitive(object) data but collection stored only non-primitive data(Objects)
2. Array can store only homogenous data but collection can store heterogeneous type data.
3. Array Size fixed we can't change size at run time and we can increase and decrease size of collection at runtime
4. collection provide pre-define API which provide class, interface and method for sorting searching, insertion and deletion etc/


 */

public class WhyCollectionFrameWork {
    public static void main(String[] args) {

    }
}
