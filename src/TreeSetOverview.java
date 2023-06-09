/*
TreeSet :
      - TreeSet is directly inherit class of NavigableSet but indirectly inherit the SortedSet and Set Inreface.
      - Present in java.util package.
      - Introduce in jhk 1.2 Version
      - Syntax :
      Class TreeSet implements NavigableSet
      {
      //Method
      //Constructor
      }
      - TreeSet underline data structure of "Balanced Tree"

Properties of TreeSet:
      - Not Index based data structure.
      - Doesn't follow insertion order.
      - Its follow sorting order.
      add 40 then its added as parent node ,again you 60 then its compare with parent node
      using compareTo method if second value was greater then first then ompareTo() retunr
      Positive value then added at second node.
      same if you add 10 then
      - Its store homogenous data type .
      Why not store heterogeneous because its CompareTo method can't compare then different data structure.
      - Don't store duplicate element.
      - Non-synchronized data structure.
      - Not allowed to add null value
      before 1.6 version we can added to parent node but after 1.6 not allowed to Null Values.



 */
import java.util.*;
public class TreeSetOverview {
}
