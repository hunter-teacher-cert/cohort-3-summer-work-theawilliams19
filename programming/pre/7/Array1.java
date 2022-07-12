//Prework Assignment 7
//ThinkJava Chapter 8
//Exercise 1

import java.io.*;
import java.util.*;
import java.util.Arrays.*;

public class Array1 { 
  public static void main(String[] args) {
    double[] a = new double[]{5, 6, 8, 7};
    System.out.println(Arrays.toString(powArray(a)));
}
  public static double[] powArray(double [] a) {
    for (int i = 0; i < a.length; i++) {
         a[i] = Math.pow(a[i], 2.0);
    }
    return a;
}
}
