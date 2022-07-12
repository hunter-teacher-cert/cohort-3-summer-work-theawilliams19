//Prework Assignment 6
//ThinkJava Chapter 7
//Exercise 3

import java.io.*;
import java.util.*;

public class Power {

  public static void main(String[] args) {
      System.out.println(power(3,2));
    }
    

  public static double power(double x,int n){       double result=1;
    int i = n;
      for (i=0;i<n;i++){
        result *=x;
        }
    return result;
} 
    }  