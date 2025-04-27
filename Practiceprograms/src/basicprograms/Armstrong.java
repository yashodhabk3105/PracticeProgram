package basicprograms;

public class Armstrong {

	public static void main(String[] args)
	{
		int num=153;
		int temp=num;
		int rev=0;
		int rem;
		
		while(num!=0)
		{
			rem= num%10;
			rev=(rem*rev*rev)+rem;
			
			num=num/10;
			
		}
		System.out.println(rev);
		


		
		
	}

}
