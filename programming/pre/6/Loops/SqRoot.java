//Prework Assignment 6
//ThinkJava Chapter 7
//Exercise 2

import java.io.*;
import java.util.*;

public class SqRoot {

  public static void main(String[] args) {
    System.out.println(squareRoot(16));
    }

  public static double squareRoot(double a) {	
      double oldValue = a/2;
      double newValue = a/2;
      double interval = 0;
      do{
         oldValue = newValue;
         newValue = (oldValue + a/oldValue)/2;
         interval = Math.abs(newValue -                 oldValue);
         System.out.println(interval);
      }while(interval > 0.001);
      return newValue;
   }
}