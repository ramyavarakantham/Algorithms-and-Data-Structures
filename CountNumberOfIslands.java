import java.io.*;
import java.util.*;

class Solution {

  static int getNumberOfIslands(int[][] binaryMatrix) {
    // your code goes here
    int numOfIslands=0;
    for(int i=0;i<binaryMatrix[0].length;i++)
    {
      for(int j=0;j<binaryMatrix.length;j++)
      {
        if(binaryMatrix[i][j]==1)
        {
          numOfIslands++;
          exploreIsland(binaryMatrix, i, j);
        }
         
      }
    }
    return numOfIslands;
  }
  
  static void exploreIsland(int[][] binaryMatrix, int row, int col)
  {
    if((row<0 || row>=binaryMatrix.length|| col<0 || col>= binaryMatrix[0].length))
    {
       return;
    }
     
      if(binaryMatrix[row][col]==1 )
    {
      binaryMatrix[row][col]=-1;
      exploreIsland(binaryMatrix, row-1, col);
      exploreIsland(binaryMatrix, row+1, col);
      exploreIsland(binaryMatrix, row, col-1);
      exploreIsland(binaryMatrix, row, col+1);
    }
      
    
    }  

  public static void main(String[] args) {
    int[][] binaryMatrix= { {0,    1,    0,    1,    0},
                            {0,    0,    1,    1,    1},
                            {1,    0,    0,    1,    0},
                            {0,    1,    1,    0,    0},
                            {1,    0,    1,    0,    1}};
    System.out.print(getNumberOfIslands(binaryMatrix));
    

  }

}


                    