/**
 * SuperArray by Team - Group 5 (7/8/22)
 * Patti Elfers
 * collaborators: , Théa Williams, Alana Robinson, Joshua Higgins
 */

/**
   SKELETON
   SuperArray is a wrapper class for an array.
   Provides "pass-thru" accessibility to pre-existing array capabilities:
   - get/set by index
   - get length
   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
*/

import java.io.*;
import java.util.*;

public class SuperArray
{
  /**
     SUBGOAL:
     declare instance vars
     ...and initialize?
  */
  //instance vars
  private int[] data;           // "interior"/"underlying" data container
  private int numberElements;   // number of "meaningful" elements

  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity (more than one constructor in a method but they have to differ)
  public SuperArray( int size )
  {
   
    
    //this is telling the user how many boxes have useful values, you're creating the size
    //init underlying/inner storage of specified capacity
     data = new int[size];

    //init instance vars
    numberElements = 0;
   
  }

  //default constructor -- initializes capacity to 10
  public SuperArray()
  {
    //init underlying/inner storage of capacity 10
        /* YOUR SIMPLE+SMART CODE HERE */

    //init instance vars
        /* YOUR SIMPLE+SMART CODE HERE */
  }


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  public void add( int value )
  {
    int[] temp = new int[data.length+1];
    // test to see if we need to grow, then grow
      //need a temp and adding to it, data is like a storage unit 
    /**

       IMPORTANT:
       This is the first code that should run in this method
       but the last code you should write.
       Implement the rest of this method first,
       then only write this section once the rest is tested and working.
    */
    if(data.length <= numberElements){
      for(int i = 0; i < data.length; i++){
        temp[i] = data[i];
      }
      data = temp;
    }

    // add item
    data[numberElements] = value;

    // increment numberElements
    numberElements++;   
  
  }//end add()


  public boolean isEmpty()
  {
    //return whether this SuperArray instance is empty
    return numberElements == 0; //return checking for value in the indices based on the definition of number of elements (can also use an if statement--longer )
    // the method below is a longer version of what is on line 92.
    // if (numberElements == 0)
    // {
    //   return true;
    // }
    // else
    // {
    //   return false:
    // }
  }


  public int get(int index)
  {
    
    //return item at index
    return data[index]; // returns the value at position index which means that is the location or position of index
  }


  public String toString()
  {
    //return stringified version of this Object and you want to print every object. This method traverses through our array and we created a loop
    String myString = "";
    for (int i = 0; i < data.length; i++) {
     myString += data [i] + " ";
    }
    return myString; // return
  }//end toString()


  //return Stringified version of this Object,
  // with extra debugging info
  //(helper method for debugging/development phase)
  public String debug()
  {
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()


  public void remove(int index)
  {
    // return value at position index, whatever is at that index what do you do?
    //shift items down to remove the item at index
    /* YOUR SIMPLE+SMART CODE HERE */
    //this traverses through the array ++ and -- stops or caps when there is an element removed
    for (int i = index; i < data.length - 1; i++)
    {
    // this is shifting all the values one place
      data[i] = data[i+1];
    }
    // subtract fom numElements;
    numberElements--;
  }


  public void add(int index, int value)
  {
    // see if there's enough room
    /* YOUR SIMPLE+SMART CODE HERE */

    // shift elements toward the end of the array
    /* YOUR SIMPLE+SMART CODE HERE */

    // insert new element
    /* YOUR SIMPLE+SMART CODE HERE */

    // increment numElements
    /* YOUR SIMPLE+SMART CODE HERE */
  }


  private void grow()
  {
    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by?
    /* YOUR SIMPLE+SMART CODE HERE */

    // copy over all the elements from the old array to the new one
    /* YOUR SIMPLE+SMART CODE HERE */

    // point data to the new array
    // Q: How does this look when illustrated using encapsulation diagram?
    /* YOUR SIMPLE+SMART CODE HERE */
  }//end grow()

}//end class