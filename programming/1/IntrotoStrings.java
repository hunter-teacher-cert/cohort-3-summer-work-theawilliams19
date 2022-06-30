public class IntrotoStrings{

      // Go through the first word character by character without displaying anything
      // Precondition: someString does not begin with spaces. Words are separated by spaces.
      // Thus, someString in position 0 is not a space char.

    public statid void main(String[] args){
    int i = 0; //creates a variable to hold the index value
    Somestring = "What is Java"
    while ( someString . charAt( i ) != ' ') //while the char is at the index value and is not a space
{
  i++ ; //go to the next index if the above condition is met
}
    // Postcondition: someString in position i IS a space.
    // Go through all the spaces after the first word
    while (someString . charAt( i ) == ' '){
    i++ ;
    }
      
// Postcondition: someString in position i IS NOT a space.
// Go through the second word character by character and display each character.
// Precondition: someString[ i ] is the first letter of the second word
    
      while (someString [ i ] != ' ') // This only works for sentences of three words or more. Try to fix it!
{
                 System.out.print( someString.charAt ( i ) );
  i++ ;
}








  }
}