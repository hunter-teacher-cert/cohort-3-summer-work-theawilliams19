/**
 * Recursion Practice with Strings by Team 14_7/7/22
 * Théa Williams
 * Collaborators: Christopher De Silva, Ed Hawkins, ELizabeth Rechtin 
 */

public class Fence
{

  /**
     String fenceR(int) -- recursive fence generator
     precond:  input is a positive integer
     postcond: returns fence with n posts

     eg
     fenceR(1) -> "|"
     fenceR(2) -> "|--|"
  */          //returns string, takes integer to determine the return the size of the string
  public static String fenceR( int n )
  {/* YOUR SIMPLE, SMART IMPLEMENTATION HERE */
    
    if (n == 0) //establishes base case
    {
      return ""; //this will return a space, however the "" could be empty,too
    }else if (n == 1) //another base case set to 1
    {
      return "|"; //when it gets to 1, it just returns the one post
    }else
    {
      return fenceR(n-1) + "--|"; //everything else, this will return the values from 2 - 9
    }
    
    
  }//end of method


  public static void main( String[] args )
  {
  
    for( int i = 0; i < 10; i++ ) {
      System.out.println( i + "-post fences: " );
      System.out.println( fenceR(i) );
    }

    /* feel free to add extra tests... */

  } //end of main
} //end of class