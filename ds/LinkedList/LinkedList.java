import java.io.*;
import java.util.*;

/**
LinkedList.java
Owner: Théa W
Collaborators: Maxwell Y, Will L, Jerusha T
Group 3
Dates: 7/15/22 & 7/18/22
**/

/**
For all attempted methods, make sensible decisions for error and
edge cases (such as indexing out of bounds).

Basic
-----
add(string value) DONE
get(int index); DONE
toString(); DONE


Intermediate (at least add, size + one of the other two)
------------
size() DONE
add(int index,String value) DONE
indexOf(String value); DONE
toArray()


Challenge
--------
remove(int index);
*/

public class LinkedList{

  // instance variables or properties
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
    // track the current node, starting at head
    Node tempNode = head;

    // set up a returnString
    String tempString = "";
    
    // traverse the List until size() in for loop
    for (int i = 0; i < size(); i++)
    {
      tempString += tempNode + " "; // added a space so it looks less ugly
      tempNode = tempNode.getNext(); // move down to the next
    }

    tempString += "null"; // so it doesn't go off into space
    
    return tempString;  // change to return the returnString
  }

  /**
  returns the number of elements in the list
  */
  public int size()// this will let us have a size so we don't have to use while loops everywhere
  {
    // temp number storage
    int tempSize = 0;

    // track the current node, starting at head
    Node temp = head;
    
    // while node != null add 1 to size
    while(temp != null)
    {
      tempSize ++; // increase one
      temp = temp.getNext(); // move to the next item
    }
    
    return tempSize;  // return temp number number storage
    
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
  public void add(int index, String value)
  {
    
    Node newNode = new Node(); // make a new node set it to equal the variable "value".
    newNode.setData(value);
    //This method can also be written more succinctly as "Node newNode = new Node(value);
    
    // if add index == 0 do the same thing as add above
    if(index == 0)
    {
      newNode.setNext(head); //will set next to the current head
      head = newNode;// Make the head the new link for this list (this object "link" now will exist outside this method becuase it is set the object "head", which is outside this method)
    }
    else
    {
      // make a walker to go though the list
      Node current = head;
      // go though the LL while less than index
      for (int i = 0; i < index; i++)
      {
        // if we are at index -1 store the getnext of that the new node
        if (i == index - 1) // the current is at the node we want to add "newNode" to
        {
          // set our new node "newNode"'s setNext() to the current node's getNext
        

          newNode.setNext(current.getNext());
          // set current node's setNext() to newNode
          current.setNext(newNode);
        }
        
        current = current.getNext(); // update the current node as i goes up
        
      }
      
    }
    
  }


  /**
  Returns the index (location) of the first node in the list
  that contains value.

  Example:
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  indexOf("d") would return 3 since "d" is at location 3.

  */
  //This method returns the index of the first occurence of a Node with data = value (gives the location/position of the first Node that includes data "value").
  public int indexOf(String value)
  {
    
    // make a walker temp again, set to head
    Node walkerTemp = head;
    
    // for each item in the Linked List, up to size()
    for (int i = 0; i < size(); i++)
    {
      // if the walker's getData() == value, return i
      if (walkerTemp.getData() == value)
      { 
        return i; 
      }
      // walker to next node
      walkerTemp = walkerTemp.getNext();
    }
    return -1; // return a -1 if not on list
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