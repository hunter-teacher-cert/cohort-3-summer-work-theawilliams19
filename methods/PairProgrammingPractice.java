//barGraphify(int[] nums) takes an array of non-negative integers and prints a horizontal bar for each index, commensurate with the value at said index.

//Example 1:
  // if x=[0,1,2,3] then barGraphify(x) will output
  // 0:
  // 1: =
  // 2: ==
  // 3: ===

//Example 2:
  // if x=[1,0,3,2] then barGraphify(x) will output
  // 0: =
  // 1:
  // 2: ===
  // 3: ==

  public static String barGraphify(int[] x)
  {
    String retStr = "";
    for (int row = 0; row<x.length; row++) 
    {
      retStr = retStr + row;
      retStr = retStr + ": ";
      
      for(int j = 0; j < x [row]; j++)//middle section of this For loop is saying "j is going to count up the number (element) in the array at index [row]."
      {
        retStr = retStr + "=";
      }
      retStr += "\n";
    }
    return retStr;
  }