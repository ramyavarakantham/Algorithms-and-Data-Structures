
public class CountNaturalNumbers {
	
	static int countNumbers(int m)
	{
		if(m<10)
			return m;
		else
		{
			int number_of_digits=1;
			int number_to_start=9;
			while(m>number_of_digits*number_to_start)

		{
				m-=number_of_digits*number_to_start;
				number_of_digits++;
				number_to_start*=10;
				}
			int ans=number_to_start/9-1;
			ans+=m/number_of_digits;
			return ans;
					}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countNumbers(10));
	}

}
