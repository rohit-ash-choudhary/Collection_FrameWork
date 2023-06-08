/*
ArrayList Vs Vector
1. ArrayList was introduced in JDK1.2 version but Vector was introduced in JDK1.0.
2. ArrayList was not legacy class but Vector was legacy class.
3. ArrayList was not synchronized collection  but Vector was synchronized collection.
4. ArrayList was not thread-safe vs Vector is thread-safe.
5. In case of ArrayList application speed fast because Thread no need to wait but
Vector is slow because thread go one by one.
6. ArrayList can't provide the data consistence guarantee because multiple thread access at same time
but Vector provide data consistence guarantee because thread access one by one.
7. In case of ArrayList new capacity =(old_capacity*3)/2+1
   In case of Vector new Capacity = old_capacity*2;
8. In case of Arraylist doesn't provide the method to find capacity
  but Vector class provide capacity by using int Capacity() method



*/
public class ArrayListVsVector {
    public static void main(String[] args) {

    }
}
