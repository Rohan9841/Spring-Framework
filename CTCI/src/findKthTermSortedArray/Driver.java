package findKthTermSortedArray;

public class Driver {
	public static void main(String[] args)
	{
		int[] array1 = {0,8,9,10};
		int[] array2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		
		FindKTerm f = new FindKTerm(array1, array2, 12);
		
		System.out.println("The number at the given index is "+f.findTerm(f.getMid1(),f.getMid2()));
	}
}
