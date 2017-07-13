import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {
	public boolean findDuplicates(int[] arr)
	{
		Set<Integer> s=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(!s.add(arr[i]))
				return true;
		}
		
			
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,3,4,5,1,5,7};
		DuplicatesInArray d=new DuplicatesInArray();
		System.out.println(d.findDuplicates(arr));

	}

}
