import java.util.Scanner;

public class checkSetBits {
	static void checkBinary(String num)
	{
		for(int i=0;i<num.length();i++)
			if(num.charAt(i)=='0')
			{
				System.out.println("NO");
				return;
			}
		System.out.println("YES");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		checkBinary(Integer.toBinaryString(num));
		//Makes use of logical and operation and an interesting property for numbers with all 1's in its binary representation
		//Not sure of its complexity
		
		/*int nPlus = num+1;
	    if((num & nPlus) == 0){
	        System.out.println("YES");
	    }else{
	        System.out.println("NO");
	    }*/
		
		
	}

}
