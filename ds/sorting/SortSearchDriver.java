import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {


	// Uncomment these to test part 1
	
	SortSearch ss = new SortSearch(20);
	System.out.println(ss);
	
		
	// Uncomment these to test part 2

	int i;
	i = ss.findSmallestIndex(0);
  System.out.println("\nPrint results when started at index 0 in the array:\nss[smallestIndex] = value : data");
  System.out.println("--------------------------------");
	System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);

	i = ss.findSmallestIndex(10);
  System.out.println("\nPrint results when started at index 3 in the array:\nss[smallestIndex] = value : data");
   System.out.println("--------------------------------");
	 System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);
	
	// Uncomment these to test part 3
  System.out.println("\n----------------Print array----------------");
	System.out.println(ss);
  System.out.println("\n-------------Print sorted array-------------");
  
  long start,elapsed; // "long" is like a long int. int go to 16 digits and "long"'s go to 32 digits.

	start = System.currentTimeMillis(); //We are setting/initializing the "start" variable to the current time. This method is build into the System class library.
	ss.sort();//calling the sort method

	elapsed = System.currentTimeMillis() - start;//setting/initializing the "elapsed" variable to the current time - the time now, which is equal to the elapsed time.
	System.out.println("Size: 15, Time: " + elapsed);//prints out the size of the array and the time elapsed
	System.out.println(ss);
	
  System.out.println("\n-------------LinearSearch Method Test -------------");
  System.out.println(ss.linearSearch(0));
  System.out.println(ss.linearSearch(10));
  System.out.println(ss.linearSearch(21));

      System.out.println("\n-------------BinarySearch Method Test -------------");
  System.out.println(ss.binarySearch(0));
  System.out.println(ss.binarySearch(10));
  System.out.println(ss.binarySearch(21));
  
 int size = 14;
  System.out.println("--------------Binary Search Recursive Method Test--------------");
  System.out.println(ss);
  System.out.print("Index of 0: ");
  System.out.println(ss.binarySearchRecursive(0, 0, size));
  System.out.print("Index of 10: ");
  System.out.println(ss.binarySearchRecursive(10, 0, size));
  System.out.print("Index of 21: ");
	System.out.println(ss.binarySearchRecursive(21, 0, size));

    }
}