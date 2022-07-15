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
  }
}