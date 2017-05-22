
public class bubbleSort {
	public static int[] bb(int arr[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			//counter to check if array is sorted already at the end of a pass
			int sorted=0;
			//optimized by looking at n-i-1 elements at ith pass. At the end of ith pass, last i elements are sorted.
			for (int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					sorted=1;
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
			//if no swaps are made at the end of the pass,you can say that the array is sorted.
			if(sorted==0)
			{
				break;
			}
			
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4};
		int n=arr.length;
		int sortedarr[]=bb(arr,n);
		for (int i=0;i<n;i++)
		{
			System.out.println(sortedarr[i]);
		}
	

	}

}
