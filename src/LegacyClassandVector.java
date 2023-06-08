/*
When java release first version JDK1 that time java declared/provides some class & interface
that store the data/object like Vector , Set , Hashtable and Dictionary

Collection comes in JDK1.2 version :
So the existing class re-structured and re-engineered so they can adjust in collection framework
hierarchy those class called legacy class.

Vector :
      -Vector is legacy class which was introduce in JDK1.
      -Vector is implemented class of List interface.
      -Vector is present in java.util package.
      Syntax:
      -class Vector implements List, Serializable
      {
      //Method
      //Constructor
      }
      - Underline data structure of Vector is Growable array.

Properties of Vector:
    - Vector is index base data structure.
    - Vector can store heterogeneous  data type.
    - we can store duplicate value
    - Vector follow insertation order
    - Vector doesn't follow sorting order.
    - Vector are synchronized but not ArrayList
     Note : All Legacy class are synchronized.



 */

import java.lang.reflect.Constructor;
import java.util.Vector;

public class LegacyClassandVector {
    public static void main(String[] args) {

        /* Constructor of Vector */
        Vector v=new Vector(); /* create initial capacity vector with 10 */
        Vector vv=new Vector(34); /* provide initial capacity by your */
        Vector vvv=new Vector(20,4); /* increment capacity by */
        Vector vvvv=new Vector(vvv); /* store object of other collection  */


        v.add(34); /* add the object */
        /* Method of vector class  */

        /* Its contains method of List and Collection Interface. */
        v.capacity();
        v.elementAt(3);
        v.insertElementAt(3,3);
    }
}
