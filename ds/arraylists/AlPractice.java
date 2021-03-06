import java.io.*;
import java.util.*;

/**
ALPractice.java
Owner:  Théa W 
Collaborators: William L,	Maxwell Y  (Room 3)
**/

/** Methods to write

Basic level:
------------
public static ArrayList<Integer> buildRandomList(int size, int maxval)
public static int sumOfList(ArrayList<Integer> dataList)

Intermediate level:
-------------------
public static void swapElements(ArrayList<Integer> dataList, int indexA,int indexB)


Challenge level:
-------------------
public static void removeValue(ArrayList<Integer> dataList, int valueToRemove)
public static ArrayList<Integer> sumLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
public static ArrayList<Integer> zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
*/


public class AlPractice{

  /**
  Parameters:
  - size - an integer representing how many items to add to the list
  - maxval - the largest value to store in the list
  Preconditions:
  - size >= 0
  - maxVal > 0
  Returns:
  - A new ArrayList of Integers with each value being a random
    number between 0 and maxval (not including maxval).
  */
  public static ArrayList<Integer> buildRandomList(int size, int maxval)
  {
    
    ArrayList<Integer> randList = new ArrayList<Integer>(); // where the random numbers go
    Random random = new Random();//object from Random class that will randomly generate numbers to fill the array.
    for (int i = 0; i < size; i++) // making it up to size as we go though. 
    {
      // adds an item of random value from 0 -> maxval
      randList.add(random.nextInt(maxval)); //The random number is first generated and then is is added.
    }
    
    return randList;//placeholder to compile.
  }//end of buildRandomList method

  /**
  Parameters:
  - dataList - an ArrayList of integer values.
  Returns:
  - The sum of all of the elements of the ArrayList.
  */
  public static int sumOfList(ArrayList<Integer> dataList)
  {
    int sum = 0;  // variable we created to store the sum
    for(int i = 0; i < dataList.size(); i++)
    {
     // action if condition is met in for loop - adds each item at i to the sum, after this loop returns to last part which increments (moves to the next index in array.)
     sum += dataList.get(i);
    }//end of for loop
    
    return sum; // returns the sum of the elements in the array.
  }//ends sumOfList method

  /**
  Parameters:
  - dataList - an ArrayList of Integers
  - index1, index2 - the two locations to swap.
  Preconditions:
  - index1 and index2 are valid indecies of dataList
  Postconditions:
  - The ArrayList is modified such that
    The value that was in dataList[index1] is now in dataList[index2], and
    the value  that was in dataList[index2] is now in dataList[index1].
  - No other values should be modified.
  */
  public static void swapElements(ArrayList<Integer> dataList, int index1,int index2)
  {
    // store the values at index1 & index2
    int val1 = dataList.get(index1);//creates temp variable to store element from array index
    int val2 = dataList.get(index2);//creates temp variable to store element from array index

    // set the arrayList at index1 to the stored value for index2 above and vice versa
    dataList.set(index1, val2);//this will put the element we temporarily stored in val2 into the index 1 in the array.
    dataList.set(index2, val1);//this will put the element we temporarily stored in val1 into the index 2 in the array.
  }

  /**
  Parameters:
  - dataList - an AraryList of Integers
  - valueToRemove - the value to remove
  Postconditions:
  - The dataList is modified such that all occurances of valueToRemove are removed.
  */
  public static void removeValue(ArrayList<Integer> dataList, int valueToRemove){
    // this function will change the size of the array. So we need to start at the end and move
    // down from there so that if we remove something we don't try to stop after the end of the
    // arrayList
    
    // 5, 5, 1, 6, 7, 5  and we removed 5's we would end up with 1, 6, 7 so we have to start at the end
    // because the length will change
    for (int i = dataList.size() - 1; i >= 0; i--)
    {
      if (dataList.get(i) == valueToRemove)
      {
        dataList.remove(i);
      }
    }
  }

  /**
  Parameters:
  - ListA,ListB - ArrayLists of integer values.
  Preconditions:
  - ListA and ListB have equal lengths.
  Returns:
  - A new ArrayList that contains the sum of the corresponding indecies of the two arraylists.
    e.g. sumLists( [1,2,3], [4,0,5]) would return: [5,2,8]
  Postconditions:
  - The parameter ArrayLists should not be modified.
  */
  public static ArrayList<Integer> sumLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
  {
    // make a new arrayList to keep values
    ArrayList<Integer> retList = new ArrayList<Integer>();

    
    // assumes they are the same size so can use either size
    for (int i = 0; i < ListA.size(); i++)
    {
      // add the value of ListA at i and the Value of ListB at i to the new arrayList
      // adds an item to relList which is the total of ListA at i and ListB at i
      retList.add(ListA.get(i) + ListB.get(i));
    }
    
    return retList; // return the new arrayList
  }

  /** zipLists
  Parameters:
  - ListA,ListB - ArrayLists of integer values.
  Returns:
  - A new ArrayList that contains all of the elements from both ArrayLists in alternating order starting with ListA's first element.
    When one list has no more values to add, continue adding the remaining values of the longer list.
    e.g. zipLists( [1,2,3,4], [8,9]) would return: [1,8,2,9,3,4]
  Postconditions:
  - The parameter ArrayLists should not be modified.
  */
  public static ArrayList<Integer> zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
  {
    return null;//placeholder to compile.
  }


public static void main(String[] args) {

    ArrayList<Integer> al;

    public static void main(String[] args) {

    ArrayList<Integer> al;

    //Uncomment these to test buildRandomList
    al = buildRandomList(10,100);
    System.out.println(al);

    //Uncomment these to test swapElements
    swapElements(al,2,6); // NOTE: had to include al
    System.out.println(al);

    // // Uncomment these to test removeValue
    // al.add(5);
    // al.add(10);
    // al.add(5);
    // al.add(13);
    // al.set(2,5);
    // al.set(3,5);
    // System.out.println(al); // needed al, not a
    // removeValue(al,5);
    // System.out.println(al); // needed al, not a

  }
  }
}//ends class