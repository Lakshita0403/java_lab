import java.util.Scanner;

public class lab {

	public static void main(String[] args)
	{
/*
int n,a;
Scanner p = new Scanner(System.in);
System.out.println("Enter a number:");
n = p.nextInt();  */

/*
if(n%2 == 0)
{
System.out.println("Number is even!");
}
else
{
System.out.println("Number is odd!");
}
*/

/*a = n%2;
switch(a)
{
case 0: System.out.println("Number is even!");
break;

case 1:System.out.println("Number is odd!");

break;

default: System.out.println("Invalid Input");

} */


/*for(int i = 1; i<101; i++)
{
System.out.println(i);
} */


int j = 0, k = 0;
int odd[] = new int[50];
int even[] = new int[50];


for(int i = 1; i<50; i++)
{
System.out.println(i);

if(i % 2 == 0)
{
even[j] = i;
j = j+1;

}


else
{
odd[k] = i;
k = k+1;
}

}
System.out.println("Number is odd!");

while(k>=0)
{
System.out.println(odd[k]);
k--;
}

System.out.println("Number is even!");

while(j>=0)
{
System.out.println(even[j]);
j--;
}
}
}