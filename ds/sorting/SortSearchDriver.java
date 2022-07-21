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
	ss.sort();
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