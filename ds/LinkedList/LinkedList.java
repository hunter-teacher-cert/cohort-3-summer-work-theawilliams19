import java.io.*;
import java.util.*;

/**
LinkedList.java
Owner: Théa W
Collaborators: Maxwell Y, Will L, Jerusha T
**/

/**
For all attempted methods, make sensible decisions for error and
edge cases (such as indexing out of bounds).

Basic
-----
add(string value) DONE
get(int index);
toString()


Intermediate (at least add, size + one of the other two)
*** must complete at least value method and one other method on the intermediate level.***
------------
size()
add(int index,String value)
indexOf(String value);
toArray()


Challenge
--------
remove(int index);
*/

public class LinkedList{

  private Node head;

  /* Constructor */
  public LinkedList()
  {
    head = null;
  }

  /* Methods */
  
  /**
  Parameters:
  value - the new string to add to the list

  Adds a new node containing value to the FRONT of the list.
  */
  public void add(String value)
  {
    Node link = new Node(); // makes new node (this new object only exists within this method)
    link.setData(value); // sets the data to value
    link.setNext(head); //will set next to the current head
    head = link;// Make the head the new link for this list (this object "link" now will exist outside this method becuase it is set the object "head", which is outside this method)
  }

  /**
  Returns the String in the NODE at location index.
  */
  public String get(int index)
  {
    // the head would be 0;
    // then head.getNext() 1; ect.... 
    // out here make a temporary Node pointer like the walker at head
    Node temp = head; //temp Node is equivilant to and functions like walker node in Driver.java file in Pointers folder
    
    for(int i = 0; i <= index; i++)// traversing to get to index
    { 
      if (i == index)// we have found the one we want to get
      {
        return temp.getData(); // returns the value for the node. Walks donw the linked list
      }
      temp = temp.getNext(); // each time we increase i, we move on to the next node.
    }
        return "";
  }

  /**
  Return a string representation of the list
  */
  public String toString()
  {
    // set up a temp Node

    // set up a returnString
    
    // traverse the List WHILE temp is not null // can do this with a FOR loop if we do size first

        // add the temp toString to the returnString
      
        // set the temp to the temp's next

    // add a null so it dones't point to space?
    
    return "";  // change to return the returnString
  }

  /**
  returns the number of elements in the list
  */
  public int size(){
    return 0;
  }



  /**
  Parameters:
  index - an int with the location to add
  value - the new value

  Adds a new node with the String value to the list.
  The new node should be added at the location specified by the index.

  For example, given the list:
  "a" -> "b" -> "c" -> "d"

  add(1,"z") results in:
  "a"-> "z" -> "b" -> "c" -> "d"

  */
  public void add(int index, String value){

  }


  /**
  Returns the index (location) of the first node in the list
  that contains value.

  Example:
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  indexOf("d") would return 3 since "d" is at location 3.

  */
  public int indexOf(String value){
    return 0;
  }


  /**
  This routine should create a new array that is the same
  size as the number of Nodes in the list.

  It should then copy all of the values to the array and return
  the array.

  */
  public String[] toArray(){
    return null;
  }



  /**
  Remove the Node at location index from the list.

  Ex:
  
  Given the list:
  "a"->"b"->"c"->"d"->"e"

  remove(2) results in:
  "a"->"b"->"d"->"e"
  */
  public void remove(int index){
  }
}