//Given a 2D array (matrix) inputMatrix of integers, create a function spiralCopy that copies inputMatrix’s values into a 1D array in a spiral order, clockwise. Your function then should return that array. Analyze the time and space complexities of your solution.
public class SpiralMatrix {
	
	static int[] iterateMatrix(int[][] data)
	{
		if(data.length==0)
			return new int[0];
		//startrow and endrow represent top and bottom rows of the given matrix
		//rightcol and leftcol represent left and right cols respectively.
		int[] output=new int[data.length*data[0].length];//initialize output array with the number of elements in the matrix
		int startrow=0, rightcol=0, endrow= data.length-1, leftcol=data[0].length-1, count=0;//count is to keep track of the output index
		while(rightcol<=leftcol&&startrow<=endrow)
		{
			//to move from left to right 
			for(int i=rightcol;i<=leftcol;i++)
			{
				output[count++]=data[startrow][i];
			}
			//to move from top to bottom
			for(int i=startrow+1; i<=endrow;i++)
			{
				output[count++]=data[i][leftcol];
			}
			//to move from right to left
			for(int i= leftcol-1;i>=rightcol;i--)
			{
				output[count++]=data[endrow][i];
			}
			//to move from bottom to top
			for(int i=endrow-1; i>startrow;i--)
			{
				output[count++]=data[i][rightcol];
			}
			//after one spiral iteration, modify the boundaries of the matrix accordingly
			startrow++;
			endrow--;
			rightcol++;
			leftcol--;
			
		}
		
		return output;
		
	}
	public static void main(String[] args)
	{
		int[][] data={{1,2,3,4,5},{14,15,16,17,6},{13,20,19,18,7},{12,11,10,9,8}};
		int[][] a=new int[0][0];
		int[] out=iterateMatrix(a);
		for(int i=0;i<out.length;i++)
		{
			System.out.print(out[i]+" ");
		}
	}

}
