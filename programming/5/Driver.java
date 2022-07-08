//import java.io.*;
import java.util.*;


/**
 * Driver class for Time class by Team 14_7/7/22
 * Elizabeth Rechtin
 * Collaborators: Ed Hawkins, Thea Williams, Christopher De Silva
 */

/**
   INSTRUCTIONS:

   This file contains the Driver starter code for our Time class.
   
   Add code in main to test all your methods
   
   Place this file in a folder named programming/5/Driver.java

*/
  //

public class Driver {

    public static void main(String[] args) {
    	//declare a var of appropriate type to assign an instance of Time to
    	Time t1 = new Time (9, 0, 0);//an object of the class Time
      System.out.println("Class starts at: " + t1);
      //String temp = t + "!"; java looks and tries to cast t to a string
      //System.out.println(temp);

    
      

      Time timeVar = new Time(2,2,2); // defualt constructor
      t1.add (timeVar);
    
    	//assign var the address of a newly-apportioned Time object
    	Time t = new Time(); //uses the constructor to build the foundation with data
      System.out.println(t1.toString());
      System.out.println (t1.isEquals(timeVar));
      System.out.println(t1.compareTo(timeVar));
    }//end main()
}//end class