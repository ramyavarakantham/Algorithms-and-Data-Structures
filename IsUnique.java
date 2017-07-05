//Given a string, determine if it is unique. What if you cannot use any additional data structures
//BF: for every char, iterate linearly over the entire array-check if they are equal, O(n^2)
//Better: Sort-O(nlogn)-takes up additional space. Iterate linearly over the array to check adjacent chars
//Better: O(n).Constant space. Assume str has 256 chars. change val of ASCII val of it to true when encountered, if not already set to true.
public class IsUnique {

	static boolean isUnq(char[] str)
	{
		if(str==null || str.length<2) return true;
		boolean[] check=new boolean[256];
		for(int i=0;i<str.length;i++)
		{
			if(check[str[i]]) return false;
			else
			{
				check[str[i]]=true;
				
			}
				
		}
		
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isUnq(new char[]{'a','a'}));

	}

}

/*//Test cases:
1) Null string
2) Empty string
3) String with just one char
4) Stirng with continguous duplicates. Eg: aaaab
5) String with discontiguous duplicates. Eg: ababa*/
