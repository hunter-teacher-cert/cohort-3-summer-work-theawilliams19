import java.io.*;
import java.util.*;

/**
 * Conway's Game of Life by Team AreWeSentientYet?
 * First Last
 * collaborators: First Last, Joel Bianchi
 */

/**
   The Rules of Life:
   Survivals:
   * A living cell with 2 or 3 living neighbours will survive for the next generation.
   Deaths:
   * Each cell with >3 neighbours will die from overpopulation.
   * Every cell with <2 neighbours will die from isolation.
   Births:
   * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive in next generation.
   NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation.
*/

public class Cgol
{

  //create, initialize, and return  empty board (all cells dead)
  public static char[][] createNewBoard( int rows, int cols )
  {
    //construct a new char 2D array
    char[][] board = new char[rows][cols];

    //traverse through the entire 2D array
    for (int r = 0; r<board.length; r++)
    {
      for (int c = 0; c<board[0].length; c++)
      {
        //Assign a dot to the dead cells
        board[r][c] = '.';
      }
    }
    
    //return the 2D array
    return board;
  }


  //print the board to the terminal
  public static void printBoard( char[][] board )
  {
    //traverse through entire array
    for (int r = 0; r<board.length; r++)
    {
      for (int c = 0; c<board[0].length; c++)
      {
        //print out each cell's char
        System.out.print (board[r][c]);
      }
      //at the end of each row, put a line break
      System.out.println ();
    } 
    
  }


  //set cell (r,c) to val
  public static void setCell( char[][] board, int r, int c, char val )
  {
    board[r][c] = val;
    
  }


  //return number of living neigbours of board[r][c]
  public static int countNeighbors( char[][] board, int row, int col )
  {
    int count = 0;
    for (int r = row-1; r<=row+1; r++)
    {
        if (r<0) //if r cycles above top row
          continue;
        if (r >= board.length) //bottom boundary
          break;
      for (int c = col-1; c<=col+1; c++)   
      {
        if (c <0) //left bound
          continue;
        if (c >= board[0].length) //right bound
          continue;

        //don't count the actual middle cell
        if (!(r == row && c == col)){
          //check if the cell is alive
          if (board[r][c] == 'X')
          {
            //increment the count
            count++;
          }
        }
        //System.out.print(board[row][col] + " "); 
      }
    
   }  
    return count;
  }


  /**
     precond: given a board and a cell
     postcond: return next generation cell state based on CGOL rules
     (alive 'X', dead ' ')
  */
  public static char getNextGenCell( char[][] board,int r, int c )
  {
    //check the number of neighbors
    int n = countNeighbors (board, r, c);
      if ('x')
    
    //check to see if it's alive or dead



    //determine if the next gen cell is alive or dead
    
      // // Survivals:
      // //    * A living cell with 2 or 3 living neighbours will survive for the next generation.
      // //    Deaths:
      // //    * Each cell with >3 neighbours will die from overpopulation.
      // //    * Every cell with <2 neighbours will die from isolation.
      // //    Births:
      // //    * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive in next generation.
      // //    NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation.
      // */
    
    return 'é';
  }


  //generate and return a new board representing next generation
  public static char[][] generateNextBoard( char[][] board )
  {
    return new char[1][1];
  }


  public static void main( String[] args )
  {
    char[][] board;
    board = createNewBoard(5,5);
    //breathe life into some cells:
    setCell(board, 0, 0, 'X');
    setCell(board, 0, 1, 'X');
    setCell(board, 1, 0, 'X');
    // TASK:
    // Once your initial version is running,
    // try out different starting configurations of living cells...
    // (Feel free to comment out the above three lines.)
    System.out.println("Gen X:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    board = generateNextBoard(board);
    System.out.println("Gen X+1:");
    printBoard(board);
    System.out.println("--------------------------\n\n");

  }//end main()

}//end class