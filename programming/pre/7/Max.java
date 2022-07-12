//Prework Assignment 7
//ThinkJava Chapter 8
//Exercise 4
//Exercise description: Write a method called indexOfMax that takes an array of integers and returns the index of the largest element. Can you write this method using an enhanced for loop? Why or why not?

import java.io.*;
import java.util.*;
import java.util.Arrays.*;

public class Max { 

  public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
    System.out.println("Maximum Value = " + indexOfMax(numbers));
    }

    public static int indexOfMax(int[] numbers){
      int index = 0;
      int i = 0;
      for (int number:numbers){
         if (numbers[i] > numbers[index]){
            index = i;
         }
      }
      return index;
   }

}
