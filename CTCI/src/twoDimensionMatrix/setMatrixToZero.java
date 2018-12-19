//Program to set rows and columns of a 2d matrix to zero if there is a zero in that row or a column.

package twoDimensionMatrix;

public class setMatrixToZero {
	
	public setMatrixToZero(int[][] matrix)
	{
		int rowLength = matrix.length;
		int columnLength = matrix[0].length;
		
		//variables to store true if the certain rows and columns have 0. 
		boolean[] rowsWithZero = new boolean[rowLength];
		boolean[] columnsWithZero = new boolean[columnLength];
		
		for(int i = 0; i<rowLength; i++)
		{
			for(int j = 0; j<columnLength; j++)
			{
				if (matrix[i][j] == 0)
				{
					//storing the rows and columns that have 0 on them
					rowsWithZero[i] = true;
					columnsWithZero[j] = true;
				}
			}
		}
		
		for(int i = 0; i<rowLength; i++)
		{
			for(int j = 0; j<columnLength; j++)
			{
				//if the boolean array with index i or j has true, then that row or column has zero(s). 
				if(rowsWithZero[i] == true || columnsWithZero[j] == true)
				{
					matrix[i][j] = 0;
				}
				System.out.print(matrix[i][j] +"   ");
				
			}
			System.out.println();
		}
	}
}
