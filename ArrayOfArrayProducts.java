/*Given an array of integers arr, you’re asked to calculate for each index i the product of all integers except the integer at that index (i.e. except arr[i]). Implement a function arrayOfArrayProducts that takes an array of integers and returns an array of the products.

Solve without using division and analyze your solution’s time and space complexities.*/
public class ArrayOfArrayProducts {
	
	static int[] findProduct(int[] arr)
	{
		if(arr.length==0 || arr.length==1)
			return new int[0];
		int[] output=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			if(i==0)
				output[i]=1;
			else
			{
				output[i]=output[i-1]*arr[i-1];
				
			}
		}
		int product_so_far=1;
		for(int i=arr.length-1;i>=0;i--)
		{	
				output[i]*=product_so_far;
				product_so_far*=arr[i];
			
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={-1,0,5,6};
		int[] iter=findProduct(a);
		for(int i:iter)
		{
			System.out.println(i);
		}

	}

}
