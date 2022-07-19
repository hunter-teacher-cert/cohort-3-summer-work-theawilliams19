import java.io.*;
import java.util.*;

/**
Driver.java
Owner: Théa W
Collaborators: Maxwell Y, Will L, Jerusha T
**/

public class Driver{
  public static void main(String[] args) 
  {
    LinkedList l = new LinkedList();
    
    System.out.println(l);
    // testing add
    System.out.println("Add test ----------------------------------------------");
    l.add("D");
    l.add("C");
    l.add("B");
    l.add("A");

    // testing get
    System.out.println("\nGet test ----------------------------------------------");
    System.out.println(l.get(0));
    System.out.println(l.get(1));
    System.out.println(l.get(2));
    System.out.println(l.get(3));

    // testing size
    System.out.println("\nSize test ----------------------------------------------");
    System.out.println(l.size());

    // teseting toString();
    System.out.println("\nToString test ----------------------------------------------");
    System.out.println(l);

    // add overload test
    System.out.println("\noverloaded add test ----------------------------------------------");
    l.add(1, "A.5");
    System.out.println(l);

    // of indexOf
    System.out.println("\nindexOf test ----------------------------------------------");
    System.out.println(l.indexOf("B")); 

    // toArray test
    System.out.println("\ntoArray test ----------------------------------------------");
    String[] tst = l.toArray();
    for(int i = 0; i < tst.length; i++)
    {
      if(i == tst.length -1)
      {
        System.out.print(tst[i] + "");
      } else {
        System.out.print(tst[i] + ", ");
      }
      
    } 
    System.out.println();
    

    // remove test 
    System.out.println("\nRemove test ----------------------------------------------");
    l.remove(1);
    System.out.println(l);

    
  }
}