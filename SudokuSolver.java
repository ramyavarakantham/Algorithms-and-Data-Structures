import java.util.*;

public class SudokuSolver {
	//check if a particular cell is empty
	boolean isEmptyCell(int[][] board, int r, int c)
	{
		if (board[r][c]==0|| board[r][c]==-1)
			return true;
		return false;
	}
	//find all possible valid values for an empty cell
	HashSet<Integer> findPossibleValues(int[][] board, int r, int c)
	{
		HashSet<Integer> values=new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		//remove already existing values from that row and col
		for (int i=0;i<9;i++)
		{
			values.remove(board[r][i]);
			values.remove(board[i][c]);
		}
		//remove already existing values from that sub board
		int temprow=r-r%3;
		int tempcol=c-c%3;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				values.remove(board[temprow+i][tempcol+j]);
			}
		}
		
		return values;
	}
	//check if the board is complete i.e. no empty cells
	boolean isComplete(int[][] board)
	{
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				if(isEmptyCell(board, i, j))
					return false;
			}
		}
		return true;
		
	}
	//Initial call
	boolean isValid(int[][] board)
	{
		
		for(int i=0;i<9;i++)
		{
			HashSet<Integer> hs=new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
			//check for repetitive entries in a row
			for(int j=0;j<9;j++)
			{
				if(!isEmptyCell(board, i, j))
				{
					if(!hs.remove(board[i][j]))
						return false;
				}
			}
			//check for repetitive entries in a column
			for(int k=0;k<9;k++)
			{
				if(!isEmptyCell(board,k,i))
				{
					if(!hs.remove(board[k][i]))
							return false;
				}
			}
			
		}
		//check for repetitive entries in a sub board
		if(!isValidSubboard(board, 0, 0))
			return false;
		//Input is valid, now try filling up the board
		return solveSudoku(board);
	}
	
	//check for repetitive entries in a sub board
	boolean isValidSubboard(int[][] board, int rowindex, int colindex)
	{
		if(rowindex==9 && colindex==9)
			return true;
		HashSet<Integer> hs=new HashSet<>();
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				if(!isEmptyCell(board, rowindex+i, colindex+j)&& !hs.add(board[rowindex+i][colindex+j]))
					return false;
			}
		}
		isValidSubboard(board, rowindex+3, colindex+3);
		return true;
	}
	//Input valid, try solving the board
	boolean solveSudoku(int[][] board)
	{
		//base case, board complete
		if(isComplete(board))
			return true;
		//for every cell, check if it is an empty cell, substitute a value from its possible values and try filling up the board, backtrack if it results in an invalid board
		for (int i=0;i<9;i++)
		{
			for (int j=0;j<9;j++)
			{
				if(isEmptyCell(board, i, j))
				{
					HashSet<Integer> hs=new HashSet<>();
					hs=findPossibleValues(board, i, j);
					for(int s:hs)
					{
						board[i][j]=s;
						if(solveSudoku(board))
							return true;
						board[i][j]=0;
												
					}
				}
			}
		}
		return false;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
