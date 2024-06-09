
import java.util.Scanner;

public class prime {

	public static void main(String[] args)
	{
		int n1;
		boolean flag = false;
		
		Scanner o = new Scanner(System.in);
		System.out.println("Enter number: ");
		n1 = o.nextInt();
		
		for(int i = 2; i < n1; i++)
		{
			// condition for non prime number
			if(n1%i == 0)
			{
				flag = true;
				break;
				
			}
		}
		
			if(!flag)
			
				System.out.printf(n1 +" is a prime number");
			

			else
				System.out.println(n1 +" is not a prime number");
	}


}
	