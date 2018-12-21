package findKthTermSortedArray;

public class FindKTerm {
	
	private int[] array1;
	private int[] array2;
	
	//stores size of array1
	int m;
	
	//stores size of array2
	int n;
	
	//stores the kth term
	int k;
	
	//stores the final answer
	int f;
	
	
	//Constructor
	public FindKTerm(int[]a, int[]b, int c)
	{
		array1 = a;
		array2 = b;
		m = a.length;
		n = b.length;
		k =c;
	}
	
	//gets mid value of array1
	public int getMid1()
	{
		return (m+1)/2;
	}
	
	//gets mid value of array2
	public int getMid2()
	{
		return (n+1)/2;
	}
	
	//method to return the kth term
	//parameter mid value of both arrays
	public int findTerm(int mid1, int mid2)
	{	
		//if the kth term is less than zero or more than the total length of two arrays
		if( k>0 && k < (m+n+1))
		{
			if(k == 1 && mid1 == 1 && mid2 ==1)
			{
				System.out.println("mid1: "+mid1+"\nmid2: "+mid2);
				System.out.println("passed through mid1 == 1, mid2 ==1, k ==1");
				
				//if the value in mid1 index of array1 is less than that of array2 then we know that the lesser value is the 1st term and greater is second term.
				if(array1[mid1 - 1] < array2[mid2 - 1])
				{
					f = array1[mid1 - 1];
				}
				else
				{
					f = array2[mid2 - 1];
				}
				
			}
			
			//if adding mid1 and mid2 gives us less than the kth term, we need to increase the mid value. Eg: if k = 5, and m1 = 2, m2 =2, 
			//then m1+m2 = 4 < k i.e the total elements we have is 4 but we need the value of 5th term. So, we need to increase the mid value. 
			else if((mid1 + mid2) < k)
			{	
				System.out.println("mid1: "+mid1+"\nmid2: "+mid2);
				System.out.println("passed through mid1 + mid2 < k");
				
				//checking if the array1 mid value is greater than that of array2.If it's true than we know that we have to increase the mid value of 
				//array2 i.e. mid2 
				if(array1[mid1 - 1] >= array2[mid2 - 1])
				{
					//but before we increase the mid value we have to make sure that the mid2 is smaller than the total length of array. If not, how can we
					// increase its value? 
					if(mid2 < n)
					{
						mid2 = (mid2+1+n)/2;
					}
					
					//if mid2 is in its maximum value, we have no choice but to increase mid1, because we need to add terms to get (mid1+mid2 == k)
					else
					{
						mid1 = (mid1+1+m)/2;
					}
				}
				
				//Similar to above but opposite
				else
				{
					if(mid1 < m)
					{
						mid1 = (mid1+1+m)/2;
					}
					else
					{
						mid2 = (mid2+1+n)/2;
					}
				}
				
				//After we change the mid values, we pass it to the same method for recursion.
				findTerm(mid1, mid2);
			}
			
			//if the sum of mid1 and mid2 is greater than k, then we have to decrease the mid value. But mid1 or mid2?
			else if ((mid1 + mid2) > k)
			{
				System.out.println("mid1: "+mid1+"\nmid2: "+mid2);
				System.out.println("passed through mid1 + mid2 > k");
				
				//if mid1 index is greater than mid2 index than we decrease the mid1 value. I'm using the fact that the array is sorted
				if(array1[mid1 - 1] >= array2[mid2 - 1])
				{
					//But before decreasing the value of mid1, we must make sure that it is greater than 1. 
					if(mid1>1)
					{
						mid1 = (mid1+1)/2;
					}
					else
					{
						mid2 = (mid2+1)/2;
					}
				}
				//similar to above but opposite.
				else
				{
					if(mid2 > 1)
					{
						mid2 = (mid2+1)/2;
					}
					else
					{
						mid1 = (mid1+1)/2;
					}
				}
				
				//recursion 
				findTerm(mid1, mid2);
			}
			
			//if adding mid1 and mid2 gives us exact k then we are close to our answer because we need kth term and we have exactly k elements by adding mid1 and mid2
			else if ((mid1 + mid2) == k)
			{
				System.out.println("mid1: "+mid1+"\nmid2: "+mid2);
				System.out.println("passed through mid1 + mid2 == k");
				
				//checking if the mid1 index is greater than mid2 index
				if(array1[mid1 - 1] > array2[mid2 - 1])
				{
					//if trye then see if mid2 is smaller than the total length of array2. This is to see if we are in the last element of array2 or not 
					if(mid2 < n)
					{
						//if not then we again check if increasing the index in array2 gives us value smaller than the value that we have at array1.
						if(array2[mid2] < array1[mid1 - 1])
						{
							
							//if it gives us smaller value at array2 then we increase mid2 by 1 and decrease mid1 by 1 so that sum will again equal to k.
							mid2 = mid2 + 1;
							mid1 = mid1 -1;
							
							//use recursion
							findTerm(mid1, mid2);
						}
					}
				}
				
				//same as above but opposite
				else
				{
					if(mid1 < m)
					{
						if(array1[mid1] < array2[mid2 - 1])
						{
							mid1 = mid1 + 1;
							mid2 = mid2 -1;
							
							findTerm(mid1, mid2);
						}
					}
				}
				
				//getting max value between mid1 and mid2 to compare with k
				int max = Math.max(mid1, mid2);
				
				//if k> max then we know that we need value which is greater between array1[mid1 -1] and array2[mid 2 -1]
				if(k>max)
				{
					if(array1[mid1 - 1] > array2[mid2 - 1])
					{
						f = array1[mid1 - 1];
					}
					else
					{
						f = array2[mid2 - 1];
					}
				}
				else
				{
					if(array1[mid1 - 1] < array2[mid2 - 1])
					{
						f = array1[mid1 - 1];
					}
					else
					{
						f = array2[mid2 - 1];
					}
				}	
			}
			
			else 
			{
				System.out.println("mid1: "+mid1+"\nmid2: "+mid2);
				System.out.println("passed through nothing");
				f = 1000000000;
			}
			return f;
		}
		else
		{
			System.out.println("mid1: "+mid1+"\nmid2: "+mid2);
			System.out.println("Please give index between starting from 1 and ending at "+(m+n));
			return 1000000000;
		}
	}
}
