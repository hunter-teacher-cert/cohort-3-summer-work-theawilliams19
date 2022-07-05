import java.util.Scanner;
/**
/Converts Celsius to Fahrenheit.
*/
public class Celsius {
    public static void main(String[] args) {
    double celsius;
    double fahrenheit;
    Scanner in = new Scanner(System.in);

  // prompt the user and get the value
    System.out.print("Enter a temperature in Celsius: ");
    celsius = in.nextDouble();


  // convert and output the result
    fahrenheit = 9.0/5 * celsius + 32;
    System.out.printf("%3.2f C = %.1f F\n",            (double)celsius, fahrenheit);
}

}