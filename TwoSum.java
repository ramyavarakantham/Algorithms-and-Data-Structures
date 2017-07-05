/*Two sum problem: Brute force: For every element, iterate over the entire array: TC: O(n^2), SC: O(1)
 * Better: Two passes: Store all elements of array in HashMap. For each element in array, check if hashmap has its complement. Returns indices in order. Stores all the elements of the array in HashMap
 * Best: One pass: For every element, check if hashmap contains the complement. Else, store the element and its index in the Hashmap. Does not necessarily store all the elements of the array in hashmap. Returns indices out of order.
 ** For Both better and best: TC: O(n), SC: O(n)
 */


import java.util.HashMap;


public class twoSumClass {
	 public static int[] twoSum(int[] nums, int target) {
	       int[] out=new int[2];
	       HashMap<Integer,Integer> hm=new HashMap<>();
	       /*returns indices in order: 0,2. Stores all the values of the array into the hashmap
	        * for(int i=0;i<nums.length;i++)
	        * 	hm.put(nums[i],i);
	        *
	        */
	       
	       for(int i=0;i<nums.length;i++)
	       {
	    	   if(hm.containsKey(target-nums[i])&& i!=hm.get(target-nums[i]))
	    	   {
	    		   out[0]=i;
	    		   out[1]=hm.get(target-nums[i]);
	    		   return out;
	    	   }
	    	   else
	    		   hm.put(nums[i],i);//does not necessarily store all the values of array into hashmap //returns indices out of order i.e. 2, 0
	       }
	       System.out.println(hm);
	       return null;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] out=twoSum(new int[]{4,2,4,4}, 8);
		for(int i=0;i<out.length;i++)
			System.out.println(out[i]);
		

	}

}

