
public class MedianOfSortedArrays {
	public static double thisMedian(int[] arr, int n)
	{
		
		if(arr.length%2!=0)
			return arr[n];
		else
			return (double)(arr[n-1]+arr[n])/2;
		
	}
//Uses O(log(n)) approach to find median of two sorted arrays of equal length	
	public static double findMedian(int[] ar1, int[] ar2,int start1, int end1, int start2, int end2)
	{
		if (end1-start1==1&&end2-start2==1)
			return (Integer.max(ar1[start1], ar2[start2]) + Integer.min(ar1[end1], ar2[end2])) / 2;

		double m1 = ar1[(end1+start1)/2]; /* get the median of the first array */
		double m2 = ar2[(end2+start2)/2];/* get the median of the second array */

		/* If medians are equal then return either m1 or m2 */
		if (m1 == m2)
			return m1;

		/* if m1 < m2 then median must exist in ar1[m1....] and
			ar2[....m2] */
		if (m1 < m2)
		{
			start1=(end1+start1)/2;
			end2=(end2+start2)/2;
		}

		/* if m1 > m2 then median must exist in ar1[....m1] and
			ar2[m2...] */
		else
		{
			start2=(end2+start2)/2;
			end1=(end1+start1)/2;
		}
		return findMedian(ar1,ar2,start1, end1, start2, end2);
	}
	
//Uses O(m+n) approach. Partially merges the two arrays, keeps track of the count and returns median in constant space
	/*public static double findMedian(int[] arr1, int[] arr2)
	{
		
		if(arr1.length==0||arr2.length==0)
			return (arr1.length==0)?thisMedian(arr2):thisMedian(arr1);
		int totallength=arr1.length+arr2.length;
		 
		if(totallength%2!=0)
		{
			int p1=0,p2=0, element1=0;
			for(int count=0;count<=totallength/2;count++)
			{
				if(arr1[p1]<=arr2[p2])
				{
					element1=arr1[p1];
					if(p1+1<arr1.length)
						p1++;
					
				}
				else
				{
					element1=arr2[p2];
					if(p2+1<arr2.length)
						p2++;
				}
			}
			return element1;
		}
		else
		{
			int p1=0,p2=0,element1=0,element2=0;
			for(int count=0;count<totallength/2;count++)
			{
				System.out.println("count "+count);
				if(arr1[p1]<=arr2[p2])
				{
					element1=element2;
					element2=arr1[p1];
					if(p1+1<arr1.length)
						p1++;
					
				}
				else
				{
					element1=element2;
					element2=arr2[p2];
					if(p2+1<arr2.length)
						p2++;
				}
			}
			
			
			return (double)(element1+element2)/2;
		}
		
	}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1=new int[]{1,2,3,4};
		int[] arr2=new int[]{1,1,1,1};
		int n=arr1.length;
		System.out.println(findMedian(arr1, arr2,0,n-1, 0, n-1));

	}

}
