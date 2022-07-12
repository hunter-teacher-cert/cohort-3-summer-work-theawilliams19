//Prework Assignment 6
//ThinkJava Chapter 7
//Exercise 4

import java.io.*;
import java.util.*;

public class Factorial {

  public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
int inp;

   System.out.println("This is a Factorial Calculator"); 
   System.out.println("To compute the factorial function, enter a number: "); 
inp = Integer.parseInt(scanner.nextLine());   
	       
System.out.println("The result is: " + factorial(inp));        

   }
  
public static int factorial(int n) {
    int result = 1;
	if (n >= 1) {
	    for (int i = 1; i <= n; i++) {
	        result = result * i;
	    }
	    return result;
	}
	else {
	  System.out.println("n has to be positive");
	  return result;
	}
  }
}