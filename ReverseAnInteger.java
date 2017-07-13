
public class ReverseAnInteger {
	public int reverse(int x) {
        if(x==0)
          return 0;
      int counter=(x<0)?1:0;
      int n=Math.abs(x), sum=0;
      long check=0;//to check for integer overflow
      while(n!=0)
      {
          sum=sum*10+n%10;
          check=check*10+n%10;
          n=n/10;
          
      }
      if(sum==check)//when overflow occurs, java does not notify you and handles it in a circular fashion. Long datatype has a larger domain and thus comparing int and long checks for integer overflow in java
      {
          sum= (counter==1)?-1*sum:sum;
          return sum;
      }
      else 
          return 0;

      
      
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseAnInteger r=new ReverseAnInteger();
		System.out.println(r.reverse(123));
		System.out.println(r.reverse(1000000003));//checks for integer overflow

	}

}
