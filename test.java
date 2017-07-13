import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;


public class test {
	//modifying comparator for maxHeap
	static class MyComparator implements Comparator<Integer>
	{
		

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return (o1>o2)?o1:o2;
		}
	}
	public static int findLargest(int[] arr, int n)
	{
		if(n<0||n>arr.length)
			throw new ArrayIndexOutOfBoundsException("Required element out of bounds");
		//maxHeap
		PriorityQueue<Integer> q=new PriorityQueue<>(new MyComparator());
		//minHeap
		//PriorityQueue<Integer> q=new PriorityQueue<>();
		for(int i=0;i<arr.length;i++)
			q.add(arr[i]);
		int count=1;
		while(count<n)
		{
			q.poll();
			count++;
		}
			
		
		
		return q.peek();
	}
	 public static void main(String args[])
	 {
		 int[] arr=new int[]{4,2,1,5};
		 System.out.println(findLargest(arr,4));
	 }

}
