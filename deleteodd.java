import java.util.Scanner;

class deleteodd {

public static void main(String[] args)

{

int n;
int digit, o = 0, i = 1;
Scanner py = new Scanner(System.in);
System.out.println("Enter a number :");
n = py.nextInt();

while(n!=0)
{
    digit = n%10;
    n = n/10;
    if(digit % 2 == 0)
    {
        o = o + digit * i;
        i = i * 10;
    }
}
if(o == '\0')
System.out.println("All numbers were deleted !\n");
else
System.out.println(+o);

}

}
