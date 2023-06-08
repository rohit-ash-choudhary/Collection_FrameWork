/*
Stack :
     - Stack was legacy class which introduce in JDK 1.0 Version.
     - Stack was a Child class of Vector , its inherit the Vector class.
     - Present in java.util package
     - Syntax :
       Class Stack inherit Vector
       {
       //Method
       // Constructor
       }

Properties of Stack:
      1. Stack was designed based of LIFO (Last in First Out)
      When we remove the element from then top most element remove .
      Pop : get top most element and remove from stack.
      Peak: Provide just top most element.
      Push : Insert the element in Stack.
      2. Stack can be implemented based on Array, ArrayList, LinkedList or Vector.
      3. Stack was index based Data Structure.


 */

import java.util.Stack;

public class StackOverview {
    public static void main(String[] args) {

        /* Constructor of Stack */
       /* Stack() */

        /* Method of Stack */
        Stack st=new Stack();

        st.push(34); /* added element/object in the stack */
        st.peek(); /* return top most element */
        st.pop(); /* remove and return topmost element of stack */
        st.empty(); /* check stack was empty or not */
        st.search(23); /* search 23 and return index of 23 */


    }
}
