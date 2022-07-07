import java.io.*;
import java.util.*;

public class Beer {
  
  public static void lyrics (int beer) {
    
    if (beer>1){ 
      System.out.print(beer + " bottles of beer on the wall,\n");
      System.out.print(beer + " bottles of beer,\nya’ take one down, ya’ pass it around,\n");
      System.out.println(beer-1 + " bottles of beer on the wall.\n");
      lyrics(beer-1);
       
  } else if (beer==1){
      
      System.out.print(beer +  " bottle of beer on the wall,\n");
      System.out.print(beer + " bottle of beer,\nya’ take one down, ya’ pass it around,\n");
        System.out.println(beer-1 +" bottle of beer on the wall.\n");
        lyrics(beer-1); 
       } else if (beer==0)
             System.out.println("No bottles of beer on the wall, \nno bottles of beer,\nya' can't take one down, ya' can't pass it around,/n'cause there are no more bottles of beer on the wall!");
  }
public static void main(String[] args){
    lyrics(99);
}
}