package twoDimensionMatrix;

public class Driver {
	
	public static void main(String[] args)
	{
		int[][] m = new int[5][3];
		
		int[] num = {1,0,5,2,3,4,9,0,0,10,8,7,1,11,12};
		
		int counter = 0;
		
		//m.length gives us number of rows.
		for(int i = 0; i<m.length; i++)
		{
			//m[0....row-1] gives us number of rows
			for (int j = 0; j<m[0].length; j++)
			{
				//putting value in 2d array
				m[i][j] = num[counter];
				
				//increasing index of num array
				counter++;
				
				//displaying the array
				System.out.print(m[i][j] +"  ");
			}
			System.out.println();
		}
		//setting space to look nice when zero'd array is displayer
		System.out.println();
		
		//creating the object of setMatrixToZero
		new setMatrixToZero(m);
	}
}
