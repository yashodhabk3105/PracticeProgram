package basicprograms;

public class Countofoddnumbers {

	public static void main(String[] args) {
	int count=0;
	
	for(int i=1; i<100; i++)
	{
		if(i%2==1)
		{
			count++;
		}
		
	}
	System.out.println(count);

	}

}
