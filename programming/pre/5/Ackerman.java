import java.io.*;
import java.util.*;

public class Ackerman {

  public static void main(String[] args) {
    System.out.println("A(0,0)="+ ack(0,0));
    System.out.println("A(0,1)="+ ack(0,1));
    System.out.println("A(1,0)="+ ack(1,0));
    }

  public static int ack(int m, int n) {	

		if (m==0) {
			return n + 1; 
		      
      } else if(n==0) {
			    return ack(m-1,1);
		          
      } else {
			    return ack(m-1, ack(m, n-1));
		}
	}
}
/*The goal of this exercise is to translate a 
 *recursive definition into a Java method. 
 *The Ackermann function is defined for non- 
 *negative integers as follows:
 * A(m,n) = n + 1               if m = 0
 *        = A(m - 1,1)          if m > 0, n = 0
 *        = A(m - 1,A(m,n - 1)) if m > 0, n > 0
*Write a method called ack that takes two 
*ints as parameters and that computes and *returns the value of the Ackermann function.

*Test your implementation of Ackermann by *invoking it from main and displaying the *return value. Note the return value gets very *big very quickly. You should try it only for *small values of m and n (not bigger *than 3).
*/