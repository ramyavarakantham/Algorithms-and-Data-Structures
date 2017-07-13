import java.util.HashSet;


public class LongestNonRepeatingSubstring {
	public static class Out
	{
		int len=0;
		String str="";
	}
	public static boolean isValid(String str)
	{
		HashSet<Character> hs=new HashSet<>();
		for(int i=0;i<str.length();i++)
			if(!hs.add(str.charAt(i)))
				return false;
		return true;
	}
	public static Out findSubstring(String str)
	{
		int start=0, end=0, n=str.length();
		Out out=new Out();
		if(n==1)
		{
			out.len=1;
			out.str=Character.toString(str.charAt(0));
		}
		else if(n>2)
		{
			
			while(true)
			{
				while(end<str.length()&&isValid(str.substring(start, end+1)))
				{
					end++;
					
				}
				if(out.len<end-start)
				{
					
					out.len=end-start;
					out.str=str.substring(start, end);
				}
				while(start<end &&end<str.length()&&!isValid(str.substring(start, end+1)))
					start++;
				if(end==str.length())
					break;
			}
		}
		
		return out;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaaaba";
		Out out=findSubstring(s);
		System.out.println("Length: "+out.len+"\nString: "+out.str);


	}

}
