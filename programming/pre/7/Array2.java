//Prework Assignment 7
//ThinkJava Chapter 8
//Exercise 1

import java.io.*;
import java.util.*;
import java.util.Arrays.*;

public class Array2 { 

  public static void main(String[] args) {
    int size=100;
    
    int[] a = powArray(size);
    System.out.println(Arrays.toString(a));
    }

    public static int[] powArray(int size){
          Random random = new Random();

        int[] a = new int [size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt (100);
            
        }
        return a;
      
    }
}