//Given a sorted array arr of distinct integers, write a function indexEqualsValueSearch that returns an index i for which arr[i] == i. Return -1 if there is no such index. Analyze the time and space complexities of your solution and explain its correctness.
public class ArrayIndexElementEquality {
	public static int checkEquality(int[] arr)
	{
		int low=0, high=arr.length-1;
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			if(arr[mid]==mid)
				return mid;
			else if(arr[mid]<mid)
				low=mid+1;
			else
				high=mid-1;
				
		}
				
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={-8,0,2,5,4,9,10};
		System.out.println(checkEquality(arr));
		

	}

}
