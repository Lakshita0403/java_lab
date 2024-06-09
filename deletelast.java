import java.util.Scanner;

class deletelast {

public static void main(String[] args)

{
int n, digit = 0,first_digit = 0;

Scanner h = new Scanner(System.in);
System.out.println("Enter the number:");
n = h.nextInt();
first_digit = n;

while(first_digit>=10)
{
    first_digit = first_digit/10;
}
System.out.println("the number after deletion of last digit is : " +first_digit);

}
}
