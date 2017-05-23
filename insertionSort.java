
public class insertionSort {
	public static int[] insertionSort(int[] arr, int n)
	{
		for(int i=0;i<n-1;i++)
		{
			int j=i+1;
			if(arr[i]>arr[j])
			{
				int t=arr[j];
				arr[j]=arr[i];
				arr[i]=t;
				int k=i;
				while(k>0)
				{
					if(arr[k]<arr[k-1])
					{
						int t1=arr[k];
						arr[k]=arr[k-1];
						arr[k-1]=t1;
						k--;
					}
					else
						break;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={3,4,2,1};
		int n=arr.length;
		int sortedarr[]=insertionSort(arr,n);
		for(int i=0;i<n;i++)
			System.out.println(sortedarr[i]);
		
	}

}
