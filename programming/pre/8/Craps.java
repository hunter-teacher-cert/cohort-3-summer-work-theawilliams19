//2022 Prework Final Project Assignment
//ThinkJava Chapter 9
//Assignment Goal: create a program for a craps game
//A round is played as follows:
//The shooter shoots (rolls) the dice.
//If the player rolls a 2,3, or 12, that’s Craps and the player loses.
//If the player rolls a 7 or 11, that’s a Natural and the player wins.
//Otherwise:
//the value the player rolled is now called the Point the player continues to shoot (roll) until the player either rolls the same Point again at which point the player wins or the player rolls a 7 at which point the player loses.

import java.util.Random;

public class Craps {

  public static void main(String[] args){
    // Create a Random class object.
    int numofRounds = Integer.parseInt(args[0]);
    for (int i = 1; i <= numofRounds; i++){
      System.out.println(round());
    }
    

  //   System.out.println("First roll.\n");
		// sum = roll(randomNumbers);
		// System.out.println("Sum:\t" + sum + "\n");
  }
    public static int roll(int diceSides) {
      Random randomNumbers = new Random();
      int dicerollvalue =   
      randomNumbers.nextInt(diceSides)+1;
      return dicerollvalue; 
		}

  public static int shoot(int NumDice, int     
    diceSides){
    int Total= 0;

    for (int i = 0; i < NumDice; i++) {
         Total += roll(diceSides);
    }
    return Total;
}
  public static String round(){
    int currentRoll=shoot(2, 6);
    int point;
    
    System.out.println ("You rolled a " +     
      currentRoll);

    // create a conditional - 
    // if player rolls= 2,3, or 12 = player loses.       If player rolls = 7 or 11 = else player wins        if player rolls point or loses if player roll       = 7 
    
      if (currentRoll==2 || currentRoll==3 ||    
      currentRoll==12){
        return "That's Craps, you loose.";
  
      } else if (currentRoll == 7 || currentRoll 
      ==11){
        return "That's a Natural, you win!!";
       
          }else{
          point = currentRoll;
            while (true){
            currentRoll = shoot(2,6);
            
              System.out.println ("You rolled a " + 
              currentRoll);
              if (currentRoll == point) {
              return "You matched your point, so                  you win!";
            }
              if (currentRoll == 7){
              return "You lose.";
                
              }
          }
      
 
    }
}
}