// user defined exception


import java.util.Scanner;

 class exceptions2 extends Exception
{
	exceptions2(String S)
	{
   		super(S);
	}
	public static void main(String[] args)
	{
		try
		{
			String name[] = {"A","B","C"};
			int acc_no[] = {101,102,103};
			int bal[] = {1500,2000,700};
			for(int i = 0; i<3; i++)
			{
				System.out.println(name[i] +" "+acc_no[i]+" "+bal[i]);
				if(bal[i]<1000)
				{
					exceptions2 obj = new exceptions2("Balance is low");
					throw obj;
				}
			}
		}
		catch(exceptions2 me)
		{
			System.out.println(me);
		}
	}
}

