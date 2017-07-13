
public class reverseANumber {
	public int rev(int x)
	{
		String s1=Integer.toBinaryString(x);
		//StringBuffer result=new StringBuffer();
		
		/*for(int i=0;i<32;i++)
		{
			result.append(1-s1.charAt(i));
		}*/
		//Integer.to
		return Integer.parseInt(s1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseANumber r=new reverseANumber();
		System.out.println(r.rev(4));
		

	}

}
