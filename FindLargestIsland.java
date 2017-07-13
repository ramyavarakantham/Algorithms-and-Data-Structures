
import java.io.*;
import java.util.*;

class FindLargestIsland {

  static int getNumberOfIslands(int[][] binaryMatrix) {
    // your code goes here
	 if(binaryMatrix.length==0)
		 return 0;
    int numOfIslands=0;
    int maxcount=Integer.MIN_VALUE;
    if((binaryMatrix.length & binaryMatrix[0].length)==1 && binaryMatrix[0][0]==0)
    	maxcount=0;
    for(int i=0;i<binaryMatrix[0].length;i++)
    {
      for(int j=0;j<binaryMatrix.length;j++)
      {
        if(binaryMatrix[i][j]==1)
        {
          numOfIslands++;
          int count=exploreIsland(binaryMatrix, i, j, 0);
          //System.out.println("starting at pos "+ i+ " , "+j+ " count is "+count);
          if(count>maxcount)
        	  maxcount=count;
        }
         
      }
    }
    System.out.println("Length of largest island is "+maxcount);
    return numOfIslands;
  }
  
  static int exploreIsland(int[][] binaryMatrix, int row, int col, int count)
  {
	
    if((row<0 || row>=binaryMatrix.length|| col<0 || col>= binaryMatrix[0].length))
    {
       return count;
    }
     
      if(binaryMatrix[row][col]==1 )
    {
    //System.out.println("pos row "+row+" col "+col+" count "+count);
      count++;
      binaryMatrix[row][col]=-1;
      count=exploreIsland(binaryMatrix, row-1, col, count);
      count=exploreIsland(binaryMatrix, row+1, col, count);
      count=exploreIsland(binaryMatrix, row, col-1, count);
      count=exploreIsland(binaryMatrix, row, col+1, count);
      //if diagonals are also considered to be a part of the island
/*      count=exploreIsland(binaryMatrix, row-1, col-1, count);
      count=exploreIsland(binaryMatrix, row-1, col+1, count);
      count=exploreIsland(binaryMatrix, row+1, col-1, count);
      count=exploreIsland(binaryMatrix, row+1, col+1, count);*/
    }
     return count; 
    
    }  

  public static void main(String[] args) {
    int[][] binaryMatrix= { {0}};
    System.out.print("Number of islands are "+ getNumberOfIslands(binaryMatrix));
    

  }

}
/*
 * Test cases:
 * 1) Matrix empty-return 0-number of islands are 0
 * 2) Matrix has one element-continue-no special case-maxlength would be min value of integer-bad.check if matrix has one element, if 0, set maxcount to 0, else continue
 * Matrices:
 * 							{0,    1,    0,    1,    0},
                            {0,    0,    1,    1,    1},
                            {1,    0,    0,    1,    0},
                            {0,    1,    1,    0,    0},
                            {1,    0,    1,    0,    1}
                            
                            
 */
//Geeks for Geeks accepted solution
/*import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {

  static int getNumberOfIslands(int[][] binaryMatrix) {
    // your code goes here
	 if(binaryMatrix.length==0)
		 return 0;
    int numOfIslands=0;
    int maxcount=Integer.MIN_VALUE;
    if((binaryMatrix.length & binaryMatrix[0].length)==1 && binaryMatrix[0][0]==0)
    	maxcount=0;
    for(int i=0;i<binaryMatrix.length;i++)
    {
      for(int j=0;j<binaryMatrix[0].length;j++)
      {
        if(binaryMatrix[i][j]==1)
        {
          numOfIslands++;
          int count=exploreIsland(binaryMatrix, i, j, 0);
          //System.out.println("starting at pos "+ i+ " , "+j+ " count is "+count);
          if(count>maxcount)
        	  maxcount=count;
        }
         
      }
    }
    //System.out.println("Length of largest island is "+maxcount);
    return maxcount;
  }
  
  static int exploreIsland(int[][] binaryMatrix, int row, int col, int count)
  {
	
    if((row<0 || row>=binaryMatrix.length|| col<0 || col>= binaryMatrix[0].length))
    {
       return count;
    }
     
      if(binaryMatrix[row][col]==1 )
    {
    //System.out.println("pos row "+row+" col "+col+" count "+count);
      count++;
      binaryMatrix[row][col]=-1;
      count=exploreIsland(binaryMatrix, row-1, col, count);
      count=exploreIsland(binaryMatrix, row+1, col, count);
      count=exploreIsland(binaryMatrix, row, col-1, count);
      count=exploreIsland(binaryMatrix, row, col+1, count);
      count=exploreIsland(binaryMatrix, row-1, col-1, count);
      count=exploreIsland(binaryMatrix, row-1, col+1, count);
      count=exploreIsland(binaryMatrix, row+1, col-1, count);
      count=exploreIsland(binaryMatrix, row+1, col+1, count);
    }
     return count; 
    
    }  

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int noOfTestCases=sc.nextInt();
    for(int i=0;i<noOfTestCases;i++)
    {
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] binaryMatrix=new int[rows][cols];
        for(int j=0;j<rows;j++)
        {
            for(int k=0;k<cols;k++)
            {
                binaryMatrix[j][k]=sc.nextInt();
            }
        }
        System.out.println(getNumberOfIslands(binaryMatrix));
    }
    
    
    

  }

}

 * Test cases:
 * 1) Matrix empty-return 0-number of islands are 0
 * 2) Matrix has one element-continue-no special case-maxlength would be min value of integer-bad.check if matrix has one element, if 0, set maxcount to 0, else continue
 * Matrices:
 * 							{0,    1,    0,    1,    0},
                            {0,    0,    1,    1,    1},
                            {1,    0,    0,    1,    0},
                            {0,    1,    1,    0,    0},
                            {1,    0,    1,    0,    1}
                            
                            
 
*/