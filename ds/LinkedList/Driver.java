import java.io.*;
import java.util.*;

/**
Driver.java
Owner: Théa W
Collaborators: Maxwell Y, Will L, Jerusha T
**/

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    
    System.out.println(l);
    // testing add
    l.add("D");
    l.add("C");
    l.add("B");
    l.add("A");

    // testing get
    System.out.println(l.get(0));
    System.out.println(l.get(1));
    System.out.println(l.get(2));
    System.out.println(l.get(3));

    // testing size
    System.out.println(l.size());

    // teseting toString();
    System.out.println(l);

    // add overload test
    l.add(1, "A.5");
    System.out.println(l);

    // of indexOf
    System.out.println(l.indexOf("B")); 
  }
}